package br.ufrn.dimap.ppgsc.infra;

import java.util.ArrayList;
import java.util.List;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;

import br.ufrn.dimap.ppgsc.jri.RengineFactory;

public final class Dados 
{
   public static List<Double> valoresCapturados = new ArrayList<Double>();
   	
   public static REXP matrizDesenvolvimento;	
   public static REXP qccDesenvolvimento;
   public static REXP qccRequisitos;
   public static REXP matrizRequisitos;
	
   private Dados()
   { 	   
   }
   
   //metodo responsavel por iniciar os dados utilizados na calibragem
   //depois deve-se retirar isso, pois deve-se implementar a captura dos dados
   //de calibragem externamente.
   public static void iniciarDados()
   {
      Rengine r = RengineFactory.getRengine();
      
    System.out.println("[Imprimindo o Engine do R]-> " + r.toString());  
      
    //criando os dados que servirao para calibrar nossa base, depois deve-se mudar para 
    //pegar estes dados de uma base externa, como a aplicacao
    r.eval("dados <- rnorm(400,12,2)");
    r.eval("dadosInteiros <- as.integer(dados)");
    matrizDesenvolvimento = r.eval("matrix(dadosInteiros,ncol=4)");
    
    System.out.println("[matrizDesenvolvimento]-> " + matrizDesenvolvimento);
    
    long xp_matrizDesenvolvimento = matrizDesenvolvimento.xp;
    r.rniAssign("matrizDesenvolvimento", xp_matrizDesenvolvimento, 0);
    r.eval("library(qcc)");
    qccDesenvolvimento = r.eval("qcc(matrizDesenvolvimento[1:100,],\"xbar\")");
    
    System.out.println("[qccDesenvolvimento]-> " + qccDesenvolvimento);
    
    //criando os dados que servirao para calibrar nossa base, depois deve-se mudar para 
    //pegar estes dados de uma base externa, como a aplicacao
    r.eval("dados <- rnorm(400,12,2)");
    r.eval("dadosInteiros <- as.integer(dados)");
    matrizRequisitos = r.eval("matrix(dadosInteiros,ncol=4)");
    
    System.out.println("[matrizRequisitos]-> " + matrizRequisitos);
    
    long xp_matrizRequisitos = matrizRequisitos.xp;
    r.rniAssign("matrizRequisitos", xp_matrizRequisitos, 0);
    r.eval("library(qcc)");
    qccRequisitos = r.eval("qcc(matrizRequisitos[1:100,],\"xbar\")");
      
    System.out.println("[qccRequisitos]-> " + qccRequisitos);
   }
}
