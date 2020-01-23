
public class Persona{

    String nombre, apellido;
    int edad, peso;
    float altura, IMC;

    public Persona() {
        System.out.println("CREANDO TIPO PERSONA VACIO");
    }

    public Persona(String nombre, String apellido, int edad, int peso, float altura) {
        System.out.println("CREANDO TIPO PERSONA COMPLETO");
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        
    }

    public void obesidad(){
        IMC =peso /(altura * altura );
        if ( IMC >= 30) {
            System.out.println("LA PERSONA TIENE OBESIDAD");
        } 
        else 
        {
            if (this.IMC > 18){
             System.out.println("LA PERSONA TIENE UN PESO NORMAL");
            }
            else
                System.out.println("LA PERSONA ESTA MAL NUTRIDA");
        }
    }
    public void nombreApellido()
    {
        System.out.println("SU NOMBRE ES = " + nombre);
        System.out.println("SU APELLIDO ES = " + apellido);
    }
    public void edad(){
        System.out.println("edad = " + edad);
    }
    public void altura(){
        System.out.println("altura = " + altura);
    }
}
