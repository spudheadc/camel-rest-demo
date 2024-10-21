package au.id.wattle.chapman.camel.demo.config;

import java.net.URI;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.language.bean.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;

import jakarta.servlet.Servlet;

@Configuration
public class SavingsCalculatorConfig {

    // static final URI DEFAULT_SPECIFICATION_URI = URI.create("swagger.yml");

    // @Value("${demo.api.path}")
    // String contextPath;

    // @Bean(ref = "servletRegistrationBean")
    // public ServletRegistrationBean<Servlet> servletRegistrationBean() {
    //     ServletRegistrationBean<Servlet> servlet = new ServletRegistrationBean<Servlet>((Servlet)(new CamelHttpTransportServlet()), contextPath + "/*");
    //     servlet.setName("CamelServlet");
    //     return servlet;
    // }
}
