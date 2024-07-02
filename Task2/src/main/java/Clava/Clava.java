package Clava;

public class Clava {
    private double weight;

    TypeOfClava typeOfClava;
    Light light;

    public Clava(double weight, TypeOfClava typeOfClava, Light light) {
        this.weight = weight;
        this.typeOfClava = typeOfClava;
        this.light = light;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        if ( light == Light.HASLIGHT){
        return "Клавиатура: " + typeOfClava + "с подстветкой;\n";
        }
        else {
            return "Клавиатура: " + typeOfClava + "без подсветки;\n";
        }
    }
}
