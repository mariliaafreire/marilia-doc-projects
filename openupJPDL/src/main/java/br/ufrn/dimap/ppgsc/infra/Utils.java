package br.ufrn.dimap.ppgsc.infra;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public final class Utils 
{
   private Utils(){}
   
   public static void saveCanvasToImageFile(Canvas canvas)
   {
	   System.out.println("[INICIO CriacaoJPG]");
	   Frame myFrame = null;
	   
	   try
	   {
		   
		  BufferedImage image = (BufferedImage) canvas.createImage(canvas.getWidth(), canvas.getHeight()); 
		  image.getGraphics();
		  
		  //myFrame = new Frame();
		  //myFrame.add(canvas);
		  
		  //BufferedImage buffImage = new BufferedImage(canvas.getWidth(),
		  //      canvas.getHeight(),BufferedImage.TYPE_INT_RGB);
	      
	      BufferedOutputStream bos = new BufferedOutputStream
	              (new FileOutputStream("shewhart.jpg"));
	   
	      //buffImage.createGraphics().drawImage(buffImage, 0, 0, myFrame);
	      JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
	      encoder.encode(image);
	      
	      
	      //Toolkit tk = Toolkit.getDefaultToolkit();
	      //Image i = tk.getImage("shewhart.jpg");
	      //MediaTracker mt = new MediaTracker( myFrame );
	      //mt.addImage(i, 0);
	      //mt.waitForAll();
	      
	      //Graphics canGraphic = canvas.getGraphics();
	      //canGraphic.drawImage(i, 0, 0,myFrame);
	      //myFrame.repaint();
	      
	      //bos.flush();
	      bos.close();
	      //buffImage.flush();
	   }
	   catch(Exception e)
	   {
	      e.printStackTrace();	   
	   }
	   System.out.println("[FIM CriacaoJPG]");
   } 
   
   public static BufferedImage readImageFromFile(File file) 
   throws IOException
   {
	   return ImageIO.read(file);
   }

   public static void writeImageToJPG (File file,BufferedImage bufferedImage) 
   throws IOException
   {
	   ImageIO.write(bufferedImage,"jpg",file);
   }
}
