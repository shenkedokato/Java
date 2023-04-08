package bai9;

public abstract class Xe {
	protected int hangHoa;
	protected double litXang;
	public Xe() {
		this.hangHoa = 0;
		this.litXang = 0;
	}
	public int getHangHoa() {
		return hangHoa;
	}
	public void setHangHoa(int hangHoa) {
		this.hangHoa = hangHoa;
	}
	public double getLitXang() {
		return litXang;
	}
	public void setLitXang(double litXang) {
		this.litXang = litXang;
	}
	
	public abstract int themHangHoa(int x);
	public abstract int botHangHoa(int x);
	public abstract double doXang(double x);
	public abstract double chayDoanDuong(double x);
	public abstract void hetXangChua();
	public abstract double luongXangConLai();
}
