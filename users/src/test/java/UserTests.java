import com.homework8.social_users.IUser;
import com.homework8.social_users.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;


public class UserTests {

    @Test
    public void testUserNew() {
        IUser user = new User("1","Bob","a@a.com","Moscow");
    }
}
