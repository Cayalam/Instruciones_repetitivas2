package Instruciones_repetitivas2.mayor_3.ejecutable;

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
        x= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero:"));
        y= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero:"));
        z= Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero:"));



        // procesing
        if(x>y){
            if(x>z){
                JOptionPane.showConfirmDialog(null, "El numero mayor es" +x);

            }else
                JOptionPane.showConfirmDialog(null, "El numero mayor es" +z);
            }else if(y>z){
                JOptionPane.showConfirmDialog(null, "El numero mayor es" +y);


            }else{
                JOptionPane.showConfirmDialog(null, "El numero mayor es" +z);
            }
        }

    }

    
        


