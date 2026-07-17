package model;

public class Persona {
    private String nombre;
    private double peso;
    private double est;
    private double imc;
    private String estatus;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, double peso, double est){
        this.nombre = nombre;
        this.peso = peso;
        this.est = est;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEst(double est){
        this.est = est;
    }

    public void calcularImc(){
        this.imc = this.peso/ (this.est*this.est);
    }

    public void defineEstatus(){
        this.calcularImc();
        if (imc <= 18.5)
            this.estatus = "Bajo Peso";
        else if (imc < 25)
            this.estatus = "Bajo Normal";
        else if (imc < 30)
            this.estatus = "Sobre Peso";
        else 
            this.estatus = "Obesidad";
    }

    public String getNombre() {
        return nombre;
    }
    public double getPeso() {
        return peso;
    }

    public double getEst() {
        return est;
    }
    public double getImc() {
        return imc;
    }
    public String getEstatus() {
        return estatus;
    }
    @Override
    public String toString() {
        return "Nombre"+ this.nombre + "\n" +
               "Peso:" + this.peso +   "\n"+
               "Estatura:" + this.est + "\n" +
               "IMC:" + this.imc +   "\n" +
               "Estatus:" + this.estatus + "\n" ;
    }


}