package fr.jellyph1sh.firstserver.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.jellyph1sh.firstserver.api.datastruct.Order;

@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrdersRepo extends MongoRepository<Order, String> {
    List<Order> findByClientId(@Param("clientid") String clientId);
    List<Order> findByTotalPrice(@Param("totalprice") float totalPrice);
    List<Order> findByStatus(@Param("status") boolean status);
}