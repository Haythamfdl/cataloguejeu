package org.sid.cataloguejeu;

import org.sid.cataloguejeu.dao.VinylRepository;
import org.sid.cataloguejeu.entities.Vinyl;
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
    CommandLineRunner start(VinylRepository vinylRepository) {
        return args -> {
            Vinyl v1 = vinylRepository.save(new Vinyl(null, "V1",10,"Country",""));
            Vinyl v2 = vinylRepository.save(new Vinyl(null, "V2",20,"Rock",""));
            Vinyl v3 = vinylRepository.save(new Vinyl(null, "V3",30,"Jazz",""));
            Vinyl v4 = vinylRepository.save(new Vinyl(null, "V4",40,"Rock",""));
        };
    }
}
