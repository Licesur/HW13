package Display;

public class Display {
    private double diag;
    private double weight;
    TypeOfDisplay typeOfDisplay;

    public Display(double diag, double weight, TypeOfDisplay typeOfDisplay) {
        this.diag = diag;
        this.weight = weight;
        this.typeOfDisplay = typeOfDisplay;
    }

    public double getDiag() {
        return diag;
    }

    public void setDiag(double diag) {
        this.diag = diag;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
