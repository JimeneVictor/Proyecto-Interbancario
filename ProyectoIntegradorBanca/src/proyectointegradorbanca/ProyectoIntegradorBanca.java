package proyectointegradorbanca;
import java.util.Scanner;

public class proyectoIntegradorBanca {
    public static void main(String[] args) {
        String direccion, nombre, contacto;
        ListaGerente gerenteAcciones = new ListaGerente();
        Gerente nahum = new Gerente(22, "Nahum", "7731213120", 12345);
        ListaCliente nuevo = new ListaCliente ();
        Scanner scanner = new Scanner(System.in);
        int opcionUsuario, opcionMenuGerente, noCliente, noCuenta, contraseniaCliente, contraseniaGerente,noGerente, regresarMenu,opcionMenuCliente, opcion1;
        
        do {
            System.out.println("--->Menu<---\nEscoja el tipo de usuario\n1)Gerente\n2)Cliente");
            opcionUsuario = scanner.nextInt();
            
            switch (opcionUsuario) {
                // Case 1 es Gerente
                case 1:
                    System.out.println("Numero de cuenta del Gerente: ");
                    noGerente = scanner.nextInt();
                    System.out.println("Contrasenia: ");
                    contraseniaGerente = scanner.nextInt();
                    
                    if (contraseniaGerente == nahum.getContrasenia() && noGerente == nahum.getNoCuenta()) {
                        System.out.println("Bienvenido, Nahum");
                        // Menu Gerente
                        do {
                            System.out.println("Escoja la accion que desea hacer\n1)Agregar Cliente\n2)Eliminar Cliente\n3)Mostrar Clientes\n4)Volver al menu principal");
                            opcionMenuGerente = scanner.nextInt();
                            
                            switch (opcionMenuGerente) {
                                // Agregar cliente
                                case 1:
                                    System.out.println("Numero de cliente: ");
                                    noCliente = scanner.nextInt();
                                    System.out.println("Numero de cuenta: ");
                                    noCuenta = scanner.nextInt();
                                    System.out.println("Direccion: ");
                                    direccion = scanner.next();
                                    System.out.println("Nombre: ");
                                    nombre = scanner.next();
                                    System.out.println("Contacto: ");
                                    contacto = scanner.next();
                                    gerenteAcciones.agregarCliente(noCliente, noCuenta, direccion, nombre, contacto);
                                    break;
                                // Eliminar cliente
                                case 2:
                                    System.out.println("Numero de cuenta que desea eliminar: ");
                                    noCuenta = scanner.nextInt();
                                    gerenteAcciones.eliminarCliente(noCuenta);
                                    break;
                                // Mostrar clientes
                                case 3:
                                    gerenteAcciones.mostrarClientes();
                                    break;
                                // Volver al menu principal
                                case 4:
                                    opcionUsuario = 0;
                                    break;
                                default:
                                    System.out.println("Opcion invalida, elija nuevamente.");
                                    break;
                            }
                        } while (opcionMenuGerente != 4);
                    } else {
                        System.out.println("Numero de cuenta o contraseña equivocados, ¿Volver al menu? 1)Sí 2)No");
                        regresarMenu = scanner.nextInt();
                    }
                    break;
                // Case 2 es Cliente
                case 2:
                    do {
                        System.out.println("\nMenu:");
                        System.out.println("1. Depositar");
                        System.out.println("2. Retirar");
                        System.out.println("3. Consultar");
                        System.out.println("4. Salir");
                        System.out.print("Ingrese su opcion: ");

                        opcion1 = scanner.nextInt();
                        switch (opcion1) {
                            case 1:
                                System.out.print("Ingrese el numero de cuenta: ");
                                int cuentaDeposito = scanner.nextInt();
                                System.out.print("Ingrese la cantidad a depositar: ");
                                float cantidadDeposito = scanner.nextFloat();
                                nuevo.depositar(cuentaDeposito, cantidadDeposito);
                                break;
                            case 2:
                                System.out.print("Ingrese el numero de cuenta: ");
                                int cuentaRetiro = scanner.nextInt();
                                System.out.print("Ingrese la cantidad a retirar: ");
                                double cantidadRetiro = scanner.nextDouble();
                                nuevo.retirar(cuentaRetiro, cantidadRetiro);
                                break;
                            case 3:
                                System.out.print("Ingrese el numero de cuenta: ");
                                int cuentaConsulta = scanner.nextInt();
                                nuevo.consultar(cuentaConsulta);
                                break;
                            case 4:
                                System.out.println("Gracias por usar el sistema bancario PotroBANK");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                break;
                        }
                    } while (opcion1 != 4);
                    break;
                case 3:
                    System.out.println("Adios, vuelva pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo\n");
                    break;
            }
        } while (opcionUsuario != 3);
    }
}
