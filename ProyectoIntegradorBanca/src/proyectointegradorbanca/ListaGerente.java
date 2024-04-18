package proyectointregradorbanca;
public class ListaGerente {
    private Cliente inicio;
    private Cliente fin;

    public ListaGerente() {
        inicio = null;
        fin = null;
    }
    public Cliente getInicio() {
        return inicio;
    }

    public void setInicio(Cliente inicio) {
        this.inicio = inicio;
    }

    public Cliente getFin() {
        return fin;
    }

    public void setFin(Cliente fin) {
        this.fin = fin;
    }

    // Método para agregar un cliente a la lista de gerentes
    public void agregarCliente(int noCliente, int noCuenta, String direccion, String nombre, String contacto) {
        Cliente nuevoCliente = new Cliente(noCliente, noCuenta, direccion, nombre, contacto);
        if (inicio == null) {
            inicio = nuevoCliente;
            fin = nuevoCliente;
        } else {
            fin.setSiguiente(nuevoCliente);
            nuevoCliente.setAnteror(fin);
            fin = nuevoCliente;
        }
    }
    // Método para eliminar un cliente de la lista de gerentes
    public void eliminarCliente(int noCuenta) {
        Cliente actual = inicio;
        while (actual != null) {
            if (actual.getNoCuenta() == noCuenta) {
                if (actual == inicio && actual == fin) {
                    inicio = null;
                    fin = null;
                } else if (actual == inicio) {
                    inicio = actual.getSiguiente();
                    inicio.setAnteror(null);
                } else if (actual == fin) {
                    fin = fin.getAnteror();
                    fin.setSiguiente(null);
                } else {
                    actual.getAnteror().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnteror(actual.getAnteror());
                }
                System.out.println("Cliente eliminado correctamente.");
                return;
            }
            actual = actual.getSiguiente();
        }
        System.out.println("No se encontró ningún cliente con ese número de cuenta.");
    }

    // Método para mostrar la lista de clientes
    public void mostrarClientes() {
        Cliente actual = inicio;
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
        }
    }
}
