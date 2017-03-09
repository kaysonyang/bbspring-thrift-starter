import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bob on 17/1/11.
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
@ComponentScan(basePackages ={"com.*","cloud.*"} )
public class ThriftApp {

    public static void main(String[] args) {
        SpringApplication.run(ThriftApp.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
}