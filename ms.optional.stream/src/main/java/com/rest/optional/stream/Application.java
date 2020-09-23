package com.rest.optional.stream;

import com.rest.optional.stream.api.resources.FilmsResource;
import com.rest.optional.stream.assembler.FilmsAssembler;
import com.rest.optional.stream.controller.GetFilmsController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilmsAssembler getFilmsAssembler() {
        return new FilmsAssembler(GetFilmsController.class, FilmsResource.class);
    }

}
