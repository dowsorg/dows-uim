package org.dows.uim.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication(scanBasePackages={"org.dows.*"})
public class UimAdminApplication {
    public static void main(String[] args) {

        SpringApplication.run(UimAdminApplication.class, args);
    }

    @Value("${spring.application.index}")
    private String index ;

    @RequestMapping("/")
    public String index(){
        return index;
    }

}
