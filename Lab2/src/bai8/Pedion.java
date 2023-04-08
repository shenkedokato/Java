package bai8;

public class Pedion extends Robot {
    int F; //flexible = linh hoat
    static int SumOfEnergyConsumtion = 0;


    public Pedion(int f) {
        super(20);
        F = f;
        SumOfEnergyConsumtion += getEnergyConsumtion(10);
    }

    @Override
    public int getEnergyConsumtion(int S) {
        return M * S + ((F + 1) * S) / 2;
    }

    @Override
    public String toString() {
        return "Robot Pedion" +
                "\nM = " + M +
                "\nF = " + F +
                "\nNang luong da dung = " + getEnergyConsumtion(10);
    }
}