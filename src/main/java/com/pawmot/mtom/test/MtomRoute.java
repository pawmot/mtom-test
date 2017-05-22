package com.pawmot.mtom.test;

import lombok.AllArgsConstructor;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MtomRoute extends SpringRouteBuilder {
    private final MtomProcessor processor;

    @Override
    public void configure() throws Exception {
        from("cxf:bean:mtomEndpoint?properties.mtom-enabled=true")
                .process(processor)
                .end();
    }
}
