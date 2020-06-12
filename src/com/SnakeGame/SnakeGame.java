
package com.SnakeGame;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

 
public class SnakeGame extends JPanel implements KeyListener, ActionListener{
    //ATRIBUTOS E INSTANCIAS//
    private int[] longitudX = new int[70];
    private int[] longitudY = new int [70];
    private boolean izquierda = false;
    private boolean derecha = false;
    private boolean arriba = false;
    private boolean abajo = false;   
    private ImageIcon snakeDerecha;
    private ImageIcon snakeArriba;
    private ImageIcon snakeAbajo;
    private ImageIcon snakeIzquierda;
    private ImageIcon snakeBody;
    private ImageIcon food; 
    private int longitudinicial = 3;
    private Timer timer;
    private int delay = 100;
    private Random random = new Random();
    private int movimientos = 0;
    private int posX = getNumberX(33);
    private int posY = getNumberY(22);
    static int puntaje;
   

    public SnakeGame() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
        
    }
    
    @Override
    public void paint (Graphics pantalla){
        
        if (movimientos == 0){
            longitudX[2] = 50;
            longitudX[1] = 75;
            longitudX[0] = 100;
            
            longitudY[2] = 100;
            longitudY[1] = 100;
            longitudY[0] = 100;
            

        }

        pantalla.setColor(Color.RED);
        pantalla.drawRect(24, 74, 851, 577);
        
        pantalla.setColor(Color.BLACK);
        pantalla.fillRect(25, 75, 850, 575);
        
        
        snakeDerecha = new ImageIcon("derecha.png");
        snakeDerecha.paintIcon(this, pantalla, longitudX[0],longitudY[0]);
        
        for (int i = 0; i<longitudinicial; i++){
            
            if (i == 0 && derecha){
                snakeDerecha = new ImageIcon("derecha.png");
                snakeDerecha.paintIcon(this, pantalla, longitudX[i],longitudY[i]);
            }
            if (i == 0 && izquierda){
                snakeIzquierda = new ImageIcon("izquierda.png");
                snakeIzquierda.paintIcon(this, pantalla, longitudX[i],longitudY[i]);
            }
            if (i == 0 && arriba){
                snakeArriba = new ImageIcon("arriba.png");
                snakeArriba.paintIcon(this, pantalla, longitudX[i],longitudY[i]);
            }
            if (i == 0 && abajo){
                snakeAbajo = new ImageIcon("abajo.png");
                snakeAbajo.paintIcon(this, pantalla, longitudX[i],longitudY[i]);
            }
            if (i!=0){
                snakeBody = new ImageIcon("cuerpo.png");
                snakeBody.paintIcon(this, pantalla, longitudX[i],longitudY[i]);
            }
        }
        
        food = new ImageIcon("comida.png");
        if (posX==longitudX[0] && posY==longitudY[0]){
            longitudinicial+=1;
            posX = getNumberX(33);
            posY = getNumberY(22);
            puntaje++;
            
        }

        food.paintIcon(this, pantalla, posX, posY);
        
        pantalla.dispose();
        
    }



    @Override
    public void keyPressed(KeyEvent e) {
        
       if (e.getKeyCode() == KeyEvent.VK_D){
          
           movimientos++;
           derecha = true;
           if (!izquierda){
               derecha = true;
           }else{
               derecha = false;
               izquierda = true;
           }
           
           arriba = false;
           abajo = false;
           
       }
       if (e.getKeyCode() == KeyEvent.VK_A){
          
           movimientos++;
           izquierda = true;
           if (!derecha){
               izquierda = true;
           }else{
               izquierda = false;
               derecha = true;
           }
           
           arriba = false;
           abajo = false;
           
       }
       if (e.getKeyCode() == KeyEvent.VK_W){
          
           movimientos++;
           arriba = true;
           if (!abajo){
               arriba = true;
           }else{
               arriba = false;
               abajo = true;
           }
           
           izquierda = false;
           derecha = false;
           
       }
       if (e.getKeyCode() == KeyEvent.VK_S){
          
           movimientos++;
           abajo = true;
           if (!arriba){
               abajo = true;
           }else{
               abajo = false;
               arriba = true;
           }
           
           izquierda = false;
           derecha = false;
           
       }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (derecha==true ){
            for (int i = longitudinicial; i>=0; i--){
                
                longitudY[i+1] = longitudY[i];
            }
            for (int i = longitudinicial; i>=0; i--){
                
                if (i == 0){
                    
                    longitudX[i]=longitudX[i]+25;
                    
                }else{
                    
                    longitudX[i]=longitudX[i-1];
                    
                }
                
                if (longitudX[i] > 850){
                    longitudX[i] = 25;
                    
                }
                
                repaint();
            }
            
        }
        if (izquierda==true ){
            for (int i = longitudinicial; i>=0; i--){
                
                longitudY[i+1] = longitudY[i];
            }
            for (int i = longitudinicial; i>=0; i--){
                
                if (i == 0){
                    
                    longitudX[i]=longitudX[i]-25;
                    
                }else{
                    
                    longitudX[i]=longitudX[i-1];
                    
                }
                
                if (longitudX[i] < 25){
                    longitudX[i] = 850;
                    
                }
                
                repaint();
            }
        }
        if (arriba==true ){
            for (int i = longitudinicial; i>=0; i--){
                
                longitudX[i+1] = longitudX[i];
            }
            for (int i = longitudinicial; i>=0; i--){
                
                if (i == 0){
                    
                    longitudY[i]=longitudY[i]-25;
                    
                }else{
                    
                    longitudY[i]=longitudY[i-1];
                    
                }
                
                if (longitudY[i] < 75){
                    longitudY[i] = 625;
                    
                }
                
                repaint();
            }
        }
        if (abajo==true ){
            for (int i = longitudinicial; i>=0; i--){
                
                longitudX[i+1] = longitudX[i];
            }
            for (int i = longitudinicial; i>=0; i--){
                
                if (i == 0){
                    
                    longitudY[i]=longitudY[i]+25;
                    
                }else{
                    
                    longitudY[i]=longitudY[i-1];
                    
                }
                
                if (longitudY[i] > 625){
                    longitudY[i] = 75;
                    
                }
                
                repaint();
            }
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    private int getNumberX(int num) {
	Random r = new Random();
        int valor = r.nextInt(num);
        while (valor == 0){
            valor = r.nextInt(num);
        }
	return 25 * valor;
}
    private int getNumberY(int num) {
	Random r = new Random();
        int valor = r.nextInt(num);
        while (valor == 0){
            valor = r.nextInt(num);
        }
	return 100+(25 * valor);
}
}
