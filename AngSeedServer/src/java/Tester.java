
import entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AngSeedServerPU");

        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//
//        User user = new User("user", "test");
//        user.AddRole("User");
//        User admin = new User("admin", "test");
//        admin.AddRole("Admin");
//
//        User both = new User("user_admin", "test");
//        both.AddRole("User");
//        both.AddRole("Admin");
//        
//        em.persist(user);
//        em.persist(admin);
//        em.persist(both);
//        
//        em.getTransaction().commit();
//        
        
        User user = (User)em.createNamedQuery("User.findByUsername").setParameter("username", "user").getSingleResult();
        System.out.println(user.getRoles());

    }
}
