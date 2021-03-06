package net.newstring.weaver.controller;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created by aaron on 5/30/2016.
 */
@Service
public class EnvController {


    @ExtDirectMethod(group = "simple")
    public String doEcho(String string) {
        return string;
    }

    @ExtDirectMethod(group = "simple")
    public Long randomLong() {
        return new Double(Math.random() * Long.MAX_VALUE).longValue();
    }

    @ExtDirectMethod(group = "simple")
    public String doEcho(String message, HttpServletRequest request) {
        //do something with the request
        return message;
    }

    @ExtDirectMethod(group = "simple")
    public String randomUUID(){
        return UUID.randomUUID().toString();
    }

}
