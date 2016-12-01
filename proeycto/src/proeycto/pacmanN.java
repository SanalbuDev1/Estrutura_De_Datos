
package proeycto;

import java.awt.Color;
import java.awt.Image;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;


import java.awt.Color;
import java.awt.Image;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;


public class pacmanN  {
    
    //atributos
        JFrame ventana;
    //presentacion
        JPanel panelPresentacion;
        JButton iniciar;
        JLabel fondoPresentacion;
        ImageIcon imagenFondoPres;
    //menu
        JPanel panelMenu;
        JButton botones[];
        JLabel fondoMenu;
        ImageIcon imagenFondoMenu;
    //juego
        
        JPanel panelJuego;
        JLabel fondoJuego;
        ImageIcon imagenFondoJuego;
        String jugador;
        int puntos;
        JLabel nombre;
        JLabel records;
        
        int mat[][];
        JLabel matriz[][];
    //pacman
        int px;
        int py;
        int abajo;
        int arriba;
        int izq;
        int der;
        Timer timer;
        
    //fantasma
        int fanx;
        int fany;
        
        
        
    
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
        
        panelPresentacion.add(iniciar,-1);
        
        
        fondoPresentacion = new JLabel();
        fondoPresentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        imagenFondoPres = new ImageIcon("imagenes/fondoPresentacion.jpg");
        imagenFondoPres = new ImageIcon(imagenFondoPres.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoPresentacion.setIcon(imagenFondoPres);
        fondoPresentacion.setVisible(true);
        
        panelPresentacion.add(fondoPresentacion,0);
        ventana.add(panelPresentacion);
        
        
        //menu
        botones=new JButton[2];
        for (int i = 0; i < botones.length; i++) {
            botones[i]=new JButton();
        }
        
        
        //JUEGO
        mat=new int[15][15];
        matriz=new JLabel[15][15];
        
        
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                matriz[i][j]=new JLabel();
            }
        }
        
        String numero=JOptionPane.showInputDialog(ventana,"un numero del 1 al 3");
        int numero1=Integer.parseInt(numero);
        mat=tablero(numero1);
        px=1;
        py=1;
        mat[px][py]=3;
        
        fanx=13;
        fany=13;
        mat[fanx][fany]=7;
        
        
        iniciar.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                menu();
                eventoMenu();
            }
    });
        
        
    }//fin contructor
        
        public void mover(){
            
           
            
           timer = new Timer (200, new ActionListener () 
        { 
            public void actionPerformed(ActionEvent e) 
            { 
              if( arriba == 1 && (mat[px][py-1]==1 || mat[px][py-1]==0)){
                   if(mat[px][py-1]==1){
                        puntos = puntos + 5;
                        records.setText("puntos " + puntos);
                    } 
                    mat[px][py] = 0;
                    py = py-1;
                    mat[px][py] = 3;
                    pintarmatriz();
                    
                               
              }
              if( abajo == 1 && (mat[px][py+1]==1 || mat[px][py+1]==0)){
                    if(mat[px][py+1]==1){
                        puntos = puntos + 5;
                        records.setText("puntos " + puntos);
                    } 
                    mat[px][py] = 0;
                    py = py+1;
                    mat[px][py] = 3;
                    pintarmatriz();
                    
                     
              }
              if( izq == 1 && (mat[px-1][py]==1 || mat[px-1][py]==0)){
                    if(mat[px-1][py]==1){
                        puntos = puntos + 5;
                        records.setText("puntos " + puntos);
                    }  
                    mat[px][py] = 0;
                    px = px-1;
                    mat[px][py] = 3;
                    pintarmatriz();
                   
                      
              }
              if( der == 1 && (mat[px+1][py]==1 || mat[px+1][py]==0)){
                   
                   if(mat[px+1][py]==1){
                        puntos = puntos + 5;
                        records.setText("puntos " + puntos);
                    } 
                    mat[px][py] = 0;
                    px = px+1;
                    mat[px][py] = 3;
                    pintarmatriz();
                    
                   
                   
              }
              int enc = 0;
                 for (int i = 0; i < mat.length && enc == 0; i++) {
                  for (int j = 0; j < mat.length  && enc == 0; j++) {
               if( mat[i][j] == 1 )
                   enc = 1;
            }           
        }
        if( enc == 0  ){
           JOptionPane.showMessageDialog(ventana, "ganoooooooo");
           timer.stop();
           timer.stop();
           panelJuego.setVisible(false);
           panelMenu.setVisible(true);
        } 
                            
        }});
        timer.start();
        ventana.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    System.out.println("tecla hacia arriba");
                    if(mat[px][py-1]==1 || mat[px][py-1]==0 ){
                        arriba = 1;
                        abajo = 0;
                        izq = 0;
                        der = 0;
                    }    
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    System.out.println("tecla hacia abajo");
                    if(mat[px][py+1]==1 || mat[px][py+1]==0 ){ 
                        arriba = 0;
                        abajo = 1;
                        izq = 0;
                        der = 0;
                    }    
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    System.out.println("tecla hacia izquierda");
                    if(mat[px-1][py]==1 || mat[px-1][py]==0 ){
                        arriba = 0;
                        abajo = 0;
                        izq = 1;
                        der = 0;
                    }    
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    System.out.println("tecla hacia derecha");
                    if(mat[px+1][py]==1 || mat[px+1][py]==0 ){
                        arriba = 0;
                        abajo = 0;
                        izq = 0;
                        der = 1;
                    }
                }

                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

                

                
            });
            
        }
        public void jugar(){
            panelMenu.setVisible(false);
            panelJuego=new JPanel();
            panelJuego.setLayout(null);
            panelJuego.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
            panelJuego.setVisible(true);
                       
            fondoJuego = new JLabel();
            fondoJuego.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
            imagenFondoJuego = new ImageIcon("imagenes/fondoJugar.png");
            imagenFondoJuego= new ImageIcon(imagenFondoJuego.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
            fondoJuego.setIcon(imagenFondoJuego);
            fondoJuego.setVisible(true);
            panelJuego.add(fondoJuego,0);   
            
            
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    matriz[i][j].setBounds(120+(i*30), 120+(j*30), 30, 30);
                    matriz[i][j].setIcon(new ImageIcon("imagenes/"+mat[i][j]+".png"));
                    matriz[i][j].setVisible(true);
                   
                    panelJuego.add(matriz[i][j],0);;
                    
                    
                }
            }
            
            nombre=new JLabel("Jugador " + jugador);
            nombre.setBounds(20,20,150,30);
            nombre.setForeground(Color.white);
            nombre.setVisible(true);
            panelJuego.add(nombre,0);
            
            records=new JLabel("puntos");
            puntos=0;
            records.setVisible(true);
            records.setBounds(ventana.getWidth()-(150+20), 20, 200, 30);
            records.setForeground(Color.red);
            panelJuego.add(records,0);
            mover();
            ventana.add(panelJuego);
        }
        
        public void pintarmatriz(){
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    matriz[i][j].setBounds(120+(i*30), 120+(j*30), 30, 30);
                    matriz[i][j].setIcon(new ImageIcon("imagenes/"+mat[i][j]+".png"));
                    matriz[i][j].setVisible(true);
                   
                    panelJuego.add(matriz[i][j],0);;
                    
                    
                }
            }
        }
        
        public int[][] tablero( int opcion ){
        
        int aux1 [][]= new int[15][15];
        if( opcion == 1 ){
            int aux[][] = {
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                    {2,1,1,1,1,1,1,2,1,1,1,1,1,1,2},
                    {2,1,2,2,1,2,1,2,1,2,2,1,2,1,2},
                    {2,1,2,1,1,2,1,1,1,1,2,1,2,1,2},
                    {2,1,1,1,2,2,2,1,2,1,1,1,1,1,2},
                    {2,1,2,1,1,1,1,1,2,2,2,1,2,2,2},
                    {2,1,2,2,1,2,2,1,1,2,2,1,1,1,2},
                    {2,1,1,1,1,1,2,2,1,1,1,1,2,1,2},
                    {2,2,2,1,2,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,1,2,1,1,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,2,1,1,1,1,1,2,1,2},
                    {2,1,2,1,2,1,2,1,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                  };
            return aux;
        }
        if( opcion == 2 ){
            int aux[][] = {
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                    {2,1,1,1,1,1,1,2,1,1,1,1,1,1,2},
                    {2,1,2,2,1,2,1,2,1,2,2,1,2,1,2},
                    {2,1,2,1,1,2,1,1,1,1,2,1,2,1,2},
                    {2,1,1,1,2,2,2,1,2,1,1,1,1,1,2},
                    {2,1,2,1,1,1,1,1,2,2,2,1,2,2,2},
                    {2,1,2,2,1,2,2,1,1,2,2,1,1,1,2},
                    {2,1,1,1,1,1,2,2,1,1,1,1,2,1,2},
                    {2,2,2,1,2,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,1,2,1,1,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,2,1,1,1,1,1,2,1,2},
                    {2,1,2,1,2,1,2,1,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                  };
            return aux;
        }
        if( opcion == 3 ){
            int aux[][] = {
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                    {2,1,2,1,1,2,1,1,1,1,2,1,2,1,2},
                    {2,1,1,1,2,2,2,1,2,1,1,1,1,1,2},
                    {2,1,2,1,1,1,1,1,2,2,2,1,2,2,2},
                    {2,1,2,2,1,2,2,1,1,2,2,1,1,1,2},
                    {2,1,1,1,1,1,2,2,1,1,1,1,2,1,2},
                    {2,2,2,1,2,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,1,2,1,1,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,2,1,1,1,1,1,2,1,2},
                    {2,1,2,1,2,1,2,1,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                  };
            return aux;
        }
        return aux1;
    }//fin tablero
        public void menu(){
        
        
        panelPresentacion.setVisible(false);
        panelMenu=new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        panelMenu.setVisible(true);
                       
        fondoMenu = new JLabel();
        fondoMenu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        imagenFondoMenu = new ImageIcon("imagenes/fondoMenu.jpg");
        imagenFondoMenu = new ImageIcon(imagenFondoMenu.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoMenu.setIcon(imagenFondoMenu);
        fondoMenu.setVisible(true);
        panelMenu.add(fondoMenu,0);
        
        botones[0].setText("jugar");
        botones[1].setText("salir");
      
        
        for (int i = 0; i < botones.length; i++) {
            botones[i].setBounds(ventana.getWidth()-(200+50),(i+1)*50,200,40);
            botones[i].setVisible(true);
            botones[i].setBackground(Color.white);
            panelMenu.add(botones[i],0);
        }
        ventana.add(panelMenu);
    }
    public void eventoMenu(){
        //jugar
        botones[0].addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                jugador=JOptionPane.showInputDialog(ventana,"NOMBRE DEL JUGADOR","escribe aqui");
                jugar();
               
                while(jugador==null || jugador.compareTo("escribe aqui")==0 || jugador.compareTo("")==0){
                    jugador=JOptionPane.showInputDialog(ventana,"NOMBRE DEL JUGADOR","escribe aqui");
                }
            }
    });
        botones[1].addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
               System.exit(0);
                
            }
    });
        
    
    }
    
}

class Principal1 {
    
    public static void main(String[] args) {
        
        pacmanN ob = new pacmanN();
        
        
        
    }
    
}

class Principal1 {
    
    public static void main(String[] args) {
        
        pacmanN ob = new pacmanN();
        
        
        
    }
    
}
