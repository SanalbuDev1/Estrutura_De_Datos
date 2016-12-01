/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelgato;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Santy
 */
public class Gato extends JFrame implements ActionListener {
    
    
    
    public Gato(){
        
       
        
        
        this.setLayout(null);
        mensaje= new JLabel("Bienvenidos al juego");
        mensaje.setBounds(200, 40, 200, 30);
        this.add(mensaje);
        iniciar=new JButton("Iniciar Tricky");
        iniciar.setBounds(160,420, 200, 30);
        iniciar.addActionListener(this);
        this.add(iniciar);
        tablero=new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]=new JButton();
                tablero[i][j].setBounds((i+1)*100,(j+1)*100,100,100);
                this.add(tablero[i][j]);
                tablero[i][j].addActionListener(this);
            }
        }
       
        puntaje1=new JLabel("puntaje Jugador1");
        puntaje1.setBounds(10,10,180,50);
        this.add(puntaje1);
        puntaje2=new JLabel("puntaje Jugador2");
        puntaje2.setBounds(10,30,180,50);
        this.add(puntaje2);
        colorB=tablero[0][0].getBackground();
        
        
   
    }
          
    
    public static void main(String[] args) {
        Gato ventana = new Gato();
        ventana.setTitle("Uniremington Manizales");
        ventana.setSize(500,550);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(true);
        ventana.setVisible(true);
       
        
        
        
        
        
        
    }
    JButton iniciar;
    JButton tablero[][];
    String jugador1,jugador2;
    int turno=-1;
    JLabel mensaje;
    Color colorB;
    JLabel puntaje1;
    JLabel puntaje2;
    int contador1=0;
    int contador2=0;
    int contador4=0;

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==iniciar){
            turno=0;
            JOptionPane.showMessageDialog(this,"iniciando el juego");
            jugador1=JOptionPane.showInputDialog("Escriba el nombre del primer jugador");
            jugador2=JOptionPane.showInputDialog(this,"Escriba el nombre del siguiente del jugador");
            mensaje.setText("turno del jugador"+ jugador1);
            limpiar();
        }else{
            JButton boton = (JButton) e.getSource();
            if(turno==0){
                if(boton.getText().equals("")){
                    boton.setBackground(Color.yellow);
                    
                    
                    boton.setText("X");
                    boton.setEnabled(false);
                    turno=1;
                    mensaje.setText("Turno del jugador" + jugador2);
                    
                }
            }else{
                if(turno==1){
                if(boton.getText().equals("")){
                    boton.setBackground(Color.BLUE);
                    boton.setText("O");
                    boton.setEnabled(false);
                    turno=0;
                    mensaje.setText("Turno del jugador" + jugador1);
                    
                    }
                 }
            }
            verificar();
        }   
    }
    
    
    public void verificar(){
        int ganador=3;
        
        for (int i = 0; i < 3; i++) {
            
                if(tablero[0][i].getText().equals("X") && tablero[1][i].getText().equals("X")&& tablero[2][i].getText().equals("X")){
                    ganador=1;
                }
                 if(tablero[i][0].getText().equals("X") && tablero[i][1].getText().equals("X")&& tablero[i][2].getText().equals("X")){
                    ganador=1;
                }
                 if(tablero[i][0].getText().equals("O") && tablero[i][1].getText().equals("O")&& tablero[i][2].getText().equals("O")){
                    ganador=0;
                }
                 if(tablero[0][i].getText().equals("O") && tablero[1][i].getText().equals("O")&& tablero[2][i].getText().equals("O")){
                    ganador=0;
                }
                 if(tablero[0][0].getText().equals("X") && tablero[1][1].getText().equals("X")&& tablero[2][2].getText().equals("X")){
                    ganador=1;
                }
                 if(tablero[0][0].getText().equals("O") && tablero[1][1].getText().equals("O")&& tablero[2][2].getText().equals("O")){
                    ganador=0;
                }
                 if(tablero[0][2].getText().equals("X") && tablero[1][1].getText().equals("X")&& tablero[2][0].getText().equals("X")){
                    ganador=1;
                }
                 if(tablero[0][2].getText().equals("O") && tablero[1][1].getText().equals("O")&& tablero[2][0].getText().equals("O")){
                    ganador=0;
                }
                
                if(ganador==1){
                    JOptionPane.showMessageDialog(null, "el ganador es " + jugador1);
                    bloquear1();
                    contador1=contador1+1;
                    System.out.println(contador1+"1");
                    puntaje1.setText("Puntaje Jugador 1 : "+contador1);
                    break;
                
                }
                if(ganador==0){
                    JOptionPane.showMessageDialog(null, "el ganador es " + jugador2);
                    
                    bloquear1();
                    contador2=contador2+1;
                    System.out.println(contador2+"2");
                    puntaje2.setText("Puntaje Jugador 2 : "+contador2);
                    break;
                
                }
                contador4=contador4+1;
                System.out.println(contador4);
                
                if(contador4==27){
                    JOptionPane.showMessageDialog(null, "No hubo ganador");
                    contador4=0;
                }
        }
    }
    
    public void bloquear1(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setEnabled(false);
            }
        }
    }
    public void limpiar(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setEnabled(true);
                tablero[i][j].setText("");
                tablero[i][j].setBackground(colorB);
                contador4=0;
            }
        }
    }
}

class lamina23 extends JPanel{
     public void paintComponent(Graphics g){
         super.paintComponent(g);
         
         Color color=new Color(0,0,0);
         g.setColor(color);
         g.drawString("hola", 80, 20);
         setVisible(true);
     }
}
