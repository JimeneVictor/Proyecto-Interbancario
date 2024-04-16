package proyectointregradorbanca;

    public class ListaCliente {
    private Cliente inicio;
    private Cliente fin;

    public ListaCliente() {
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

    public void depositar(int noCuenta, float cantidad){
        Cliente clienteActual = inicio;
        
    while (clienteActual != null) {
        if (clienteActual.getNoCuenta() == noCuenta) {
            double saldoActual = clienteActual.getSaldo();
            saldoActual += cantidad; 
            clienteActual.setSaldo((float) saldoActual); 
            System.out.println("Se ha depositado " + cantidad + " a la cuenta " + noCuenta);
            return; 
        }
        clienteActual = clienteActual.getSiguiente();
    }
    // Si no se encuentra la cuenta
    System.out.println("La cuenta " + noCuenta + " no existe.");
    }

    public void retirar(int noCuenta, double cantidad) {
    Cliente clienteActual = inicio;
    while (clienteActual != null) {
        if (clienteActual.getNoCuenta() == noCuenta) {
            // Encontramos al cliente
            // Verificion del saldo 
            double saldoActual = clienteActual.getSaldo();
            if (cantidad <= saldoActual) {
                // Saldo es suficiente para retirar
                saldoActual -= cantidad; // Restar la cantidad retirada al saldo actual
                clienteActual.setSaldo((float) saldoActual); // Actualizar el saldo en el cliente
                System.out.println("Se ha retirado " + cantidad + " de la cuenta " + noCuenta);
            } else {
                // La cantidad a retirar es mayor que el saldo actual
                System.out.println("No hay suficiente saldo en la cuenta " + noCuenta + " para realizar el retiro.");
            }
            return; // Salir del método después de realizar el retiro
        }
        clienteActual = clienteActual.getSiguiente();
    }
    // Si llegamos aquí, significa que no se encontró la cuenta
    System.out.println("La cuenta " + noCuenta + " no existe.");
    }
    public void consultar(int noCuenta) {
    Cliente clienteActual = inicio;
    while (clienteActual != null) {
        if (clienteActual.getNoCuenta() == noCuenta) {
            // Encontramos al cliente
            double saldoActual = clienteActual.getSaldo();
            System.out.println("Saldo de la cuenta " + noCuenta + ": " + saldoActual);
            return; // Salir del método después de mostrar el saldo
        }
        clienteActual = clienteActual.getSiguiente();
    }
    // Si llegamos aquí, significa que no se encontró la cuenta
    System.out.println("La cuenta " + noCuenta + " no existe.");
}
}
