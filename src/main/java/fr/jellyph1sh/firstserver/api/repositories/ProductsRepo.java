package fr.jellyph1sh.firstserver.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.jellyph1sh.firstserver.api.datastruct.Product;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductsRepo extends MongoRepository<Product, String> {
    List<Product> findByLabel(@Param("label") String label);
    List<Product> findByName(@Param("name") String name);
    List<Product> findByPrice(@Param("price") float price);
}