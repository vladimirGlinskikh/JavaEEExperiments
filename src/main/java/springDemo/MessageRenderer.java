package springDemo;

public class MessageRenderer {
    private String text;

    public MessageRenderer(String text) {
        this.text = text;
    }

    public void printMessage() {
        System.out.println(text);
    }
}
