package es.storeapp.business.repositories;

import es.storeapp.business.entities.Product;
import java.text.MessageFormat;
import java.util.List;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends AbstractRepository<Product> {
    
    private static final String FIND_BY_CATEGORY_QUERY = 
            "SELECT p FROM Product p WHERE p.category.name = :category ORDER BY p.";
    
    @SuppressWarnings("unchecked")
    public List<Product> findByCategory(String category, String orderColumn) {
        String queryString = FIND_BY_CATEGORY_QUERY + orderColumn;
        Query query = entityManager.createQuery(queryString);
        query.setParameter("category", category);
        return (List<Product>) query.getResultList();
    }
    
}
