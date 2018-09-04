package bernal2;

/**
 *
 * @author Alexis, Juan Pablo, Ramon
 */
public class Bernal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    double n1;
    double n2;
    double res;
    char operacion;

    
    public Bernal2(double n1, double n2, char operacion) {
        
        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
     }
      
    public void mostrarResultado(){        
        System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);        
    }    
       public class Suma extends Operacion{
    
    double suma;  
    }
}
