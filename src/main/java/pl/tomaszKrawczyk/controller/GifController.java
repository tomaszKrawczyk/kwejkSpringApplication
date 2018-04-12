package pl.tomaszKrawczyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.tomaszKrawczyk.data.GifRepository;
import pl.tomaszKrawczyk.model.Gif;

import java.util.List;

/**
 * Created by Tomek Krawczyk on 22.02.2018.
 */

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifts(ModelMap modelMap){
        List<Gif>gifs=gifRepository.getAll_Gifs();
        modelMap.put("gifs",gifs);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){

        Gif gif=gifRepository.findByName(name);
        modelMap.put("gif",gif);

        return "gif-details";

    }

}
