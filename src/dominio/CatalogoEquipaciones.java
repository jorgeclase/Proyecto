package proyecto.src.dominio;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class CatalogoEquipaciones {
    private List<Equipacion> equipaciones;
    private final String archivo = "equipaciones.txt";

    public CatalogoEquipaciones() {
        this.equipaciones = new ArrayList<>();
        cargarEquipaciones();
    }

    public void agregarEquipacion(Equipacion equipacion) {
        equipaciones.add(equipacion);
        guardarEquipaciones();
    }

    public void eliminarEquipacion(String equipo) {
        equipaciones.removeIf(e -> e.getEquipo().equalsIgnoreCase(equipo));
        guardarEquipaciones();
    }

    public void modificarEquipacion(String equipo, Equipacion nuevaEquipacion) {
        for (int i = 0; i < equipaciones.size(); i++) {
            if (equipaciones.get(i).getEquipo().equalsIgnoreCase(equipo)) {
                equipaciones.set(i, nuevaEquipacion);
                guardarEquipaciones();
                break;
            }
        }
    }

    public void mostrarEquipaciones() {
        for (Equipacion equipacion : equipaciones) {
            System.out.println(equipacion);
        }
    }
    
    private void cargarEquipaciones() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" \\| ");
                Equipacion equipacion = new Equipacion(datos[0], datos[1], datos[2]);
                equipaciones.add(equipacion);
            }
        } catch (IOException e) {
            System.out.println("Error en cargar el archivo de equipaciones.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
    
    private void guardarEquipaciones() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(archivo));
            for (int i = 0; i < equipaciones.size(); i++) {
                pw.println(equipaciones.get(i).toString());
            }
        } catch (IOException e) {
            System.out.println("Error en guardar el archivo de equipaciones.");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
    
}
