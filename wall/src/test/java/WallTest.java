import com.homework8.social_wall.IWallAllMessagesHandler;
import com.homework8.social_wall.domain.WallMessageModel;
import com.homework8.social_wall.domain.WallModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class WallTest {

    @Mock
    public IWallAllMessagesHandler wallMsgHandler;

    @Test
    public void getAllMessagesFromWall() {
     List<WallMessageModel> list_msg = wallMsgHandler.getList_messages();
     //list_msg=null;
        Assert.assertTrue("Лист сообщений не должен быть null",list_msg!=null);
    }
}
