package good;

public class SocketWriter implements Write{
    @Override
    public void write(String content) {
        System.out.println("Writing to socket: " + content);
    }
}
