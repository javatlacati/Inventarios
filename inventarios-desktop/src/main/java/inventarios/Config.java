package inventarios;

import inventarios.util.FontFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource
                = new ReloadableResourceBundleMessageSource();

        messageSource.setBasename("classpath:validationMessages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean getValidator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

    @Bean
    public FontFactory fontFactory() {
        FontFactory fontFactory = new FontFactory();
        return fontFactory;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

//    @Override
//    public void onStartup(ServletContext servletContext)
//            throws ServletException {
//        super.onStartup(servletContext);
//        ServletRegistration.Dynamic servlet = servletContext
//                .addServlet("h2-console", new WebServlet());
//        servlet.setLoadOnStartup(2);
//        servlet.addMapping("/console/*");
//    }

//    @Bean
//    public ServletRegistrationBean h2servletRegistration() {
//        ServletRegistrationBean registration = new ServletRegistrationBean();
//        registration.addUrlMappings("/h2-console");
//        registration.setLoadOnStartup(1);
//        return registration;
//    }
}
