
package proeycto;

import java.awt.Color;
import java.awt.Image;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;


public class pacmanN  {
    
        JButton iniciar;
        JLabel fondoPresentacion;
        
        JFrame ventana;
        JPanel panelPresentacion;
        ImageIcon imagenFondoPres;
    
    public pacmanN(){
        
        ventana=new JFrame("pacman");
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setVisible(true);
        
        panelPresentacion=new JPanel();
        panelPresentacion.setLayout(null);
        panelPresentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        panelPresentacion.setVisible(true);
        
        ventana.add(panelPresentacion,-1);
        
        iniciar  = new JButton("iniciar");
        iniciar.setVisible(true);
        iniciar.setBounds(ventana.getWidth()-120,20,100,30);
        
        panelPresentacion.add(iniciar,0);
        
        
        fondoPresentacion = new JLabel();
        fondoPresentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        imagenFondoPres = new ImageIcon("imagenes/fondoPresentacion.png");
        imagenFondoPres = new ImageIcon(imagenFondoPres.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoPresentacion.setIcon(imagenFondoPres);
        fondoPresentacion.setVisible(true);
        
        panelPresentacion.add(fondoPresentacion,0);
        ventana.add(panelPresentacion);
        
        
        iniciar.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                
            }
    });
    }
    
    
}
