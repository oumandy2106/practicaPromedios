import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudiante estudiante1 = registrar(scanner, "Estudiante 1");
        Estudiante estudiante2 = registrar(scanner, "Estudiante 2");
        Estudiante estudiante3 = registrar(scanner, "Estudiante 3");
        Estudiante estudiante4 = registrar(scanner, "Estudiante 4");
        Estudiante estudiante5 = registrar(scanner, "Estudiante 5");

        System.out.println("\n=== RESULTADOS ===");
        mostrarCalificacion(estudiante1);
        mostrarCalificacion(estudiante2);
        mostrarCalificacion(estudiante3);
        mostrarCalificacion(estudiante4);
        mostrarCalificacion(estudiante5);
    }

    public static Estudiante registrar(Scanner scanner, String titulo) {
        Estudiante e = new Estudiante();
        System.out.println("=== " + titulo + " ===");
        System.out.print("Nombre: ");
        e.setNombre(scanner.nextLine());
        System.out.print("Matrícula: ");
        e.setMatricula(scanner.nextLine());
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            e.setNota(i, scanner.nextDouble());
        }
        scanner.nextLine(); 
        return e;
    }

    public static void mostrarCalificacion(Estudiante e) {
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Matrícula: " + e.getMatricula());
        System.out.printf("Promedio: ", e.calcularPromedio());
        System.out.println("Aprobado: " + (e.aprobar() ? "Sí" : "No"));
        System.out.println("--------------------------");
    }
}
