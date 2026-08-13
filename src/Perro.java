import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements IAsegurable, IVacunable{
    private String raza;
    private List<String> vacunas = new ArrayList<>();

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        double precioPorEdad = 3000.0 * edad;
        return 45_000.0 + precioPorEdad;
    }

    @Override
    public void imprimirFicha() {
        System.out.printf("Nombre: %s \n Edad %d \n Nombre del dueño: %S \n Raza: %s \n", nombre,edad,nombreDueno, raza);

    }

    @Override
    public double calcularPrimaSeguro() {
        return 80_000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "PERRO-01";
    }

    @Override
    public void registrarVacuna(String nombre) {
    vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
      return vacunas.size();
    }
}
