public class Profesores {
        private Tier estrella;
        private float daño;
        private int velocidadAtaque;
        private float vida;
        private String nombre;
        private Tipo tipo;

    public Profesores() {
    }

    public Profesores(Tier estrella, float daño, int velocidadAtaque, float vida, String nombre, Tipo tipo) {
        this.estrella = estrella;
        this.daño = daño;
        this.velocidadAtaque = velocidadAtaque;
        this.vida = vida;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Tier getEstrella() {
        return estrella;
    }

    public void setEstrella(Tier estrella) {
        this.estrella = estrella;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    public int getVelocidadAtaque() {
        return velocidadAtaque;
    }

    public void setVelocidadAtaque(int velocidadAtaque) {
        this.velocidadAtaque = velocidadAtaque;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Profesore{" +
                "Tier=" + estrella +
                ", daño=" + daño +
                ", velocidadAtaque=" + velocidadAtaque +
                ", vida=" + vida +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
