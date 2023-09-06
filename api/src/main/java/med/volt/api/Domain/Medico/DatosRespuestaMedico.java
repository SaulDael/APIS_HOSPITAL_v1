package med.volt.api.Domain.Medico;

import med.volt.api.Domain.Direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String telefono, String documento,
                                   DatosDireccion direccion) {
}
