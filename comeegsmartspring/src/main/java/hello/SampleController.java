package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiangqin on 17/3/9.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String home()
    {
        return "Hello world";
    }

    public static void main(String[] args)throws Exception
    {
        SpringApplication.run(SampleController.class,args);
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName)
    {
        return "Hello" + myName + "!!!";
    }
}
