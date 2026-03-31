// Normal class version (old way)
/*
class Alien {
    private final int id;
    private final String name;

    public Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // toString()
    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + "]";
    }

    // hashCode()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Alien other = (Alien) obj;
        return id == other.id && name.equals(other.name);
    }
}
*/

// Record version (new way)
record Alien(int id, String name) {
}

class RecordsDemo {
    public static void main(String[] args) {

        Alien alien1 = new Alien(1, "Alien One");
        Alien alien2 = new Alien(1, "Alien One");

        // Record methods
        System.out.println(alien1.id());
        System.out.println(alien1.name());
        System.out.println(alien1);
        System.out.println(alien1.equals(alien2));
    }
}