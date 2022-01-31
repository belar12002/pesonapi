package one.digitalinnovation.pesonapi.dto.mapper;


import one.digitalinnovation.pesonapi.dto.request.PersonDTO;
import one.digitalinnovation.pesonapi.entity.Person;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}