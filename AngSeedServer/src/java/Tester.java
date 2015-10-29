
import entity.User;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import security.PasswordHash;

public class Tester {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
        Persistence.generateSchema("AngSeedServerPU", null);
//        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AngSeedServerPU");
//
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//
//        User user = new User("user", PasswordHash.createHash("test"));
//        user.AddRole("User");
//        User admin = new User("admin", PasswordHash.createHash("test"));
//        admin.AddRole("Admin");
//
//        User both = new User("user_admin", PasswordHash.createHash("test"));
//        both.AddRole("User");
//        both.AddRole("Admin");
//        
//        em.persist(user);
//        em.persist(admin);
//        em.persist(both);
//        
//        em.getTransaction().commit();
        
        
//        User user = (User)em.createNamedQuery("User.findByUsername").setParameter("username", "user").getSingleResult();
//        System.out.println(user.getRoles());

    }
}
