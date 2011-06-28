package br.ufrn.dimap.ppgsc.infra;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public final class Utils 
{
   private Utils(){}
   
   public static void saveCanvasToImageFile(Canvas canvas)
   {
	   Frame myFrame = null;
	   
	   try
	   {
		  myFrame = new Frame();
		  myFrame.add(canvas);
		  
	      BufferedImage buffImage = new BufferedImage(canvas.getWidth(),
			      canvas.getHeight(),BufferedImage.TYPE_INT_RGB);
	      
	      BufferedOutputStream bos = new BufferedOutputStream
	              (new FileOutputStream("shewhart.jpg"));
	   
	      buffImage.createGraphics().drawImage(buffImage, 0, 0, myFrame);
	      JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
	      encoder.encode(buffImage);
	      
	      Toolkit tk = Toolkit.getDefaultToolkit();
	      Image i = tk.getImage("shewhart.jpg");
	      MediaTracker mt = new MediaTracker( myFrame );
	      mt.addImage(i, 0);
	      mt.waitForAll();
	   }
	   catch(Exception e)
	   {
	      e.printStackTrace();	   
	   }
   } 
}
