package com.tikal.k8ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    private static final String template = "Hello, %s! -> host: %s\n";

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        String hostAddr =  inetAddress.getHostAddress();
        return String.format(template,name,hostAddr);
    }
}
