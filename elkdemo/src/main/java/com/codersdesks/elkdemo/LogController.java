package com.codersdesks.elkdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/log")
public class LogController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/write")
    public String writeLog(@RequestParam("requester") String requester){
        logger.info("running writeLog () requester is ", requester);
        return "Successfully written logs.";
    }

    @GetMapping("/write/exception")
    public String writeException(@RequestParam("requester") String requester){
        logger.info("running writeException () requester is ", requester);
        try{
            Integer a = null;
            System.out.println(a+10);
        }catch (Exception e){
            logger.error("this is intentional {}",e.getMessage(), e);
        }
        return "Successfully written Exception.";
    }

}
