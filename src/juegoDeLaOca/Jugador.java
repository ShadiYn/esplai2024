package juegoDeLaOca;

public class Jugador {
    private String nombre;
    private int casillaActual;
    private int restriccionTiros;
    private boolean primeraTirada;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.casillaActual = 0;
        this.restriccionTiros = 0;
        this.primeraTirada = false;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getCasillaActual() {
        return casillaActual;
    }

    public void setCasillaActual(int casillaActual) {
        this.casillaActual = casillaActual;
    }

    public int getRestriccionTiros() {
        return restriccionTiros;
    }

    public void setRestriccionTiros(int restriccionTiros) {
        this.restriccionTiros = restriccionTiros;
    }

    public boolean getPrimeraTirada() {
        return primeraTirada;
    }

    public void setPrimeraTirada(boolean primeraTirada) {
        this.primeraTirada = primeraTirada;
    }
}

