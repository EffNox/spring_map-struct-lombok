package nr.spring_mapstructlombok.modules.todo;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

// public record TodoDTO(
// String identificador,
// String usuario_id,
// String titulo,
// boolean completado) {}
public record TodoDTO(
        // String id,
        @NotEmpty @Pattern(regexp = "^[a-fA-F0-9]{8}(-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}$", message = "No es un UUID válido") //
        String userId,
        @NotEmpty @Pattern(regexp = "^[a-zA-Z0-9 ]*$") @Size(min = 5, max = 70) String title,
        @AssertFalse boolean completed) {}
