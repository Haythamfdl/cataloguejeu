package org.sid.cataloguejeu;

import org.sid.cataloguejeu.dao.JeuRepository;
import org.sid.cataloguejeu.entities.Jeu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CataloguejeuApplication {

    public static void main(String[] args) {
        SpringApplication.run(CataloguejeuApplication.class, args);
    }

    @Bean
    CommandLineRunner start(JeuRepository jeuRepository) {
        return args -> {
            Jeu j1 =jeuRepository.save(new Jeu(null, "J1",10,"Action"));
            Jeu j2 =jeuRepository.save(new Jeu(null, "J2",20,"Horreur"));
            Jeu j3 =jeuRepository.save(new Jeu(null, "J3",30,"Action"));
            Jeu j4 =jeuRepository.save(new Jeu(null, "J4",40,"Puzzle"));
        };
    }
}
