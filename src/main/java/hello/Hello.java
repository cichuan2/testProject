package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Hello {
    @RequestMapping("hello")
    public void sayHello () {
        System.out.println("this is my firstProject， 这是我第一个springBoot项目");
    }

    public static void main(String[] args) {
        SpringApplication.run(Hello.class,args);
    }




}
