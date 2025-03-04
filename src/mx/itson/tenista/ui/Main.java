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
       
        // Pedimos al usuario que ingrese la fuerza del golpe y el área de la pelota
        System.out.println("Ingresa la fuerza del golpe (en Newtons):");
        double fuerzaGolpe = sc.nextDouble();
        
        System.out.println("Ingresa el área de contacto de la pelota (en metros cuadrados):");
        double areaPelota = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad del tenista (en km/h):");
        double velocidad = sc.nextDouble();
        
        // Generamos una instancia de la clase Tenista
        Tenista nadal = new Tenista();
        
        // Asignamos los valores a los atributos de la clase Tenista
        nadal.setNombre("Rafael Nadal");
        nadal.setVelocidad((float)velocidad);
        nadal.setMarcaRopa("Nike");
        
        // Invocamos al método contenido en la clase tenista
        float presionGolpe = nadal.calcularPresionGolpe((float)fuerzaGolpe, (float)areaPelota);
       
        // Mostramos los resultados
        System.out.println("El tenista " + nadal.getNombre()   
                + " usando ropa " + nadal.getMarcaRopa() 
                + " golpea con una presión de " + presionGolpe + " pascales"
                + " y se mueve a una velocidad de " + nadal.getVelocidad() + " km/h");
        
        System.out.println("El valor del atributo presion es: " + nadal.getPresion() + " pascales");
    }
}