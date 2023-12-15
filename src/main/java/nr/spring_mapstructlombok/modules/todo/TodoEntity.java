package nr.spring_mapstructlombok.modules.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TodoEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String  id;
    private String  userId;
    private String  title;
    private boolean completed;
}