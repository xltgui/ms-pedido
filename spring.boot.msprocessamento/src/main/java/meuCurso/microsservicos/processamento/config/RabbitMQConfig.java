package meuCurso.microsservicos.processamento.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.impl.AMQImpl;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value("${broker.queue.processamento.name}")
    private String queue;

    @Bean
    public Queue queue(){
        return new Queue(queue);
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter(){
        ObjectMapper objectMapper = new ObjectMapper();
        return new Jackson2JsonMessageConverter(objectMapper);
    }

}
