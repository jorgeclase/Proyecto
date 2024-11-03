package proyecto.src.dominio;

public class Equipacion {
    private String equipo;
    private String temporada;
    private String colorPrincipal;

    public Equipacion(String equipo, String temporada, String colorPrincipal) {
        this.equipo = equipo;
        this.temporada = temporada;
        this.colorPrincipal = colorPrincipal;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(String colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }
    public String toString() {
        return "Equipacion(" +"equipo='" + equipo + '\'' +", temporada='" + temporada + '\'' +", colorPrincipal='" + colorPrincipal + ")";
    }
}
