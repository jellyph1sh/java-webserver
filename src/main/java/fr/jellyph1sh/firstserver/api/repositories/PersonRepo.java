package fr.jellyph1sh.firstserver.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.jellyph1sh.firstserver.api.datastruct.Person;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepo extends MongoRepository<Person, String> {
    List<Person> findByFirstname(@Param("name") String name);
    List<Person> findByLastname(@Param("name") String name);
}
