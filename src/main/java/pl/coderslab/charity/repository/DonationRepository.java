package pl.coderslab.charity.repository;

import org.springframework.stereotype.Repository;
import pl.coderslab.charity.domain.Category;
import pl.coderslab.charity.domain.Donation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DonationRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Donation donation) {

        entityManager.persist(donation);
    }
}
