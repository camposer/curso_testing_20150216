package curso.testing.basico.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"curso.testing.basico.service"})
public class ConfigTest {

}
