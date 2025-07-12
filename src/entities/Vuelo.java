package entities;
import java.time.LocalDate;


public class Vuelo {
    int id;
    String nombreVuelo;
    String empresa;
    String lugarDeSalida;
    String lugarDeLlegada;
    LocalDate fechaDeInicio;
    LocalDate fechaDeLlegada;

    public int getId() {
        return id;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLugarDeSalida() {
        return lugarDeSalida;
    }

    public void setLugarDeSalida(String lugarDeSalida) {
        this.lugarDeSalida = lugarDeSalida;
    }

    public String getLugarDeLlegada() {
        return lugarDeLlegada;
    }

    public void setLugarDeLlegada(String lugarDeLlegada) {
        this.lugarDeLlegada = lugarDeLlegada;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public LocalDate getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(LocalDate fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombreVuelo='" + nombreVuelo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", lugarDeSalida='" + lugarDeSalida + '\'' +
                ", lugarDeLlegada='" + lugarDeLlegada + '\'' +
                ", fechaDeInicio=" + fechaDeInicio +
                ", fechaDeLlegada=" + fechaDeLlegada +
                ", id=" + id +
                '}';
    }

    public Vuelo(int id,String nombreVuelo, String empresa, String lugarDeSalida, String lugarDeLlegada, LocalDate fechaDeInicio, LocalDate fechaDeLlegada) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarDeSalida = lugarDeSalida;
        this.lugarDeLlegada = lugarDeLlegada;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeLlegada = fechaDeLlegada;


    }
}


