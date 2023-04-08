package bai8;

public abstract class Robot {
    int M; //mass = khoi luong


    public Robot(int m) {
        M = m;
    }

    public abstract int getEnergyConsumtion(int S);
    public abstract String toString();
}
