package HDD;

public class HDD {
    private int volume;
    private double weight;
    TypeOfHDD typeOfHDD;

    public HDD(int volume, double weight, TypeOfHDD typeOfHDD) {
        this.volume = volume;
        this.weight = weight;
        this.typeOfHDD = typeOfHDD;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
