package Instruciones_repetitivas2.raices_cuadradas;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args)
    {
        /*
         * declaracion
         * de
         * variables
         */
        double a;  
        double b;
        double c;
        double m;
        double v;
        double potencia;
    

        // input 
        a= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de a :"));
        b= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de b:"));
        c= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de c :"));



        // procesing
        if(((Math.pow(b, 2))-(4*a*c))<0){
                JOptionPane.showConfirmDialog(null, "El valor  es" +" de tipo imaginario");

            }else{
                potencia = Math.pow(b,2) -(4 * a * c);
                m =(-b+Math.sqrt(potencia)/2*a);
                v =(-b-Math.sqrt(potencia)/2*a);
                JOptionPane.showMessageDialog(null,"La raiz cuadrada es: " +m+"," + v);

            }
                
        }
    
    
}
