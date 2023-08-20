public class ChatTest {
    public static void main(String[] args) {
        ChatClient chat = new ChatClient();
        chat.registriereBeobachter(new Anzeige());
        chat.registriereBeobachter(new LogWriter());

        chat.schreibeNachricht("test", "alice", "bob");
        chat.schreibeNachricht("1", "bob", "alice");
        chat.schreibeNachricht("2", "alice", "bob");

    }
}
