package nr.spring_mapstructlombok.modules.todo;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
@Validated //A nivel de un solo parámetro en el método y no para objetos completos, para objetos/clases es @Valid
public class TodoController {

    private final TodoRepository repository;
    private final TodoMAP        map;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody TodoDTO dto) {
        var entity = map.toEntity(dto);
        return ResponseEntity.ok(entity);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable @Positive int id, @Valid @RequestBody TodoDTO dto) {
        var entity = map.toEntity(dto);
        return ResponseEntity.ok(entity);
    }

}
