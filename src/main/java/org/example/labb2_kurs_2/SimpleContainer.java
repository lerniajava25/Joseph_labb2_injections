package org.example.labb2_kurs_2;

import java.lang.reflect.Constructor;

public class SimpleContainer {

    public <T> T getInstance(Class<T> requestedClass){
        try{
            Constructor<?> constructor =
                    requestedClass.getDeclaredConstructors()[0];

            Class<?>[] dependencyTypes = constructor.getParameterTypes();

            Object[] dependencies = new Object[dependencyTypes.length];

            for (int i = 0; i < dependencyTypes.length; i++){
                dependencies[i] = getInstance(dependencyTypes[i]);
            }

            Object instance = constructor.newInstance(dependencies);

            return requestedClass.cast(instance);
        } catch (Exception exception){
            throw new RuntimeException(
                    "Could not create" + requestedClass.getName(),
                    exception
            );
        }
    }
}
