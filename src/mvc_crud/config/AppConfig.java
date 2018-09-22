package mvc_crud.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("mvc-crud")
@EnableAspectJAutoProxy
public class AppConfig {

}
