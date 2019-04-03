import jdk.nashorn.internal.objects.annotations.ScriptClass;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Event {

    private int id;
    private String name;
    private Location location;

    public Event() {}

    public Event(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return /*"Event*/"{" +
                /*"id=" + id +*/
                ", name='" + name + '\'' +
                /*", location=" + location +*/
                '}';
    }

    public static Event getEventById(int id, List<Event> events) /*throws NoSuchElementException */{

        for(Event e: events) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
        //throw new NoSuchElementException("No existe un evento para el id ingresado");
    }

    public static List<Event> getFirstFive(List<Event> events) {
        return events.stream().limit(5).collect(Collectors.toList());
    }

    public static class BuilderEvent {

        private int id;
        private String name;
        private Location location;

        public BuilderEvent() {}

        public Event build(){
            Event e = new Event();
            e.id = this.id;
            e.name = this.name;
            e.location = this.location;
            return e;
        }

        public BuilderEvent id(int id) {
            this.id = id;
            return this;
        }

        public BuilderEvent name(String name) {
            this.name = name;
            return this;
        }

        public BuilderEvent location(Location location) {
            this.location = location;
            return this;
        }

    }


}
