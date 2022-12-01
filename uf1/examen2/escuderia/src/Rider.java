// Author Juan Alejandro Marin Ruiz AKA 4strodev

public class Rider {
    public String name;
    public double weight;
    public Bike bike;

    public Rider(String name, double weight, Bike bike) {
        this.name = name;
        this.weight = weight;
        this.bike = bike;
    }

    @Override
    public String toString() {
        var template = """
                Nom: %s
                Pes: %.2f
                MOTO
                ++++++++++++
                %s""";
        return String.format(template, this.name, this.weight, this.bike);
    }
}
