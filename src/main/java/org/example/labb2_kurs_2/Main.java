package org.example.labb2_kurs_2;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class Main {
    public static void main(String[] args){
        SeContainerInitializer initializer =
                SeContainerInitializer.newInstance();

            try (SeContainer container = initializer.initialize()){
                WelcomeService welcomeService =
                        container.select(WelcomeService.class).get();

                System.out.println(welcomeService.welcome("Joseph"));
            }
    }
}
