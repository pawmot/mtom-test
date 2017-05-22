package com.pawmot.mtom.test;

import com.pawmot.mtom.test.b64u.Base64UploadPortType;
import com.pawmot.mtom.test.mtom.MtomUploadPortType;
import org.apache.camel.CamelContext;
import org.apache.camel.component.cxf.CxfComponent;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfiguration {

    @Bean
    public CxfEndpoint base64Endpoint(CamelContext ctx) {
        CxfComponent cxfComponent = new CxfComponent(ctx);

        CxfEndpoint endpoint = new CxfEndpoint(
                "http://0.0.0.0:9191/Base64Upload_1_0",
                cxfComponent);

        endpoint.setServiceClass(Base64UploadPortType.class);
        return endpoint;

    }

    @Bean
    public CxfEndpoint mtomEndpoint(CamelContext ctx) {
        CxfComponent cxfComponent = new CxfComponent(ctx);

        CxfEndpoint endpoint = new CxfEndpoint(
                "http://0.0.0.0:9191/MtomUpload_1_0",
                cxfComponent);

        endpoint.setServiceClass(MtomUploadPortType.class);
        return endpoint;

    }
}
