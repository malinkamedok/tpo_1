package DomenModel;

import java.util.ArrayList;
import java.util.List;

public class Universe {

    private List<Planet> alivePlanets = new ArrayList<>();

    public void addPlanet(String name){
        alivePlanets.add(new Planet(name));
    }

    public void printPlanetList(){
        for(Planet planet:alivePlanets){
            System.out.println(planet.toString());
        }
    }


}
