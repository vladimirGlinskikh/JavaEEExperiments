package springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
//        MessageRendererErrorImpl renderer = (MessageRendererErrorImpl) context.getBean("renderer");
//        renderer.printMessage();
        IndependentMessageRenderer renderer = context.getBean(IndependentMessageRenderer.class);
        renderer.print();
    }
}
