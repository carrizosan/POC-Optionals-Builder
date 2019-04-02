
public class City {

    private int id;
    private String name;

    public City() {}

    public City(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static class BuilderCity {

        private int id;
        private String name;

        public BuilderCity() {}

        public City build() {
            City c = new City();
            c.id = this.id;
            c.name = this.name;
            return c;
        }

        public BuilderCity id (int id) {
            this.id =  id;
            return this;
        }

        public BuilderCity name (String name) {
            this.name = name;
            return this;
        }
    }

}



