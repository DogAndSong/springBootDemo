package quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*

扫描的是startService的一下的包

 */
@SpringBootApplication
@ComponentScan(basePackages = {"C"})
public class StartService {

    public static void main(String[] args){
        SpringApplication.run(StartService.class,args);
    }
}
