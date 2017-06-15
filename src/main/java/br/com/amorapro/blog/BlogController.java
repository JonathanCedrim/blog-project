package br.com.amorapro.blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cedrim on 6/14/17.
 */

@RestController
public class BlogController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

}
