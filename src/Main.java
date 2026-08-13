public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[]{
                new Perro("Paul", 9, "Karen", "Schnauzer"),
                new Gato("Tommy", 8, "Estefania", false),
                new Ave("Lorena", 5, "Alberto", 2500.0),
        };

        for(int i = 0; i<animales.length; i++){
            animales[i].imprimirFicha();
        }
        Perro perro =(Perro)animales[0];
        Gato gato = (Gato)animales[1];
        perro.registrarVacuna("vacuna 1");
        perro.registrarVacuna("vacuna 2");
        gato.registrarVacuna("vacuna 1");
        Clinica clinica = new  Clinica("Clinica","cra 89 12");
        IAsegurable[] asegurables = new IAsegurable[]{
                perro,
                gato,
                clinica,
        };
        for(int i = 0; i<asegurables.length; i++){
            System.out.printf("Numero de poliza: %s \n", asegurables[i].obtenerNumeroPoliza());
            System.out.printf("Prima anual: %f \n", asegurables[i].calcularPrimaSeguro());
        }
    }
}
