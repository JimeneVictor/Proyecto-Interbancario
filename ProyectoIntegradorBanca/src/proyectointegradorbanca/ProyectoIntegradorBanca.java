package proyectointegradorbanca;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ListaCliente listaCliente = new ListaCliente();
        Scanner scanner = new Scanner(System.in);
        
        int opc = 0;
        while (opc != 4 ) {
            System.out.println("\nMenu:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");
            
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de cuenta: ");
                    int cuentaDeposito = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    listaCliente.depositar(cuentaDeposito, (float) cantidadDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese el número de cuenta: ");
                    int cuentaRetiro = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    listaCliente.retirar(cuentaRetiro, cantidadRetiro);
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta: ");
                    int cuentaConsulta = scanner.nextInt();
                    listaCliente.consultar(cuentaConsulta);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema bancario PotroBANK");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
        
        
    }
}
