package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MdcBaseApplication {

    @RequestMapping(value = "/available")
    public String available() {
        return "Server available";
    }

    public static void main(String[] args) {
        SpringApplication.run(MdcBaseApplication.class);
    }
}
