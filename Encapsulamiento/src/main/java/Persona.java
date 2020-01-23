
public class Persona {

   private  String nombre;
    Double sueldo;
    Boolean eliminado;

    public Persona(String nombre, Double sueldo, Boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Double getSueldo(){
        return this.sueldo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSueldo(Double sueldo){
        this.sueldo=sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }

}

