package labcqrs.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import labcqrs.config.kafka.KafkaProcessor;
import labcqrs.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class MyPageViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MyPageRepository myPageRepository;
    //>>> DDD / CQRS
}
