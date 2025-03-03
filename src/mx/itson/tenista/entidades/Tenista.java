package mx.itson.tenista.entidades;

/**
 *
 * @author Jesus Rosales y Kevin Murguía
 */
public class Tenista {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getRanking() {
        return ranking;
    }

    public void setRanking(Float ranking) {
        this.ranking = ranking;
    }

    public Float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Float experiencia) {
        this.experiencia = experiencia;
    }
    
    public Float getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(Float velocidad) {
        this.velocidad = velocidad;
    }
    
    public Float getFuerza() {
        return fuerza;
    }
    
    public void setFuerza(Float fuerza) {
        this.fuerza = fuerza;
    }
    
    public String getMarcaRopa() {
        return marcaRopa;
    }
    
    public void setMarcaRopa(String marcaRopa) {
        this.marcaRopa = marcaRopa;
    }
    private String nombre;
    private Float ranking;
    private Float experiencia;
    private Float velocidad;
    private Float fuerza;
    private String marcaRopa;
    
    public float calcularRendimiento(Float ranking, Float experiencia) {
        float rendimiento = ranking * experiencia;
        return rendimiento;
    }
    
    public float calcularFuerzaGolpe(Float fuerza, Float experiencia) {
        float fuerzaGolpe = fuerza * (experiencia/2);
        return fuerzaGolpe;
    }
    
    public float calcularVelocidadCarrera(Float velocidad, Float experiencia) {
        float velocidadReal = velocidad + (experiencia * 0.1f);
        return velocidadReal;
    }
}
