package one.digitalinnovation.pesonapi.repository;

import one.digitalinnovation.pesonapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
