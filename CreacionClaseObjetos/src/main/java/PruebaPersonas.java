
public class PruebaPersonas {

    public static void main(String[] args) {  //psvm + TAB crea automaticamente el main
        // creacion de un objeto de tipo persona
        Persona p1;
        // creando el objeto de clase persona
        p1 = new Persona();
        //pongo valores a los nombres
        p1.apellido = "Cazorla";
        p1.nombre = "Nico";
        // acceso al metodo del objeto
        p1.DesplegarNombres();
    }
}
