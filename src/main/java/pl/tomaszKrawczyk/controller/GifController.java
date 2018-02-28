package pl.tomaszKrawczyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tomek Krawczyk on 22.02.2018.
 */

@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifts(){
        return "homes";
    }
}
