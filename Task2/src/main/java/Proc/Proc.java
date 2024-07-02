package Proc;

public class Proc {
    private double weight;
    Cores cores;
    Herz herz;
    Vendor vendor;

    public Proc(double weight, Cores cores, Herz herz, Vendor vendor) {
        this.weight = weight;
        this.cores = cores;
        this.herz = herz;
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Cores getCores() {
        return cores;
    }

    public Herz getHerz() {
        return herz;
    }

    public Vendor getVendor() {
        return vendor;
    }
    @Override
    public String toString(){
        return "Processor: " + vendor + "; " + "Cores: " + cores + ";\n";
    }
}
