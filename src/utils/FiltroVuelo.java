package utils;
import entities.Vuelo;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.List;

public class FiltroVuelo {
    public static List<Vuelo> filtrarPorFechaInicio(List<Vuelo> vuelos, LocalDate fechaDesde, LocalDate fechaHasta) {
        return vuelos.stream()
                .filter(vuelo -> {
                    LocalDate fechaInicio = vuelo.getFechaDeInicio();
                        // Si ambas fechas están presentes, se filtra en ese rango
                    if (fechaDesde != null && fechaHasta != null) {
                        return !fechaInicio.isBefore(fechaDesde) && !fechaInicio.isAfter(fechaHasta);
                        // Si solo hay fechaDesde, incluye vuelos a partir de esa fecha
                    } else if (fechaDesde != null) {
                        return !fechaInicio.isBefore(fechaDesde);
                    // Si solo hay fechaHasta, incluye vuelos hasta esa fecha
                    } else if (fechaHasta != null) {
                        return !fechaInicio.isAfter(fechaHasta);
                        // Si no hay ninguna fecha, incluye todos los vuelos
                    } else {
                        return true;
                    }
                })
                // Ordenamiento de vuelos por fecha de inicio
                .sorted((v1, v2) -> {
                    if (fechaDesde == null && fechaHasta != null) {
                        // Si solo se usa fechaHasta se ordena de más reciente a más antiguo
                        return v2.getFechaDeInicio().compareTo(v1.getFechaDeInicio());
                    } else {
                        // Orden de más antiguo a más reciente
                        return v1.getFechaDeInicio().compareTo(v2.getFechaDeInicio());
                    }
                })

                .collect(Collectors.toList());
    }
}
