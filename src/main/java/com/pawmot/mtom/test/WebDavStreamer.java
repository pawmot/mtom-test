package com.pawmot.mtom.test;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.cxf.helpers.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
@Slf4j
public class WebDavStreamer {
    private final String webDavUrl;

    public WebDavStreamer(@Value("${upload.webdav.url}") String webDavUrl) {
        this.webDavUrl = webDavUrl;
    }

    public boolean uploadStreaming(String fullFilename, InputStream stream) throws IOException {
        String fullPath = webDavUrl + "/" + fullFilename;
        log.info("Uploading file to {}", fullPath);
        URL url = new URL(fullPath);
        val conn = (HttpURLConnection) url.openConnection();

        conn.setDoOutput(true);
        conn.setChunkedStreamingMode(4096);
        conn.addRequestProperty("Accept", "*/*");
        conn.setRequestMethod("PUT");
        conn.addRequestProperty("Expect", "100-continue");
        conn.connect();

        OutputStream os = conn.getOutputStream();
        IOUtils.copy(stream, os);

        int responseCode = conn.getResponseCode();

        return responseCode / 100 == 2;
    }

    public boolean uploadFixed(String fullFilename, byte[] content) throws IOException {
        String fullPath = webDavUrl + "/" + fullFilename;
        log.info("Uploading file to {}", fullPath);
        URL url = new URL(fullPath);
        val conn = (HttpURLConnection) url.openConnection();

        conn.setDoOutput(true);
        conn.setFixedLengthStreamingMode(content.length);
        conn.addRequestProperty("Accept", "*/*");
        conn.setRequestMethod("PUT");
        conn.addRequestProperty("Expect", "100-continue");
        conn.connect();

        OutputStream os = conn.getOutputStream();
        os.write(content);
        os.flush();

        int responseCode = conn.getResponseCode();

        return responseCode / 100 == 2;
    }
}
