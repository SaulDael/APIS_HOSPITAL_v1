package med.volt.api.Domain.Medico;

import jakarta.validation.constraints.NotNull;
import med.volt.api.Domain.Direccion.DatosDireccion;

public record DatosActualizarMedico(@NotNull Long id , String nombre, String documento, DatosDireccion direccion) {
}
