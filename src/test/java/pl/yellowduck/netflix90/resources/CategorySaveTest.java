package pl.yellowduck.netflix90.resources;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import pl.yellowduck.netflix90.films.Category;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CategorySaveTest {

    @Test
    public void saveCategory() {
        Category category = new Category("COMEDY", "DRAMA");

//        Session session = SessionFactory
        EntityManager entityManager = Persistence.createEntityManagerFactory("NETFLIX")
                .createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(category);
        entityManager.getTransaction().commit();
    }
}