package org.example.labb2_kurs_2;

public class EnthusiasticGreetingService implements GreetingService {
    private final GreetingProvider greetingProvider;

    public EnthusiasticGreetingService(GreetingProvider greetingProvider) {
        this.greetingProvider = greetingProvider;
    }

    @Override
    public String greet(String name) {
        return greetingProvider.greetingFor(name).toUpperCase() + " GREAT TO SEE YOU!";
    }
}
