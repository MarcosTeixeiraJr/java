// SwaggerConfig.java
package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    // Configuração do Swagger para documentar a API
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Minha API REST com Spring Boot")
                        .version("1.0")
                        .description("Esta é uma API de exemplo para demonstrar o uso do Spring Boot para criar APIs REST.")
                        .termsOfService("Termos de uso: Open Source")
                        .contact(new Contact()
                                .name("Seu Nome")
                                .url("https://www.seusite.com.br")
                                .email("contato@seusite.com.br"))
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença: Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")));
    }
}



