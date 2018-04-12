package pl.tomaszKrawczyk.data;

import org.springframework.stereotype.Component;
import pl.tomaszKrawczyk.model.Gif;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tomek Krawczyk on 28.02.2018.
 */

@Component
public class GifRepository {

    private static final List<Gif>All_Gifs= Arrays.asList(

            new Gif("android-explosion","krawcu",true),
            new Gif("ben-and-mike","badyl",false),
            new Gif("book-dominos","krawczyk",true),
            new Gif("compiler-bot","chudy",false),
            new Gif("cowboy-coder","skowron",true),
            new Gif("infinite-andrew","baran",false)
            );

    public Gif findByName(String name){

        for (Gif gif:All_Gifs) {

            if (gif.getName().equals(name))
                return gif;

        }
        return null;

    }


    public List<Gif>getAll_Gifs(){
        return All_Gifs;
    }

}
