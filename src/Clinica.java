public class Clinica implements IAsegurable {


    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5_000_000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-JULIAN";
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
