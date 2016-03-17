package com.thejavaside.rest.api;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by jgao on 3/1/16.
 */
@Component
public class ServletConfig {
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {

        return new EmbeddedServletContainerCustomizer() {

            //change the port of the embedded server
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                container.setPort(9090);
            }
        };

    }
}
