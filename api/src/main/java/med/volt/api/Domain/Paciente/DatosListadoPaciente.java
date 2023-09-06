package med.volt.api.Domain.Paciente;

public record DatosListadoPaciente(Long id, String nombre, String email, String CURP) {

    public DatosListadoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getCURP());
    }
}
