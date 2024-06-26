package proyectointregradorbanca;
public class Cliente {
    private int noCliente;
    private int noCuenta;
    private String direccion;
    private String nombre;
    private String contacto;
    private Cliente siguiente;
    private Cliente anteror;
    private float saldo;
    
    public Cliente(int noCliente, int noCuenta, String direccion, String nombre, String contacto) {
        this.noCliente = noCliente;
        this.noCuenta = noCuenta;
        this.direccion = direccion;
        this.nombre = nombre;
        this.contacto = contacto;

    }
    public int getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(int noCliente) {
        this.noCliente = noCliente;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Cliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cliente siguiente) {
        this.siguiente = siguiente;
    }

    public Cliente getAnteror() {
        return anteror;
    }

    public void setAnteror(Cliente anteror) {
        this.anteror = anteror;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public String toString() {
        return "---------------" + "\n" + "Numero de Cliente: " + noCliente + "\n" + "Num de Cuenta: " + noCuenta + "\n" + "Direccion: " + direccion + "\n" + "Nombre: " + nombre + "\n" + "Contactos: " + contacto  + "\n" + "---------------";
    } 
}
