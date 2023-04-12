package bai8;

public class Zattacker extends Robot {
    int P; //power = suc manh
    static int SumOfEnergyConsumtion = 0;


    public Zattacker(int p) {
        super(50);
        P = p;
        SumOfEnergyConsumtion += getEnergyConsumtion(10);
    }

    @Override
    public int getEnergyConsumtion(int S) {
        return M * S + P * P * S;
    }

    @Override
    public String toString() {
        return "Robot Zattacker" +
                "\nM = " + M +
                "\nP = " + P +
                "\nNang luong da dung = " + getEnergyConsumtion(10);
    }
}