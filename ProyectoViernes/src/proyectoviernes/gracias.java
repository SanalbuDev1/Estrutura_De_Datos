/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoviernes;


import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Santy
 */
public class gracias extends JFrame {
     public static void main(String[] args) {
        gracias ca = new gracias();
        
        
    }
     public gracias(){
        setTitle("gracias");
        setBounds(100, 100, 500, 500);
        Dibujando ca1=new Dibujando();
        setBackground(new Color(255,0,0));
        add(ca1);
        setVisible(true);
    }
   
}
class Dibujando extends JPanel{
    private Image imagen;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Font mifuente=new Font("Arial", Font.BOLD,26);
        g.setFont(mifuente);
        g.drawString("Trabajo hecho por Santiago Alvarez", 10, 30);
        g.drawString("y Ricardo", 10, 50);
        
         
        
         
         try{
        imagen=ImageIO.read(new File("java.png"));
        }catch(IOException e){
            System.out.println("no se encontro la imagen");
        }
         g.drawImage(imagen, 100, 150, null);
    }
}
