package fr.jellyph1sh.firstserver.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.jellyph1sh.firstserver.api.datastruct.Cart;

@RepositoryRestResource(collectionResourceRel = "carts", path = "carts")
public interface CartsRepo extends MongoRepository<Cart, String> {
    List<Cart> findByOrderId(@Param("orderid") String orderId);
    List<Cart> findByProductId(@Param("productid") String productId);
    List<Cart> findByQuantity(@Param("quantity") int quantity);
}