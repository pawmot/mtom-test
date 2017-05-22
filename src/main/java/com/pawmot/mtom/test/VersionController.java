package com.pawmot.mtom.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("version")
public class VersionController {
    @RequestMapping(method = GET)
    public String get() {
        return "0.0.1-SNAPSHOT";
    }
}
