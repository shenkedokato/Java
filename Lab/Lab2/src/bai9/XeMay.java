package bai9;

public class XeMay extends Xe {
	
	public XeMay() {
		super();
	}
	
	@Override
	public int themHangHoa(int x) {
		return  this.hangHoa += x;
	}

	@Override
	public int botHangHoa(int x) {
		return this.hangHoa -= x;
	}
	
	@Override
	public double doXang(double x) {
		return this.litXang += x;
		
	}

	@Override
	public double chayDoanDuong(double x) {
		return this.litXang = this.litXang - (0.02 * x + this.hangHoa * 0.01);
	}

	@Override
	public void hetXangChua() {
		if (this.litXang > 0) System.out.println("Xe con xang");
		else System.out.println("Xe het xang");
		
	}

	@Override
	public double luongXangConLai() {
		return this.litXang > 0 ? this.litXang : 0;
	}

	
	

}
