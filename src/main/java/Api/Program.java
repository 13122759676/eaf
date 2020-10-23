package Api;

import Api.CheckOrders.CheckOrdersController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Program {
    public static void main(String[] args) throws Exception{
        //SpringApplication.run(TestController.class, args);
        SpringApplication.run(CheckOrdersController.class,args);
    }
}
