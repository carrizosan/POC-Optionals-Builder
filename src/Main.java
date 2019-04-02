import java.util.*;

import static java.util.Objects.isNull;

public class Main {

    public static void main(String[] args) {

        List<Event> events = new ArrayList<Event>();

        City c = new City.BuilderCity().id(1).name("Mar del Plata").build();
        City c2 = new City.BuilderCity().id(2).name("Miramar").build();
        Location l = new Location.BuilderLocation().id(1).name("Polideportivo").city(c).build();
        Location noCityLoc = new Location.BuilderLocation().id(2).name("Centro Cultural").build();

        events = Arrays.asList(new Event.BuilderEvent().id(1).name("Lolapalloza").location(noCityLoc).build(),
                            new Event.BuilderEvent().id(2).name("Futbol para todos").location(l).build());

        Optional<Event> message = Optional.ofNullable(Event.getEventById(2, events));
        if(message.isPresent()){
            System.out.println(message.map(Event::getLocation)
                                    .map(Location::getCity)
                                    .map(City::getName)
                                    .orElse("Sin ciudad"));
        } else {
            System.out.println("No existe un evento para el id ingresado");
        }

//        try {
//            System.out.println(Optional.ofNullable(Event.getEventById(2, events)));
//        } catch (NoSuchElementException e) {
//            System.out.println(e.getMessage());
//        }



    }
}
