import com.homework8.social_users.IProfileViewer;
import com.homework8.social_users.IUser;
import com.homework8.social_users.domain.UserModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.jws.soap.SOAPBinding;


public class UserTests {

    @Parameterized.Parameter(1)
    public String name1="Bob";

    @Parameterized.Parameter(2)
    public String name2="Dima";

    private UserModel mockedUserModel1;
    private UserModel mockedUserModel2;
    private UserModel mockedUserModel3;

    @Before
    public void setUp (){
        mockedUserModel1= Mockito.mock(UserModel.class);
        mockedUserModel2= Mockito.mock(UserModel.class);
        mockedUserModel3= Mockito.mock(UserModel.class);
    }

    @Test
    public void testUserNew() {

        mockedUserModel1.setCity("Moscow");
        mockedUserModel2.setCity("Moscow");
       mockedUserModel3.setCity("Moscow");

      //  IProfileViewer user_viewer = (IProfileViewer) mockedUserModel3;

       Assert.assertTrue("Город у 3го пользователя должен быть not null",mockedUserModel3.getCity()!=null);
    }
}
