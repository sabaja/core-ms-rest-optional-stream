package com.rest.optional.stream.config;

import com.rest.optional.stream.api.resources.FilmsResource;
import com.rest.optional.stream.assembler.FilmsAssembler;
import com.rest.optional.stream.controller.GetFilmsController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig {

    @Bean
    public FilmsAssembler getFilmsAssembler() {
        return new FilmsAssembler(GetFilmsController.class, FilmsResource.class);
    }
}
