package br.ufrn.dimap.ppgsc.jri;


import java.awt.Canvas;
import java.util.HashMap;
import java.util.Map;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;

import br.ufrn.dimap.ppgsc.infra.Dados;
import br.ufrn.dimap.ppgsc.infra.Metricas;

public class Shewhart
{
   
   public static void gerarGraficoShewhart(double valor, Metricas tipoMetrica)
   {
	  REXP matrizNova = null; 
	  REXP matrizBase = null;
	  
	  Rengine r = RengineFactory.getRengine();
	  
      
	  if(tipoMetrica == Metricas.DESENVOLVIMENTO)
	  {
		  matrizBase = Dados.matrizDesenvolvimento;  
	  }
	  else 
	  {
		  matrizBase = Dados.matrizRequisitos; 
	  }
	  
	  Dados.valoresCapturados.add(valor);
	  double[] valores = new double[Dados.valoresCapturados.size()];
	  
	  for(int x = 0; x < Dados.valoresCapturados.size(); x++)
	  {
	     valores[x] = Dados.valoresCapturados.get(x);
	  }
	  
	  long xp_valores = r.rniPutDoubleArray(valores);
	  r.rniAssign("valores", xp_valores, 0);
	  
	  //matriz <- $matriz
	  long xp_matriz = matrizBase.xp;
      r.rniAssign("matriz", xp_matriz, 0);
      
      r.eval("qcc(matriz,\"xbar\",newdata=valores)");

      //TODO verificar como se converte um canvas para uma imagem
      Canvas canvas = (Canvas) CustomJavaGD.c;
      
      br.ufrn.dimap.ppgsc.infra.Utils.saveCanvasToImageFile(canvas);
   }
   
   public static Map<String,Double> recuperarValoresLimites(Metricas tipoMetrica)
   {
	  REXP expression = null;
	  
	  if(tipoMetrica == Metricas.DESENVOLVIMENTO)
	  {
         expression = Dados.qccDesenvolvimento;   	  
	  }
	  else
	  {
	     expression = Dados.qccRequisitos;	  
	  }
	  
	  Map<String,Double> limites = new HashMap<String,Double>(); 
	   
      Rengine r = RengineFactory.getRengine();
     
      //recuperando os limites
      long xp = expression.xp;
      r.rniAssign("object", xp, 0);
      expression = r.eval("object$limits");
      double[][] matrix = expression.asMatrix();
      double[] valores = matrix[0];
      
      if(valores[0] > valores[1])
      {
         limites.put("UCL", valores[0]);
         limites.put("LDL", valores[1]);
      }
      else
      {
         limites.put("UCL",valores[1]);
         limites.put("LDL",valores[0]);
      }
      
      return limites;
   }
   
   public static void main(String[] a)
   {
      Dados.iniciarDados();
   }
}
