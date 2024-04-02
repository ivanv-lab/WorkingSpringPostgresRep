package spr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.NoSuchElementException;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }

    @Bean
    CommandLineRunner runner(PersonRepository repository){
        return args -> {
            //Создание чела

            Person person=new Person();
            person.setName("jaja");
            repository.save(person);

//           Person person=new Person();
//           person.setName("B");
//
//           repository.save(person);
//           person.setName("A");
//           repository.save(person);
//           Person person1=new Person();
//           person1.setName("C");
//           repository.save(person1);
//            Person saved=repository.findById(person.getId())
//                    .orElseThrow(NoSuchElementException::new);

            //Перечисление челов из бд
            //repository.findAll().forEach(person -> {
            //System.out.println(person.getName());
            //});

            //Удаление чела из бд по id
            //repository.deleteById(2L);

            //Удаление всех
            //repository.deleteAll();
        };
    }
}
