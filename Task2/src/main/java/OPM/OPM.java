package OPM;

public class OPM {
    private int volume;
    private double weight;
    Type type;

    public OPM(int volume, double weight, Type type) {
        this.volume = volume;
        this.weight = weight;
        this.type = type;
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
    public String toString(){
        return "Оперативная память: " + type + " " + volume + " GB;\n";
    }
}
