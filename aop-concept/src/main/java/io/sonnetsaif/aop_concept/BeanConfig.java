package io.sonnetsaif.aop_concept;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "io.sonnetsaif.aop_concept")
@EnableAspectJAutoProxy
public class BeanConfig {
}
