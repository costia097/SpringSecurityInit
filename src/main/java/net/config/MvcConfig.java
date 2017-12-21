package net.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("net.config")
@ComponentScan("net.controllers")
@Import(SecureConfig.class)
public class MvcConfig {
}
