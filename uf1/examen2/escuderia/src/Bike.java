// Author Juan Alejandro Marin Ruiz AKA 4strodev

public class Bike {
    public String id;
    public int power;
    public double weight;

    public Bike() {}

    public Bike(String id, int power, double weight) {
        this.id = id;
        this.power = power;
        this.weight = weight;
    }

    @Override
    public String toString() {
        var template = """
                ID: %s
                Potencia: %d
                Pes: %.2f""";

        return String.format(template, this.id, this.power, this.weight);
    }
}
