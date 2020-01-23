
public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona p1 = new Persona();

        p1.cambiarNombre("Juan");
        System.out.println("p1 nombre = " + p1.nombre);
        modificarPersona(p1);
        System.out.println(" p1 nombre= " + p1.nombre);
    }

    private static void modificarPersona(Persona persona) {
        persona.nombre = "nicolas";
    }

}
