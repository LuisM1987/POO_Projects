package view;
import java.util.Scanner;

import model.Persona;

public class Consola {

    public static void main(String[]) args) {
       // Scanner lector = new Scanner(System.in); //Tecla

        String nombre = JOptionPlane.showInputDialog(message:"Ingrese el nombre de la persona");

        Persona pero = new Persona(nombre);
        double errorEncontrado = 0;
        
       do{
        try{
        String entrada = JOptionPlane.showInputDialog("Introduzca el peso de" + nombre);

        double peso = Double.parseDouble(entrada);

        }catch(Exception e){
            JOptionPane.showMessageDialog(parentComponent:null,
               message: "Ha ocurrido un error",
               title:"Error",
               JOptionPane.ERROR_MESAGE);
            error encontrado=True;
        }
    while(errorEncontrado);

        per.setPeso(peso);

        per.setEst(est);

        per.defineEstatus();
        
        System.out.println(per); //Hacer un JOptionPlane para mostrar el resultado (showMessageDialog)
    }
}