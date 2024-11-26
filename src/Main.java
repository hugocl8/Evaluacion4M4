import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la marca del auto");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el modelo del auto");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese el color del auto");
        String color = scanner.nextLine();
        System.out.println("Ingrese la velocidad máxima del auto");
        int velocidadMaxima = scanner.nextInt();
        scanner.nextLine();

        Auto miAuto = new Auto(marca, modelo, color, velocidadMaxima);

        miAuto.mostrarDatos();

        int opcion;
        do{
            System.out.println("\nSeleccione que desea hacer:");
            System.out.println("1. Encender auto");
            System.out.println("2. Apagar auto");
            System.out.println("3. Acelerar auto");
            System.out.println("4. Salir");

            opcion=scanner.nextInt();

            switch(opcion){
                case 1:
                    miAuto.encender();
                    break;
                case 2:
                    miAuto.apagar();
                    break;
                case 3:
                    miAuto.acelerar();
                    break;
                case 4:
                    System.out.println("Se ha finalizado el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=4);

    }
}