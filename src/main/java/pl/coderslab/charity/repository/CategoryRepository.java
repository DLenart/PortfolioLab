package pl.coderslab.charity.repository;

import org.springframework.stereotype.Repository;
import pl.coderslab.charity.domain.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CategoryRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Category category) {

        entityManager.persist(category);
    }
}
