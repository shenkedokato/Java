
package bai3;


public class Pointer {

    private double x;
    
    private double y;

    
    public Pointer() {

    }

    //Constructor co tham so
    public Pointer(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void XuatThongTin() {
        System.out.print("Hoanh do:" + this.x
                + "\nTung do:" + this.y
                + "\n-----------\n");
    }

    public double KhoangCach(Pointer a) {
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
    }
}
