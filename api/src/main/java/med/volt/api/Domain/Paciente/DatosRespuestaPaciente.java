package med.volt.api.Domain.Paciente;

import med.volt.api.Domain.Direccion.DatosDireccion;

public record DatosRespuestaPaciente(
        Long id,
        String nombre,
        String email,
        String telefono,
        String CURP,
        DatosDireccion direccion

) {
}
