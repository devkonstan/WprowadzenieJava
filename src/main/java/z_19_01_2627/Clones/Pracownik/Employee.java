package z_19_01_2627.Clones.Pracownik;

public class Employee implements Cloneable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override //zmieniamy private na protected, zeby bylo to dostepne poza pakietem
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

