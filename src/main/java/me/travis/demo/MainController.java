package me.travis.demo;

import org.codehaus.groovy.ast.stmt.DoWhileStatement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @RequestMapping("/")
    public String showmagicnumber(@RequestParam("number") int number) {

        StringBuilder stringBuilder = new StringBuilder();

        String number3 = "";

        while(number>1){

            //Magic Number odd number code
                    if (number % 2 != 0) {
                    number = number * 3 + 1;
                    System. out.println(number);
                    stringBuilder.append(number);
                    stringBuilder.append("<br>");


                    }
                    //Magic number even number code
                    else if (number % 2 == 0){
                        number = number/2;
                        System.out.println(number);
                        stringBuilder.append(number);
                        stringBuilder.append("<br>");

                    }




            }

            return stringBuilder.toString();

    }

}

