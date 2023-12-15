package nr.spring_mapstructlombok.modules.user;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String        id;
    private String        name;
    private String        username;
    private String        email;
    private String        phone;
    private String        website;
    private LocalDateTime birthDate;
}
