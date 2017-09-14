import com.homework8.social_photo.IPhoto;
import com.homework8.social_photo.Photo;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class PhotoTest {

    @Test
    public void checkPhoto() {
        IPhoto photo = new Photo("1","1.jpg");
        File f = new File(photo.getFile_name());
        Assert.assertTrue("Файл должен существовать",f.exists()==true);
    }
}
