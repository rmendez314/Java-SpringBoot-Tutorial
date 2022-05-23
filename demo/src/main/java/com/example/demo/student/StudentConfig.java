package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student ramiro = new Student(
                    "Ramiro",
                    "ramiromendez99@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 12),
                    21
            );
            Student sarah = new Student(
                    "Sarah",
                    "sarah@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 19),
                    21
            );
            Student tread = new Student(
                    "Treadway",
                    "treadway@gmail.com",
                    LocalDate.of(2003, Month.JANUARY, 10),
                    21
            );

            studentRepository.saveAll(List.of(ramiro, sarah, tread));
        };
    }

}
