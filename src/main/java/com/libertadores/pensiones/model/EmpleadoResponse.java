package com.libertadores.pensiones.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoResponse {
    private Integer idEmpleado;
    private String tipoDocumentoEmpleado;
    private String identificadorEmpleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private String direccionEmpleado;
    private String telefonoEmpleado;
    private String correoEmpleado;
    private String fechaNacimientoEmpleado;

    private String genero;
}
