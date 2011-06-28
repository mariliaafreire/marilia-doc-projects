package br.ufrn.dimap.ppgsc.jri;


import java.awt.Canvas;
import java.util.HashMap;
import java.util.Map;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;

public class Shewhart
{
   
   public static void gerarGraficoShewhart()
   {
     
	  Rengine r = RengineFactory.getRengine();       
      
      //chamar as funcoes necessarias para gerar o grafico
      r.eval("library(qcc)");
      r.eval("data(pistonrings)");
      r.eval("attach(pistonrings)");
      
      //recuperando o valor de qcc.groups e adicionando na variavel diameter
      REXP expression = r.eval("qcc.groups(diameter,sample)");
      long diameter = expression.xp;
      
      //diameter <- $diameter
      r.rniAssign("diameter", diameter, 0);

      //chamando a geracao do grafico
      //r.eval("JavaGD(name='Grafico de Controle de Processo')");
      r.eval("qcc(diameter[1:25,],\"xbar\")");

      //TODO verificar como se converte um canvas para uma imagem
      Canvas canvas = (Canvas) CustomJavaGD.c;
      
      br.ufrn.dimap.ppgsc.infra.Utils.saveCanvasToImageFile(canvas);
   }
   
   public static Map<String,Double> recuperarValoresLimites()
   {
	  Map<String,Double> limites = new HashMap<String,Double>(); 
	   
      Rengine r = RengineFactory.getRengine();
      
      //criando os dados que servirao para calibrar nossa base
      r.eval("dados <- rnorm(400,12,2)");
      r.eval("dadosInteiros <- as.integer(dados)");
      r.eval("matriz <- matrix(dadosInteiros,ncol=4)");
      r.eval("library(qcc)");
      r.eval("object <- qcc(matriz[1:100,],\"xbar\")");
      REXP expression = r.eval("object$limits");
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
	   gerarGraficoShewhart();	   
   }
}
