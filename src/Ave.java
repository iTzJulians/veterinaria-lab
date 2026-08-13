public class Ave extends Animal{
    private double pesoGramos;
    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta() {
        double precioPorGramo = 100 * pesoGramos;
        return  28_000 + pesoGramos;
    }

    @Override
    public void imprimirFicha() {
        System.out.printf("Nombre: %s \n Edad %d \n Nombre del dueño: %S \n Peso %fg \n", nombre,edad,nombreDueno,pesoGramos);

    }
}
