package com.pawmot.mtom.test;

import lombok.AllArgsConstructor;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Base64Route extends SpringRouteBuilder {
    private final Base64Processor processor;

    @Override
    public void configure() throws Exception {
        from("cxf:bean:base64Endpoint")
                .process(processor)
                .end();
    }
}
