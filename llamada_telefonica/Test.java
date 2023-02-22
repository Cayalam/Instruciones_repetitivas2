package Instruciones_repetitivas2.llamada_telefonica;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args)
    {
        /*
         * declaracion
         * de
         * variables
         */
        int x;
        int y;
        int z;
    

        // input 
        x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos de la llamada:"));
        



        // procesing
        if(x<=3){
            y= 300;
            }else{
                z= x-3;
                y= 300+(z*50);

            }
            JOptionPane.showMessageDialog(null, "El precio a pagar es:" +y);


        
        }

    
}
