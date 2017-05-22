package com.pawmot.mtom.test;

import com.pawmot.mtom.test.b64u.Base64UploadRequestType;
import com.pawmot.mtom.test.b64u.Base64UploadResponseType;
import com.pawmot.mtom.test.b64u.ObjectFactory;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.pawmot.mtom.test.b64u.Base64UploadStatusType.OK;

@Service
@Slf4j
@AllArgsConstructor
public class Base64Processor implements Processor {
    private final WebDavStreamer streamer;

    @Override
    public void process(Exchange exchange) throws Exception {
        val req = exchange.getIn().getBody(Base64UploadRequestType.class);
        log.info("Got file: {} [len={}]", req.getFilename(), req.getContent().length);
        UUID uuid = UUID.randomUUID();
        streamer.uploadFixed(uuid.toString() + "/" + req.getFilename(), req.getContent());
        exchange.getOut().setBody(response());
    }

    private static Base64UploadResponseType response() {
        val fac = new ObjectFactory();
        val res = fac.createBase64UploadResponseType();
        res.setStatus(OK);
        return res;
    }
}
