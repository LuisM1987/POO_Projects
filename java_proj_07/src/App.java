import model.Persona;
public class App {
    public static void main(String[] args) throws Exception {

        Persona per01 = new Persona(nombre: "Juan");
        per01.setPeso(peso: 70);
        per01.setEst(est: 1.70);
        
        per01.defineEstatus(); 

        System.out.println("La persona de llama" + per01.getNombre());

        System.out.println(per01);
    
    }
}
