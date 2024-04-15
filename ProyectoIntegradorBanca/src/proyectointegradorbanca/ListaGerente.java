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
    //Insetar al final
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
    //Mostrar de Inicio-Fin
    public void mostrar() {
       Gerente actual = this.getInicio();
        //Mostrar Inicio-Fin
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
            }
        }
    //Buscar por Numero
    public void buscarPorNumero(String noGerente) {
    Gerente actual = inicio;
    boolean encontrado = false;
    while (actual != null) {
        if (actual.getNoGerente().equalsIgnoreCase(noGerente)) {
            System.out.println(actual.toString());
            encontrado = true;
        }
        actual = actual.getSiguiente();
    }
    if (!encontrado) {
        System.out.println("No se encontraron alimentos con el numero'" + noGerente + "'.");
    }
}
}
