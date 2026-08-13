import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements IVacunable, IAsegurable {
    private boolean esEsterilizado;
    private List<String> vacunas = new ArrayList<>();
    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38_000;
    }

    @Override
    public void imprimirFicha() {
        System.out.printf("Nombre: %s \n Edad %d \n Nombre del dueño: %S \n Esterilizado: %b \n", nombre,edad,nombreDueno,esEsterilizado);
    }

    @Override
    public double calcularPrimaSeguro() {
        if(esEsterilizado){
            return 120_000.0;
        }
        else{
            return 200_000.0;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "GATO-02";
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
