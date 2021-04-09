package pl.coderslab.charity.repository;

import org.springframework.stereotype.Repository;
import pl.coderslab.charity.domain.Category;
import pl.coderslab.charity.domain.Institution;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class InstitutionRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Institution institution) {

        entityManager.persist(institution);
    }
}
