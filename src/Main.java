import entities.Vuelo;
import utils.FiltroVuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static final LocalDate fechaDesde = LocalDate.of(2025,12,14);
    static final LocalDate fechaHasta = null;
    public static void main(String[] args) {

        List<Vuelo> listaDeVuelos = new ArrayList<>();
        listaDeVuelos.add(new Vuelo(1, "H251-J", "Emirates", "Barcelona", "Hong Kong", LocalDate.of(2025, 7, 19), LocalDate.of(2025, 7, 20)));
        listaDeVuelos.add(new Vuelo(2, "G672-Q", "RayanAir", "Barcelona", "Madrid", LocalDate.of(2025, 8, 11), LocalDate.of(2025, 8, 11)));
        listaDeVuelos.add(new Vuelo(3, "R816-P", "Iberia", "Barcelona", "Canarias", LocalDate.of(2025, 10, 8), LocalDate.of(2025, 10, 8)));
        listaDeVuelos.add(new Vuelo(4, "Y564-G", "American Airlines", "Girona", "Dublin", LocalDate.of(2025, 11, 25), LocalDate.of(2025, 11, 25)));
        listaDeVuelos.add(new Vuelo(5, "Q795-T", "Emirates", "Canarias", "Tokyo", LocalDate.of(2025, 11, 16), LocalDate.of(2025, 11, 17)));
        listaDeVuelos.add(new Vuelo(6, "Z456-E", "Vueling", "Canarias", "Maldivas", LocalDate.of(2025, 5, 19), LocalDate.of(2025, 5, 20)));
        listaDeVuelos.add(new Vuelo(7, "L159-C", "Iberia", "Canarias", "Tokyo", LocalDate.of(2025, 5, 14), LocalDate.of(2025, 5, 15)));
        listaDeVuelos.add(new Vuelo(8, "C618-K", "American Airlines", "Barcelona", "New York", LocalDate.of(2025, 12, 29), LocalDate.of(2025, 12, 30)));
        listaDeVuelos.add(new Vuelo(9, "K498-J", "RayanAir", "Girona", "Moscou", LocalDate.of(2025, 12, 14), LocalDate.of(2025, 12, 15)));
        listaDeVuelos.add(new Vuelo(10, "L623-I", "American Airlines", "Barcelona", "New York", LocalDate.of(2025, 12, 6), LocalDate.of(2025, 12, 7)));

        listaDeVuelos.forEach(System.out::println);

        System.out.println("-----------------------Filtrado-----------------------");
        List<Vuelo> vuelosFiltrados = FiltroVuelo.filtrarPorFechaInicio(listaDeVuelos, fechaDesde, fechaHasta);
        vuelosFiltrados.forEach((System.out::println));
    }
}
