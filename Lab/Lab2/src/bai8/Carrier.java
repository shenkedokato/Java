package bai8;

public class Carrier extends Robot {
    int E; //energy = nang luong
    static int SumOfEnergyConsumtion = 0;


    public Carrier(int e) {
        super(30);
        E = e;
        SumOfEnergyConsumtion += getEnergyConsumtion(10);
    }

    @Override
    public int getEnergyConsumtion(int S) {
        return M * S + 4 * E * S;
    }

    @Override
    public String toString() {
        return "Robot Carrier" +
                "\nM = " + M +
                "\nE = " + E +
                "\nNang luong da dung = " + getEnergyConsumtion(10);
    }
}

