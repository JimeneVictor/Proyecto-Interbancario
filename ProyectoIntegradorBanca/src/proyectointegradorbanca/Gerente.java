package proyectointregradorbanca;

public class Gerente {
    private String noGerente;
    private String nombre;
    private String contacto;
    private Gerente siguiente;
    private Gerente anterior;

    public Gerente(String noGerente, String nombre, String contacto) {
        this.noGerente = noGerente;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String getNoGerente() {
        return noGerente;
    }

    public void setNoGerente(String noGerente) {
        this.noGerente = noGerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Gerente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Gerente siguiente) {
        this.siguiente = siguiente;
    }

    public Gerente getAnterior() {
        return anterior;
    }

    public void setAnterior(Gerente anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "noGerente=" + noGerente + "\n" + "Nombre: " + nombre + "\n" + "Contacto: " + contacto + "\n";
    }
    
}
