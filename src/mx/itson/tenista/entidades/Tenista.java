package mx.itson.tenista.entidades;
/**
 *
 * @author Jesus Rosales y Kevin Murguía
 */
public class Tenista {
    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return la velocidad
     */
    public Float getVelocidad() {
        return velocidad;
    }
    
    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(Float velocidad) {
        this.velocidad = velocidad;
    }
    
    /**
     * @return the marcaRopa
     */
    public String getMarcaRopa() {
        return marcaRopa;
    }
    
    /**
     * @param marcaRopa the marcaRopa to set
     */
    public void setMarcaRopa(String marcaRopa) {
        this.marcaRopa = marcaRopa;
    }
    
    
    private String nombre;
    
    private Float velocidad;
    
    private String marcaRopa;
    
    /**
     * Calcula la presión que ejerce el golpe sobre el área de la pelota.
     * @param fuerzaGolpe Fuerza directa del golpe ingresada por el usuario (Newtons).
     * @param areaPelota Área de contacto de la pelota (metros cuadrados).
     * @return Presión ejercida sobre la pelota (Pascales).
     */
    public float calcularPresionGolpe(Float fuerzaGolpe, Float areaPelota) {
        // La presión es la fuerza dividida por el área
        float presionEjercida = fuerzaGolpe / areaPelota;
        
        return presionEjercida;
    }
}