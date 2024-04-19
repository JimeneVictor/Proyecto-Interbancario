package proyectointregradorbanca;

public class Gerente {
    private int noCuenta;
    private String nombre;
    private String contacto;
    private Gerente siguiente;
    private Gerente anterior;
    private int contrasenia;
    
    public Gerente(int noCuenta, String nombre, String contacto,int contrasenia) {
        this.noCuenta = noCuenta;
        this.nombre = nombre;
        this.contacto = contacto;
        this.contrasenia = contrasenia;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getNoGerente() {
        return noCuenta;
    }

    public void setNoGerente(int noGerente) {
        this.noCuenta = noGerente;
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
        return "noCuenta: " + noCuenta + "\n" + "Nombre: " + nombre + "\n" + "Contacto: " + contacto + "\n";
    }
    
}
