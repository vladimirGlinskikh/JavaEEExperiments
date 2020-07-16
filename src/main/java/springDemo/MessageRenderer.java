package springDemo;

public class MessageRenderer {
    private Message message;

    public MessageRenderer(Message message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message.getText());
    }
}
