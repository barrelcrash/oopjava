
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class RingingCentre {
    
    private Map<Bird, List<String>> observationList = new HashMap<Bird, List<String>>();
    
    public void observe(Bird bird, String place) {
        if (!observationList.containsKey(bird)) {
            observationList.put(bird, new ArrayList<String>());
        }
        
        List<String> placeList = observationList.get(bird);
        placeList.add(place);
    }
    
    public void observations(Bird bird) {
        int timesSeen = 0;
        List<String> placeList = null;
        
        if (observationList.containsKey(bird)) {
            placeList = observationList.get(bird);
            timesSeen = placeList.size();
        }
        
        System.out.println(bird.getLatinName() 
                + " (" + bird.getRingingYear() + ") observations: "
                + timesSeen);
        
        if (placeList != null) {
            for (String place : placeList) {
                System.out.println(place);
            }
        }
        
    }
}
