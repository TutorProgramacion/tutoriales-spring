package carmelo.spring.jpa.dao;

import carmelo.spring.jpa.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("productDaoJpa")
@Transactional
public class ProductDaoJpaImpl implements ProductDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Product> todos() {
        String query = "from Product";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Integer cantidad() {
        return entityManager
                .createQuery("select count(p) from Product p", Long.class)
                .getSingleResult().intValue();
    }

    @Override
    public Product buscar(Integer id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public void insertar(Product product) {
        entityManager.persist(product);
    }

    @Override
    public void actualizar(Product product) {
        entityManager.merge(product);
    }

    @Override
    public void eliminar(Integer id) {
        String jpql = "select p from Product p where p.id = :id";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("id", id);
        Product p = (Product) query.getSingleResult();

        if(p != null) {
            entityManager.remove(p);
        }
    }
}
