package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .version("1.0")
                        .description("API exemplo de uso de Springboot REST API")
                        .termsOfService("Termo de uso: Open Source")
                        .contact(new Contact()
                                .name("Seu nome")
                                .url("https://www.seusite.com.br")
                                .email("voce@seusite.com.br"))
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença - Sua Empresa")
                                .url("http://www.seusite.com.br")));
    }
}


