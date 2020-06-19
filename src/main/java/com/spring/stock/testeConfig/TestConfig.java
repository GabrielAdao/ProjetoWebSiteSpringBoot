package com.spring.stock.testeConfig;

//import com.spring.stock.entities.CategoryBackup;
import com.spring.stock.entities.Product;
import com.spring.stock.entities.User;
import com.spring.stock.entities.enums.Measure;
//import com.spring.stock.respositories.CategoryRepositoryBackup;
import com.spring.stock.respositories.ProductRepository;
import com.spring.stock.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    /*@Autowired
    private CategoryRepositoryBackup categoryRepositoryBackup;*/

    @Override
    public void run(String... args) throws Exception {

        //CategoryBackup c1 = new CategoryBackup(null, "Chocolate");

        //categoryRepositoryBackup.saveAll(Arrays.asList(c1));

        User u1 = new User(null, "teste1");
        User u2 = new User(null, "Teste1");

        Product p1 = new Product(null, "Chocolate Belga", 30, Measure.GRAMA, "Chocolate belga em barra");

        userRepository.saveAll(Arrays.asList(u1,u2));
        productRepository.saveAll(Arrays.asList(p1));

        //p1.getCategories().add(c1);
        productRepository.saveAll(Arrays.asList(p1));
    }
}
