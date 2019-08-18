package org.cjk.springcloud.fallback;

import org.cjk.springcloud.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceHystric implements MessageService {

    @Override
    public String sendMessage(String name) {
        return "send message error, please try again later ！";
    }

}
