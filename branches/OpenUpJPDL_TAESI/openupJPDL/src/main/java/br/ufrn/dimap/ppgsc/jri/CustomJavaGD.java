package br.ufrn.dimap.ppgsc.jri;

import javax.swing.JFrame;

import org.rosuda.javaGD.GDInterface;


public class CustomJavaGD extends GDInterface 
{
   public static CustomGDCanvas c;
   JFrame f = new JFrame("JavaGD");
   
   //metodo que deve ser sobrescrito para efetuar a exibicao do grafico.
   public void gdOpen(double w, double h)
   {
	  super.c = new CustomGDCanvas(w, h);
	  f.add((CustomGDCanvas) super.c);
	  f.pack();
	  
	  //atribuindo o canvas para uma referencia estatica, isso facilitara o acesso.
	  c = (CustomGDCanvas) super.c;
	  
	  /* o JFrame nao deve aparecer */
	  
	  f.setVisible(true);
	  f.setTitle("Classe customizavel para Plotar");
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }    
}
