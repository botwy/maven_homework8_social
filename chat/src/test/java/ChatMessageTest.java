import com.homework8.social_chat.Chat;
import com.homework8.social_chat.ChatMessage;
import com.homework8.social_chat.IChat;
import com.homework8.social_chat.IChatMessageSender;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class ChatMessageTest {

    @Parameterized.Parameter(1)
   public IChatMessageSender ms = new ChatMessage();

    @Parameterized.Parameter(2)
    public IChat chat = new Chat();

    @Test(expected = Exception.class)
  public void sendMessageToChat() {
        ms.sendMessage(chat);
    }
}
