package br.ufrn.dimap.ppgsc.jri;

import org.rosuda.JRI.Rengine;

public class RengineFactory 
{
   private static Rengine r_engine;	
	
   public static Rengine getRengine()
   {
      if(r_engine == null)
      {
    	  //1 - chamando o R
    	  r_engine = new Rengine(new String[]{"--vanilla"}, false, new TextConsole());
        
          //A engine do R e criada em uma nova thread, portanto, deve-se esperar ate que ela
          //esteja preparada
          if(!r_engine.waitForR())
          {
             System.out.println("Problemas ao realizar o load do R");
          }	  
          
          //2 - configurando o JavaGD()
          //informo qual a classe que devera tratar o objeto retornado pelo comando JavaGD()
          r_engine.eval("Sys.putenv('JAVAGD_CLASS_NAME'='br/ufrn/dimap/ppgsc/jri/CustomJavaGD')");
          r_engine.eval("library(JavaGD)");
          r_engine.eval("JavaGD()");
      }
      else
      {
         return r_engine;	  	  
      }
      
      return r_engine;
   }
}
