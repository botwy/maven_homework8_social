import com.homework8.social_gift.IGift;
import com.homework8.social_photo.IPhoto;
import com.homework8.social_photo.domain.PhotoModel;
import org.junit.Assert;
import org.junit.Test;

public class GiftTest {

    @Test
    public void checkGift() {
       /* IPhoto photo = new PhotoModel() {
            public void addPhoto(String filename) {

            }
        };*/
       IGift gift = null;
        Assert.assertTrue("Должен быть не null",gift!=null);
    }
}
