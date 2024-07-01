package Computer;

import Clava.Clava;
import Display.Display;
import HDD.HDD;
import OPM.OPM;
import Proc.Proc;

public class Computer {
    Proc proc;
    OPM oper;
    HDD hdd;
    Display display;
    Clava clava;
    public final String VENDOR = "Apple";
    public final String Name = "Alex";

    public Computer(Proc proc, OPM oper, HDD hdd, Display display, Clava clava) {
        this.proc = proc;
        this.oper = oper;
        this.hdd = hdd;
        this.display = display;
        this.clava = clava;
    }

    public double weight() {
        return proc.getWeight() + oper.getWeight() + hdd.getWeight() + display.getWeight() + clava.getWeight();
    }

    public Proc getProc() {
        return proc;
    }

    public void setProc(Proc proc) {
        this.proc = proc;
    }

    public OPM getOper() {
        return oper;
    }

    public void setOper(OPM oper) {
        this.oper = oper;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public Display getDisplay() {
        return display;
    }


    public void setDisplay(Display display) {
        this.display = display;
    }

    public Clava getClava() {
        return clava;
    }

    public void setClava(Clava clava) {
        this.clava = clava;
    }

    public String toString() {
        return "Computer Info:\n" + "Processor: " + proc.getVendor();
    }
}

