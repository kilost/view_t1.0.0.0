package com.cqset.vx.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@RestController



public class App 
{
    @RequestMapping("/")

    public String Home(){
        return "vidio frame vidio frame vidio frame vidio frame \n" +
                "v\n" +"                                         v\n"+
                "i\n" +"                                         v\n"+
                "d\n" +"                                         v\n"+
                "i\n" +"                                         v\n"+
                "o\n" +"                                         v\n"+
                "\n"+  "                                         v\n"+
                "vidio frame vidio frame vidio frame vidio frame \n" ;
    }
    public static void main( String[] args ) {





        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);

    }
}
