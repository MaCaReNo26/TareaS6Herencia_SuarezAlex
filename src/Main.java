
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE MATRICULACIÓN VEHICULAR ===");
        System.out.print("Ingrese tipo de vehículo (auto/moto/camion): ");
        String tipo = sc.nextLine();

        System.out.print("Placa: ");
        String placa = sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Año: ");
        int anio = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.print("Propietario: ");
        String propietario = sc.nextLine();

        Vehiculo v = null;

        switch (tipo.toLowerCase()) {
            case "auto":
                System.out.print("Cilindraje: ");
                int cil = sc.nextInt();
                v = new Auto(placa, marca, anio, propietario, cil);
                break;
            case "moto":
                System.out.print("Cilindrada: ");
                int cilMoto = sc.nextInt();
                v = new Moto(placa, marca, anio, propietario, cilMoto);
                break;
            case "camion":
                System.out.print("Capacidad en toneladas: ");
                double cap = sc.nextDouble();
                v = new Camion(placa, marca, anio, propietario, cap);
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                System.exit(0);
        }

        System.out.println("\n=== DATOS DEL VEHÍCULO ===");
        System.out.println("Propietario: " + v.getPropietario());
        System.out.println("Placa: " + v.getPlaca());
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Año: " + v.getAnio());
        System.out.println("Valor matrícula: $" + v.calcularValorMatricula());

    }
}

