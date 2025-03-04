package mx.itson.tenista.ui;
import mx.itson.tenista.entidades.Tenista;
/**
 *
 * @author Jesus Rosales y Kevin Murguía
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        //Pedimos al usuario que ingrese la fuerza y la velocidad base del tenista
        System.out.println("Ingresa la fuerza base del tenista:");
        double fuerza = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad base del tenista:");
        double velocidad = sc.nextDouble();
        
        //Generamos una instancia de la clase Tenista
        Tenista nadal = new Tenista();
        
        //Asignamos los valores a los atributos de la clase Tenista
        nadal.setNombre("Rafael Nadal");
        nadal.setExperiencia(20.0f);
        nadal.setFuerza((float)fuerza);
        nadal.setVelocidad((float)velocidad);
        nadal.setMarcaRopa("Nike");
        
        //Calculamos la fuerza y la velocidad del tenista
        float fuerzaGolpe = nadal.calcularFuerzaGolpe(nadal.getFuerza(), nadal.getExperiencia());
        float velocidadCarrera = nadal.calcularVelocidadCarrera(nadal.getVelocidad(), nadal.getExperiencia());
       
        //Mostramos los resultados
        System.out.println("El tenista " + nadal.getNombre()   
                + " usando ropa " + nadal.getMarcaRopa() 
                + " golpea con una fuerza de " + fuerzaGolpe + " newtons"
                + " y corre a una velocidad de " + velocidadCarrera + " km/h");
    }
}