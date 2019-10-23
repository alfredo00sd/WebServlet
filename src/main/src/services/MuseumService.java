package services;

import models.Museum;

import java.util.ArrayList;
import java.util.List;

public class MuseumService {

    public List<Museum> getAllMuseums(){

        //create the museum list obj
        Museum national_museum = new Museum("Museo nacional tp","En honor a nuestras rarezas");
        Museum art_museum = new Museum("Museo de arte","En honor al arte");

        //Add the objects to an arrayList
        ArrayList<Museum> museums = new ArrayList<>();
        museums.add(national_museum);
        museums.add(art_museum);

        //Return the list of objects
        return museums;
    }
}
