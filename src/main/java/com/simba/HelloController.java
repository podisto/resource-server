package com.simba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by podisto on 09/10/2021.
 */
@RestController
public class HelloController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public endpoint";
    }

    @GetMapping("/private")
    public String privateEndpoint() {
        return "Private Endpoint";
    }
}
