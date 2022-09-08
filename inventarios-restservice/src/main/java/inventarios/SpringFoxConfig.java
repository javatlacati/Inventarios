package inventarios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {

  ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("My API Title")
        .description("Inventory management REST API")
        .license("GPL-3.0")
        .licenseUrl("https://github.com/javatlacati/Inventarios/blob/master/license.txt")
        .version("1.0.0-DNAPSHOT")
        .build();
  }

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("inventarios.controller"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo());
  }
}
