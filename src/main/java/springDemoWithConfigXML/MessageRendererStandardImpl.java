package springDemoWithConfigXML;

public class MessageRendererStandardImpl implements MessageRenderer {
    private Message message;

    public MessageRendererStandardImpl(Message message) {
        this.message = message;
    }

    @Override
    public void printMessage() {
        System.out.println(message.getText());
    }
}
