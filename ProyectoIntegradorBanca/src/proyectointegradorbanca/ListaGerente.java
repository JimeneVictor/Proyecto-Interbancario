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
}
