
package com.SnakeGame;

import javax.swing.JLabel;


/***
 * Crono class
 * @author Oscar Méndez
 * @version 1.1
 * @since 2020
 */
public class Crono extends Thread {
    
    JLabel eti;
    /***
     * Método Constructor 
     * @param label 
     */
    public Crono(JLabel label){
        this.eti = label;
        
    }
    /***
     * Método run
     * Se encarga de iniciar el hilo correspondiente al cronometro
     */
    @Override
    public void run(){
        try{
            
            while (PosicionesStart.iniciarHilo==true){
                Thread.sleep(1000);
                ejecutarcrono();
                
            }
        }catch(Exception e){
            System.out.println("Excepcion en el hilo: "+ e.getMessage());
        
        }
    
    }
    /***
     * Método ejecutarcrono
     * Se encarga de iniciar el crono y de finalizarlo al cumplirse 1 min
     */
    private void ejecutarcrono() {
       PosicionesStart.seg++;
       if (PosicionesStart.seg>59){
          PosicionesStart.seg = 0;
          
          PosicionesStart.setPuntaje();
          PosicionesStart.iniciarHilo = false;
          PosicionesStart.obj.setVisible(false);
          this.stop();
          
       }
        
       String min = "", seg = "", hora = "";
       if (PosicionesStart.seg<10){
           seg+="0"+PosicionesStart.seg;
       }else{
           seg+= PosicionesStart.seg;
       }
       
       
       String valor = "00"+":"+"00"+":"+seg;
       eti.setText(valor);
    }
    
}
