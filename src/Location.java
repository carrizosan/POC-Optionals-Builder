
public class Location{

    private int id;
    private String name;
    private City city;

    public Location() {}

    public Location(int id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    public static class BuilderLocation {

        private int id;
        private String name;
        private City city;

        public BuilderLocation() {}

        public Location build() {
            Location l = new Location();
            l.id = this.id;
            l.name = this.name;
            l.city = this.city;
            return l;
        }

        public BuilderLocation id (int id) {
            this.id =  id;
            return this;
        }

        public BuilderLocation name (String name) {
            this.name = name;
            return this;
        }

        public BuilderLocation city (City city) {
            this.city = city;
            return this;
        }
    }






}
