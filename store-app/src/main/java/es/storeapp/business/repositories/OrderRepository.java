package es.storeapp.business.repositories;

import es.storeapp.business.entities.Order;
import java.text.MessageFormat;
import java.util.List;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends AbstractRepository<Order> {
    private static final String FIND_BY_USER_QUERY = 
            "SELECT o FROM Order o WHERE o.user.id = :id ORDER BY o.timestamp DESC";

    private static final String FIND_BY_USER_AND_ORDER_QUERY =
            "SELECT o FROM Order o WHERE o.user.id = :userid AND o.orderId = :orderid ORDER BY o.timestamp DESC";
        
    @SuppressWarnings("unchecked")
    public List<Order> findByUserId(Long userId) {
        Query query = entityManager.createQuery(FIND_BY_USER_QUERY);
        query.setParameter("id", userId);
        return (List<Order>) query.getResultList();
    }

    public Order findByUserIdandOrderId(Long userId, Long orderId) {
        Query query = entityManager.createQuery(FIND_BY_USER_AND_ORDER_QUERY);
        query.setParameter("userid", userId);
        query.setParameter("orderid", orderId);
        return (Order) query.getSingleResult();
    }
   
}
