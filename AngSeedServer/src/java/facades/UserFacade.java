package facades;

import entity.User;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import security.PasswordHash;

public class UserFacade {

    private final EntityManagerFactory emf;

    public UserFacade() {
        this.emf = Persistence.createEntityManagerFactory("AngSeedServerPU");
//        //Test Users
//        User user = new User("user", "test");
//        user.AddRole("User");
//        users.put(user.getUserName(), user);
//        User admin = new User("admin", "test");
//        admin.AddRole("Admin");
//        users.put(admin.getUserName(), admin);
//
//        User both = new User("user_admin", "test");
//        both.AddRole("User");
//        both.AddRole("Admin");
//        users.put(both.getUserName(), both);
    }

    public User getUserByUserId(String id) {
        EntityManager em = emf.createEntityManager();

        return (User) em.createNamedQuery("User.findByUsername").setParameter("username", id).getSingleResult();
    }
    /*
     Return the Roles if users could be authenticated, otherwise null
     */

    public List<String> authenticateUser(String userName, String password) throws NoSuchAlgorithmException, InvalidKeySpecException {
        EntityManager em = emf.createEntityManager();

        User user = getUserByUserId(userName);
        return user != null && PasswordHash.validatePassword(password, user.getPassword()) ? user.getRoles() : null;
    }

}
