package com.rest.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan(basePackages = { "com.rest.api.controller" })
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    public MvcConfig() {
        super();
    }

    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/patient").setViewName("Patient_interface.html");
        registry.addViewController("/patient/list").setViewName("patients.html");
        registry.addViewController("/doctor").setViewName("doctor_interface.html");
        registry.addViewController("/doctor/list").setViewName("doctors.html");
        registry.addViewController("/appointment").setViewName("appointment.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/static/**")) {
            registry.addResourceHandler("/static/**","/static/js/**").addResourceLocations("classpath:/static/");
        }
    }


}
