package com.lainrose.webservice;

import com.lainrose.webservice.model.Posts;
import com.lainrose.webservice.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebServiceApplication {

    @Autowired
    private PostsRepository postsRepository;

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            postsRepository.save(Posts.builder()
                    .author("으버미")
                    .title("스프링 테스트0")
                    .content("제곧내0")
                    .build());

            postsRepository.save(Posts.builder()
                    .author("으버미")
                    .title("스프링 테스트1")
                    .content("제곧내1")
                    .build());

            postsRepository.save(Posts.builder()
                    .author("으버미")
                    .title("스프링 테스트2")
                    .content("제곧내2")
                    .build());
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(WebServiceApplication.class, args);
    }

}
