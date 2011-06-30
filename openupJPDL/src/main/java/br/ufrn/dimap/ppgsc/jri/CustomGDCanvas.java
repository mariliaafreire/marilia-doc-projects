package br.ufrn.dimap.ppgsc.jri;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.peer.ComponentPeer;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.rosuda.javaGD.GDCanvas;
import org.rosuda.javaGD.GDObject;

import br.ufrn.dimap.ppgsc.infra.Utils;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class CustomGDCanvas extends GDCanvas
{  //Refresher r;
   //BufferedImage bfimage = new BufferedImage(this.getWidth(),this.getHeight(),BufferedImage.TYPE_INT_RGB);	
   //Graphics2D g2d2 = bfimage.createGraphics();	
	
   public CustomGDCanvas(double w, double h)
   {
      super(w,h);
      /*(new Refresher(this)).start();*/
   }       
   
   
   /*class Refresher extends Thread {
	   CustomGDCanvas c;
       boolean active;

       public Refresher(CustomGDCanvas c) {
           this.c=c;
       }

       public void run() {
           active=true;
           while (active) {
               try {
                   Thread.sleep(300);
               } catch (Exception e) {}
               if (!active) break;
               if (c.updatePending && (System.currentTimeMillis()-lastUpdate>200)) {
                   c.repaint();
                   active = false;
               }
           }
           c=null;
       }
   }*/
   
   /*public synchronized void paint(Graphics g)
   {
	   Graphics2D graphics2d = null;
	   
       g2d2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       
       updatePending = false;
       Dimension dimension = getSize();       
       
       if(!dimension.equals(lastSize))
       {
           initRefresh();
           lastSize = dimension;
           return;
       }
       
       if(forceAntiAliasing)
       {
           graphics2d = (Graphics2D)g;
           graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       }
       
       int i = 0;
       int j = l.size();
       g.setClip(0, 0, dimension.width, dimension.height);
       while(i < j) 
       {
           GDObject gdobject = (GDObject)l.elementAt(i++);
           gdobject.paint(this, gs, g);
           
           try
           {
              gdobject.paint(this, gs, (Graphics)g2d2);
           }
           catch(Exception e)
           {
              e.printStackTrace();
           }
           
       }
       
       try
       {
    	   File file = new File("C:\\Users\\Daniel\\shewhart.png");
    	   file.createNewFile();
    	   Utils.writeImageToJPG(file, bfimage);
    	   //BufferedOutputStream bos = new BufferedOutputStream
    	   //(new FileOutputStream("shewhart.jpg"));

           //buffImage.createGraphics().drawImage(buffImage, 0, 0, myFrame);
    	   //JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
    	   //encoder.encode(bfimage);
    	   //bos.close();
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
       
       lastUpdate = System.currentTimeMillis();
       
	   System.out.println("[criou imagem]");	   
   }*/
   
   
  /* public void update(Graphics g) {
       if (System.currentTimeMillis()-lastUpdate<200) {
           updatePending=true;
           if (System.currentTimeMillis()-lastUpdateFinished>700) {
               g.setColor(Color.white);
               g2d2.setColor(Color.white);
               g.fillRect(0,0,250,25);
               g2d2.fillRect(0,0,250,25);
               g.setColor(Color.blue);
               g2d2.setColor(Color.blue);
               g.drawString("Building plot... ("+l.size()+" objects)",10,10);
               lastUpdateFinished=System.currentTimeMillis();
               g2d2.drawString("Building plot... ("+l.size()+" objects)",10,10);
               lastUpdateFinished=System.currentTimeMillis();
           }
           lastUpdate=System.currentTimeMillis();
           return;
       }
       updatePending=false;
       paint(g);
       paint(g2d2);
       lastUpdateFinished=lastUpdate=System.currentTimeMillis();   
   }*/
   
   
   /*public synchronized void repaint(Graphics g)
   {
	   Graphics2D graphics2d = null;
	   
       g2d2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       
       updatePending = false;
       Dimension dimension = getSize();       
       
       if(!dimension.equals(lastSize))
       {
           initRefresh();
           lastSize = dimension;
           return;
       }
       
       if(forceAntiAliasing)
       {
           graphics2d = (Graphics2D)g;
           graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       }
       
       int i = 0;
       int j = l.size();
       g.setClip(0, 0, dimension.width, dimension.height);
       while(i < j) 
       {
           GDObject gdobject = (GDObject)l.elementAt(i++);
           gdobject.paint(this, gs, g);
           
           try
           {
              gdobject.paint(this, gs, (Graphics)g2d2);
           }
           catch(Exception e)
           {
              e.printStackTrace();
           }
           
       }
       
       try
       {
    	   File file = new File("C:\\Users\\Daniel\\shewhart.png");
    	   file.createNewFile();
    	   Utils.writeImageToJPG(file, bfimage);
    	   //BufferedOutputStream bos = new BufferedOutputStream
    	   //(new FileOutputStream("shewhart.jpg"));

           //buffImage.createGraphics().drawImage(buffImage, 0, 0, myFrame);
    	   //JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
    	   //encoder.encode(bfimage);
    	   //bos.close();
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
       
       lastUpdate = System.currentTimeMillis();
       
	   System.out.println("[criou imagem]");	   
   }
   
   
   //public void update(Graphics g) {
   //}

   public void paintAll(Graphics g) {

   }

   public void print(Graphics g) {}*/
   
}

