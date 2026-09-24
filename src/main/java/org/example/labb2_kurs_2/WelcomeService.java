package org.example.labb2_kurs_2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class WelcomeService {
    private final MessageFormatter messageFormatter;

    @Inject
    public WelcomeService(MessageFormatter messageFormatter){
        this.messageFormatter = messageFormatter;
    }

    public String welcome(String name){
        return messageFormatter.format(name);
    }

}
