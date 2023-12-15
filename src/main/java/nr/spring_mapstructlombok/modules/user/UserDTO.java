package nr.spring_mapstructlombok.modules.user;

import java.time.LocalDateTime;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;

public record UserDTO(

        @NotEmpty String name,
        @NotEmpty @Email String email,
        @NotEmpty String phone,
        @NotEmpty String website,
        @Past() @NotEmpty LocalDateTime birthDate

) {}
