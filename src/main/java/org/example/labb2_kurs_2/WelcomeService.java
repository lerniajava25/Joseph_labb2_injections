package org.example.labb2_kurs_2;

public class WelcomeService {
    private final MessageFormatter messageFormatter;

    public WelcomeService(MessageFormatter messageFormatter){
        this.messageFormatter = messageFormatter;
    }

    public String welcome(String name){
        return messageFormatter.format(name);
    }

}
