package fr.jellyph1sh.firstserver.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.jellyph1sh.firstserver.api.datastruct.Client;

@RepositoryRestResource(collectionResourceRel = "clients", path = "clients")
public interface ClientsRepo extends MongoRepository<Client, String> {
    List<Client> findByFirstname(@Param("firstname") String firstname);
    List<Client> findByLastname(@Param("lastname") String lastname);
    List<Client> findByAge(@Param("age") int age);
}
