
package com.mycompany.suikagame;

//PlayManager dibujar contenedor, mover piezas, fusionar piezas, mostrar puntaje y movimiento

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class ManejadorJuego {
    //Area de juego
    final int ancho = 360;
    final int largo = 600;
    public static int leftX;
    public static int rightX;
    public static int topY;
    public static int bottomY;
    
    public ManejadorJuego() {
        //Area de juego frame
        leftX = (PanelJuego.ancho/2) - (ancho/2);
        rightX = leftX + ancho;
        topY= 50;
        bottomY = topY + largo;
        
    }
    
    public void update() {
        
    }
    
    public void draw(Graphics2D F2){
        //Dibujando el frame del area de juego
        F2.setColor(Color.red);
        F2.setStroke(new BasicStroke(5F));
        F2.drawRect(leftX-4, topY-4, ancho+8, largo+8);
    }
}
