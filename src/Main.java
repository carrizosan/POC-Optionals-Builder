import java.util.*;

import static java.util.Objects.isNull;

public class Main {

    public static void main(String[] args) {

        List<Event> events = new ArrayList<Event>();

        events = Arrays.asList(new Event.BuilderEvent().id(1).name("Lolapalloza")
                            .location(new Location.BuilderLocation().id(2).name("Centro Cultural").build()).build(),
                            new Event.BuilderEvent().id(2).name("Futbol para todos")
                            .location(new Location.BuilderLocation().id(1).name("Polideportivo")
                            .city(new City.BuilderCity().id(1).name("Mar del Plata").build()).build()).build(),
                            new Event.BuilderEvent().id(2).name("Juegos Olimpicos")
                            .location(new Location.BuilderLocation().id(1).name("Estadio Azteca")
                            .city(new City.BuilderCity().id(2).name("Miramar").build()).build()).build(),
                            new Event.BuilderEvent().id(2).name("Basquet de primera")
                            .location(new Location.BuilderLocation().id(1).name("Estadio Generico")
                            .city(new City.BuilderCity().id(2).name("Olavarria").build()).build()).build(),
                            new Event.BuilderEvent().id(2).name("Futsal sub20")
                            .location(new Location.BuilderLocation().id(1).name("Punto Sur")
                            .city(new City.BuilderCity().id(2).name("Mar chiquita").build()).build()).build(),
                            new Event.BuilderEvent().id(2).name("Mundial de ajedrez para zurdos")
                            .location(new Location.BuilderLocation().id(1).name("La taberna de Moe")
                            .city(new City.BuilderCity().id(2).name("(Spring)field").build()).build()).build(),
                            new Event.BuilderEvent().id(2).name("El Supertazon")
                            .location(new Location.BuilderLocation().id(1).name("Estadio de los Isotopos")
                            .city(new City.BuilderCity().id(2).name("Albuquerque").build()).build()).build(),
                            new Event.BuilderEvent().id(2).name("Copa Davis Amateur")
                            .location(new Location.BuilderLocation().id(1).name("EMDER")
                            .city(new City.BuilderCity().id(2).name("Mar del Plata").build()).build()).build());


        Optional<Event> message = Optional.ofNullable(Event.getEventById(3, events));
        if(message.isPresent()){
            System.out.println(message.map(Event::getLocation)
                                    .map(Location::getCity)
                                    .map(City::getName)
                                    .orElse("Sin ciudad"));
        } else {
            System.out.println("No existe un evento para el id ingresado");
        }

        //Obtiene los primeros 5:
        System.out.println("Primeros 5: " + Event.getFirstFive(events));

        //Ordena un array con sort
        Collections.sort(events, Comparator.comparing(Event::getName));
        System.out.println("sorted:" + events);

        //Obtener los primeros 5 ya ordenados
        System.out.println("Primeros 5 PostSort: " + Event.getFirstFive(events));





//        try {
//            System.out.println(Optional.ofNullable(Event.getEventById(2, events)));
//        } catch (NoSuchElementException e) {
//            System.out.println(e.getMessage());
//        }



    }
}
