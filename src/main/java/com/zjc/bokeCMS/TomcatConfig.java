package com.zjc.bokeCMS;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.security.util.SecurityConstants;

/**
 * @program: bokecms
 * @description: 用来配置http请求跳转到https
 * @author: zjc
 * @create: 2020-05-31 10:03
 **/
@Configuration
public class TomcatConfig {
    @Bean
  TomcatServletWebServerFactory tomcatServletWebServerFactory(){
        TomcatServletWebServerFactory factory=new TomcatServletWebServerFactory(){
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstants=new SecurityConstraint();
                securityConstants.setUserConstraint("CONFID");
                SecurityCollection collection=new SecurityCollection();
                collection.addPattern("/");
                securityConstants.addCollection(collection);
                context.addConstraint(securityConstants);

            }
        };
        factory.addAdditionalTomcatConnectors(createTomcatConnector());
        return factory;
    }
    private Connector createTomcatConnector(){
        Connector connector=new
                Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        connector.setPort(8080);
        connector.setSecure(false);
        connector.setRedirectPort(8081);
        return connector;
    }
}
