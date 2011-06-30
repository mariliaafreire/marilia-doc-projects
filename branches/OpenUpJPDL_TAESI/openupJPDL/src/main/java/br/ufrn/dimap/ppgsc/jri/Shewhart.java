package br.ufrn.dimap.ppgsc.jri;


import java.awt.Canvas;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;

import br.ufrn.dimap.ppgsc.infra.Dados;
import br.ufrn.dimap.ppgsc.infra.Metricas;

public class Shewhart
{
   
   public static void gerarGraficoShewhart(double valor, Metricas tipoMetrica)
   {
	  Rengine r = RengineFactory.getRengine();
	  
	  if(tipoMetrica == Metricas.DESENVOLVIMENTO)
	  {
		  //REXP matrizBase_dev = Dados.matrizDesenvolvimento;
		  List<Double> listValoresDev = Dados.valoresCapturadosDesenvolvimento;
		  
		  //System.out.println("[MatrizDesenvolvimento]: " + listValoresDev);
		  System.out.println("[ValoresNovosDesenvolvimento]: " + listValoresDev);
		  
		  listValoresDev.add(valor);
		  double[] valores_dev = new double[listValoresDev.size()];
		  
		  for(int x = 0; x < listValoresDev.size(); x++)
		  {
			  valores_dev[x] = listValoresDev.get(x);
		  }
		  
		  long xp_valores_dev = r.rniPutDoubleArray(valores_dev);
		  r.rniAssign("valoresDev", xp_valores_dev, 0);
		  
		  //matriz <- $matriz
		  // long xp_matriz_dev = matrizBase_dev.xp;
		  //r.rniAssign("matrizDev", xp_matriz_dev, 0);
	      
	      r.eval("qcc(matrizDesenvolvimento,\"xbar\",newdata=valoresDev)");

	  }
	  else if (tipoMetrica == Metricas.REQUISITOS) 
	  {
		  //REXP matrizBase_req = Dados.matrizRequisitos;
		  List<Double> listValoresReq = Dados.valoresCapturadosRequisitos;
		  
		  //System.out.println("[MatrizRequisitos]: " + matrizBase_req);
		  System.out.println("[ValoresNovosRequisitos]: " + listValoresReq);
		  
		  listValoresReq.add(valor);
		  double[] valores_req = new double[listValoresReq.size()];
		  
		  for(int x = 0; x < listValoresReq.size(); x++)
		  {
			  valores_req[x] = listValoresReq.get(x);
		  }
		  
		  long xp_valores_req = r.rniPutDoubleArray(valores_req);
		  r.rniAssign("valoresReq", xp_valores_req, 0);
		  
		  //matriz <- $matriz
		  //long xp_matriz_req = matrizBase_req.xp;
		  //r.rniAssign("matrizReq", xp_matriz_req, 0);
	      
	      r.eval("qcc(matrizRequisitos,\"xbar\",newdata=valoresReq)");

	  }
	  else
	  {
		  System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO =D");
	  }
	  
      //TODO verificar como se converte um canvas para uma imagem
      //Canvas canvas = (Canvas) CustomJavaGD.c;
      //br.ufrn.dimap.ppgsc.infra.Utils.saveCanvasToImageFile(canvas);
   }
   
   public static Map<String,Double> recuperarValoresLimites(Metricas tipoMetrica)
   {
	  Rengine r = null;
	  
	  if(tipoMetrica == Metricas.DESENVOLVIMENTO)
	  {
		 REXP expression_dev = Dados.qccDesenvolvimento;  
         System.out.println("[QccDesenvolvimento]: " + expression_dev);
         
         Map<String,Double> limitesDev = new HashMap<String,Double>(); 
         //String objectDesenvolvimento = String.valueOf("m"+Math.random());
  	     
         //System.out.println("[limit_to_string]" + objectDesenvolvimento);
         
         
         r = RengineFactory.getRengine();
        
         //recuperando os limites
         long xp_dev = expression_dev.xp;

         System.out.println("[Valor do XP]: " + xp_dev);
         
         //r.rniAssign(objectDesenvolvimento, xp_dev, 0);
         
         //REXP eval_objectDesenvolvimento = r.eval(objectDesenvolvimento);
	     
         //System.out.println("\n###################EVAL###################### " + eval_objectDesenvolvimento);
         
         REXP xp_limites_desenvolvimento = r.eval("qccDesenvolvimento$limits");
         
         System.out.println("\n###################EXPRESSION###################### " + xp_limites_desenvolvimento);
         
         double[][] matrix = xp_limites_desenvolvimento.asMatrix();
         
         System.out.println("\n###Matriz com os Limites do Desenvolvimento### " + matrix);
         
         double[] valores = matrix[0];
         
         if(valores[0] > valores[1])
         {
        	 limitesDev.put("UCL", valores[0]);
        	 limitesDev.put("LDL", valores[1]);
         }
         else
         {
        	 limitesDev.put("UCL",valores[1]);
        	 limitesDev.put("LDL",valores[0]);
         }
         return limitesDev;
	  }
	  else if (tipoMetrica == Metricas.REQUISITOS)
	  {
	     REXP expression_req = Dados.qccRequisitos;
	     System.out.println("[QccRequisitos]: " + expression_req);
	     
	     Map<String,Double> limitesReq = new HashMap<String,Double>();
	     //String objectRequisitos = String.valueOf("m"+Math.random());
	     
	     // System.out.println("[limit_to_string]" + objectRequisitos);
		   
	     r = RengineFactory.getRengine();
	     
	     //recuperando os limites
	     long xp_req = expression_req.xp;

	     System.out.println("[Valor do XP]: " + xp_req);
	      
	     //r.rniAssign(objectRequisitos, xp_req, 0);
	     
	     //REXP eval_objectRequisitos = r.eval(objectRequisitos);
	     
	     //System.out.println("\n###################EVAL###################### " + eval_objectRequisitos);
	     
	     REXP xp_limites_requisitos = r.eval("qccRequisitos$limits");
	     
	     System.out.println("\n###################EXPRESSION###################### " + xp_limites_requisitos);
	     
	     double[][] matrix = xp_limites_requisitos.asMatrix();
	     
	     System.out.println("\n###Matriz com os Limites do Requisitos### " + matrix);
	     
	     double[] valores = matrix[0];
	     
	      if(valores[0] > valores[1])
	      {
	    	  limitesReq.put("UCL", valores[0]);
	    	  limitesReq.put("LDL", valores[1]);
	      }
	      else
	      {
	    	  limitesReq.put("UCL",valores[1]);
	    	  limitesReq.put("LDL",valores[0]);
	      }
	      return limitesReq;
	  }
	  else
	  {
		 System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO =D"); 
	  }
	  
	  return null;
   }
   
   public static void main(String[] a)
   {
      Dados.iniciarDados();
      gerarGraficoShewhart(2.0, Metricas.DESENVOLVIMENTO);
   }
}
