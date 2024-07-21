package ru.gb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(null, "Andrew", "example_01@gmail.com"));
        userRepository.save(new User(null, "John", "example_02@gmail.com"));
        userRepository.save(new User(null, "Sergey", "example_03@gmail.com"));
        userRepository.save(new User(null, "Tom", "example_04@gmail.com"));
        userRepository.save(new User(null, "Susanna", "example_05@gmail.com"));
    }
}
