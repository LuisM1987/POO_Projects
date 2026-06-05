import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ejemplo de instancia de objetos
        Persona p01 = new Persona("Juan", 17);
        //Como ingreso un dato pero del teclado usan la clase Scanner
        Scanner lector = new Scanner(System.in);
        System.out,println(  "¿Cuanto pesa la persona?");
        lector.nextDouble();

        p01.setPeso(lector.nextDouble()); //Uso del metodo set
        p01.setEstatura(1.80);
        p01.calcularImc();
        //Le puedo cambiar el nombre a juan
        //p01.setNombre("Miguel"); //Principio de ENCAPSULAMIENTO
        System.out.print("Nombre"+p01.getNombre());
        System.out.print("Edad"+p01.getEdad());
        System.out.print("Peso"+p01.getPeso());
        System.out.print("Estatura"+p01.getEstatura());
    }
}
