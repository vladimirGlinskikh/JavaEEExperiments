package springDemoWithConfigAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springDemoWithConfigXML.HelloMessage;
import springDemoWithConfigXML.Message;
import springDemoWithConfigXML.MessageRenderer;
import springDemoWithConfigXML.MessageRendererErrorImpl;

@Configuration
@ComponentScan(basePackages = "springDemoWithConfigXML")
public class AppConfig {
    @Bean
    public MessageRenderer messageRenderer() {
        return new MessageRendererErrorImpl(message());
    }

    @Bean
    public Message message() {
        return new HelloMessage("Spring with annotation");
    }
}
