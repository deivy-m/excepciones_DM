package udla.dmolina.pooexcepcion.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        String valor = JOptionPane.showInputDialog("Ingrese un numero");
        //int divisor;
        int denominador = Integer.parseInt(valor);
        //double division = cal.dividir(10,denominador );


        try{ //todo lo que se quiera controlar debe ir dentro del try
            /*divisor = Integer.parseInt(valor);
            //int division = 10/0;
            int division = 10/divisor;*/
            double division = cal.dividir(10,denominador );
            System.out.println(division);
        }catch(DivisionPorCeroException ae) {//Exception ex es un metodo que recibe un parametro
            System.out.println("Captura el error en tiempo de ejecucion: " + ae.getMessage()); //getmessage es un metodo propio del java
            main(args);
        /*}catch(NumberFormatException nf){
            System.out.println("Error: " + nf.getMessage());
            main(args);*/ //se repite hasta que se introduzca un valor valido
        }finally{
            System.out.println("Es opcional y se ejecuta siempre");
        }
        System.out.println("Contienuamos con el flujo de aplicacion");
    }
}
