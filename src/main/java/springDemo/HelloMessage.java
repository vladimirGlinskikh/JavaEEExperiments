package springDemo;

public class HelloMessage implements Message {
    private String text;

    public HelloMessage(String text) {
        this.text = "Hi " + text;
    }

    @Override
    public String getText() {
        return text;
    }
}
