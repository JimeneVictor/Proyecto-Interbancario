package proyectointregradorbanca;

public class ListaGerente {
    private Gerente inicio;
    private Gerente fin;

    public ListaGerente() {
        inicio = null;
        fin = null;
    }

    public Gerente getInicio() {
        return inicio;
    }

    public void setInicio(Gerente inicio) {
        this.inicio = inicio;
    }

    public Gerente getFin() {
        return fin;
    }

    public void setFin(Gerente fin) {
        this.fin = fin;
    }

    public void agregarGerente(String noCuenta, String nombre, String contacto) {
        Gerente nuevo = new Gerente(noCuenta, nombre, contacto);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }

    public void eliminarGerente(String noCuenta) {
        Gerente actual = inicio;
        while (actual != null) {
            if (actual.getNoGerente().equalsIgnoreCase(noCuenta)) {
                if (actual == inicio && actual == fin) {
                    inicio = null;
                    fin = null;
                } else if (actual == inicio) {
                    inicio = actual.getSiguiente();
                    inicio.setAnterior(null);
                } else if (actual == fin) {
                    fin = fin.getAnterior();
                    fin.setSiguiente(null);
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                System.out.println("Gerente eliminado correctamente.");
                return;
            }
            actual = actual.getSiguiente();
        }
        System.out.println("No se encontró ningún gerente con ese número de cuenta.");
    }

    public void mostrar() {
        Gerente actual = inicio;
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
        }
    }
}
