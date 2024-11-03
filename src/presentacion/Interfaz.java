package proyecto.src.presentacion;
import java.util.Scanner;
import proyecto.src.dominio.CatalogoEquipaciones;
import proyecto.src.dominio.Equipacion;

public class Interfaz {
    private CatalogoEquipaciones catalogo;
    private Scanner scanner;

    public Interfaz() {
        catalogo = new CatalogoEquipaciones();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nCatalogo de Equipaciones de Fútbol de Jorge");
            System.out.println("1. Nueva equipación");
            System.out.println("2. Borrar equipación");
            System.out.println("3. Editar equipación");
            System.out.println("4. Todas las equipaciones");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            ejecutarOpcion(opcion);
        } while (opcion != 5);
    }

    private void ejecutarOpcion(int opcion) {
        if (opcion == 1) {
            agregarEquipacion();
        } else if (opcion == 2) {
            eliminarEquipacion();
        } else if (opcion == 3) {
            modificarEquipacion();
        } else if (opcion == 4) {
            catalogo.mostrarEquipaciones();
        } else if (opcion == 5) {
            System.out.println("Saliendo del programa");
        } else {
            System.out.println("Opción no válida.");
        }
    }
    

    private void agregarEquipacion() {
        System.out.print("Equipo: ");
        String equipo = scanner.nextLine();
        System.out.print("Temporada: ");
        String temporada = scanner.nextLine();
        System.out.print("Color principal: ");
        String color = scanner.nextLine();
        Equipacion nuevaEquipacion = new Equipacion(equipo, temporada, color);
        catalogo.agregarEquipacion(nuevaEquipacion);
    }

    private void eliminarEquipacion() {
        System.out.print("Nombre del equipo a borrar: ");
        String equipo = scanner.nextLine();
        catalogo.eliminarEquipacion(equipo);
    }

    private void modificarEquipacion() {
        System.out.print("Nombre del equipo a modificar: ");
        String equipo = scanner.nextLine();
        System.out.print("Nueva temporada: ");
        String temporada = scanner.nextLine();
        System.out.print("Nuevo color principal: ");
        String color = scanner.nextLine();
        Equipacion equipacionModificada = new Equipacion(equipo, temporada, color);
        catalogo.modificarEquipacion(equipo, equipacionModificada);
    }
}
