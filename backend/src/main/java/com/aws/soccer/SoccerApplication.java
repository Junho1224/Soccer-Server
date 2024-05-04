package com.aws.soccer;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SoccerApplication {

    public static void main(String... args) {
        SpringApplication.run(SoccerApplication.class, args);
    }


	@Bean
	JPAQueryFactory jpaQueryFactory(EntityManager entityManager){
		return new JPAQueryFactory(entityManager);
	}

}
