package med.volt.api.Domain.Paciente;

import jakarta.validation.constraints.NotNull;
import med.volt.api.Domain.Direccion.DatosDireccion;

public record DatosActualizarPaciente(@NotNull Long id,
                                      String nombre,
                                      String email ,
                                      DatosDireccion direccion) {
}
