package com.rest.optional.stream;

import com.rest.optional.stream.connector.GetFilmsRestConnectorFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Slf4j
public class Application {

    @Autowired
    GetFilmsRestConnectorFacade restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
