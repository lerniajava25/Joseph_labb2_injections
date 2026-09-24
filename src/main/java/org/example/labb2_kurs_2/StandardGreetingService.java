package org.example.labb2_kurs_2;

public class StandardGreetingService implements GreetingService {
    private final GreetingProvider greetingProvider;

    public StandardGreetingService(GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @Override
    public String greet(String name) {
        return greetingProvider.greetingFor(name);
    }
}
