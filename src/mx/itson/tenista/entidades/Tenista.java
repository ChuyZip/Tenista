package mx.itson.tenista.entidades;
/**
 *
 * @author Jesus Rosales y Kevin Murguía
 */
public class Tenista {
/**
 * 
 * @return Nombre
 */
    public String getNombre() {
        return nombre;
    }
    
   /**
    * 
    * @param nombre 
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return Velocidad
     */
    public Float getVelocidad() {
        return velocidad;
    }
    
    /**
     * 
     * @param velocidad 
     */
    public void setVelocidad(Float velocidad) {
        this.velocidad = velocidad;
    }
    
    /**
     * 
     * @return MarcaRopa
     */
    public String getMarcaRopa() {
        return marcaRopa;
    }
    
   /**
    * 
    * @param marcaRopa 
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