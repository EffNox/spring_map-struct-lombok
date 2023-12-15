package nr.spring_mapstructlombok.modules.todo;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TodoMAP {

    @Mapping(target = "id", ignore = true)
    TodoEntity toEntity(TodoDTO source);

    // @InheritInverseConfiguration
    TodoDTO toDto(TodoEntity destination);

    List<TodoEntity> toEntityList(List<TodoDTO> source);

    List<TodoDTO> toDtoList(List<TodoEntity> source);

    // @Mapping(target = "identificador", source = "entity.id")
    // @Mapping(target = "usuario_id", source = "entity.userId")
    // @Mapping(target = "titulo", source = "entity.title")
    // @Mapping(target = "completado", source = "entity.completed")
    // TodoDTO entityToDto(TodoEntity entity);

    /* @Mapping(target="id", source="dto.employeeId")
    @Mapping(target="name", source="dto.employeeName")
    @Mapping(target="startDt", source="dto.employeeStartDt",dateFormat="dd-MM-yyyy HH:mm:ss") */

    // @Mapping(target = "id", source = "dto.identificador")
    // @Mapping(target = "userId", source = "dto.usuario_id")
    // @Mapping(target = "title", source = "dto.titulo")
    // @Mapping(target = "completed", source = "dto.completado")
    // TodoEntity dtoToEntity(TodoDTO dto);

    // TodoMAP INSTANCE = Mappers.getMapper(TodoMAP.class);
    // @Mapping(target = "id", source = "source.id", defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    // TodoDTO entityToDto(TodoEntity source);
}