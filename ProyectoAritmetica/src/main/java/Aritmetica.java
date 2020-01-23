
public class Aritmetica {
    int a,b;
    public Aritmetica(int arg1,int arg2) {
        
        a=arg1;
        b=arg2;
        System.out.println(a+b);
    }
    public Aritmetica(){
    }
    public int sumar() {
         
        return a + b;
    }
    public int restar(){
        return a-b;
    }
    public int multiplicar(){
        return a*b;
    }
    public float dividir(){
        float res;
        res =a/b;
        return res;
    }
            
}
