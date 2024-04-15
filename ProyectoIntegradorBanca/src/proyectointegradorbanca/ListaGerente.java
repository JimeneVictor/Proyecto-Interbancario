package proyectointregradorbanca;

public class ListaGerente {
    private Gerente inicio;
    private Gerente fin;

    public ListaGerente() {
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
    public void insertar(String noGerente, String nombre, String contacto){
        Gerente nuevo = new Gerente (noGerente, nombre, contacto);
        if (this.getInicio()== null){
            this.getFin().setSiguiente(nuevo);
            nuevo.setAnterior(this.getFin());
            this.setFin(nuevo);
        }
        else{
            this.setInicio(nuevo);
            this.setFin(nuevo);
        }
    }
    public void mostrar() {
       Gerente actual = this.getInicio();
        //Mostrar Inicio-Fin
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
            }
        }
    }
