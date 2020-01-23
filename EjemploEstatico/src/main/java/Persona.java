
public class Persona {

    private int id;
    private String nombre;
    private static int cant;

    public Persona(String nombre) {

        cant++;
        this.id = cant;
        this.nombre = nombre;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getCant() {
        return cant;
    }

    @Override
    public String toString() {
        return "Persona{" + "id= " + id + ", nombre= " + nombre + "cantidad de personas= " + cant + '}';
    }

}
