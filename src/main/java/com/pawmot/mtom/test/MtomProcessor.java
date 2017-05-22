package com.pawmot.mtom.test;

import com.pawmot.mtom.test.mtom.MtomUploadRequestType;
import com.pawmot.mtom.test.mtom.MtomUploadResponseType;
import com.pawmot.mtom.test.mtom.ObjectFactory;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.pawmot.mtom.test.mtom.MtomUploadStatusType.OK;

@Service
@Slf4j
@AllArgsConstructor
public class MtomProcessor implements Processor {
    private final WebDavStreamer streamer;

    @Override
    public void process(Exchange exchange) throws Exception {
        val req = exchange.getIn().getBody(MtomUploadRequestType.class);
        log.info("Got file: {} [len=?]", req.getFilename());
        UUID uuid = UUID.randomUUID();
        streamer.uploadStreaming(uuid.toString() + "/" + req.getFilename(), req.getContent().getInputStream());
        exchange.getOut().setBody(response());
    }

    private static MtomUploadResponseType response() {
        val fac = new ObjectFactory();
        val res = fac.createMtomUploadResponseType();
        res.setStatus(OK);
        return res;
    }
}
