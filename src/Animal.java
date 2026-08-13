public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;
    public Animal(String nombre, int edad, String nombreDueno){
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }
    public abstract double calcularCostoConsulta();
    public abstract void imprimirFicha();

}
