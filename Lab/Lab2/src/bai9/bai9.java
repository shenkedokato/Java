package bai9;

public class bai9 {
	public static void main(String[] args) {
		Xe xeMay = new XeMay();
		Xe xeTai = new XeTai();
		xeMay.doXang(3);
		xeMay.themHangHoa(5);
		xeMay.chayDoanDuong(30);
		xeMay.hetXangChua();
		System.out.println("Luong xang con lai cua xe may: " + xeMay.luongXangConLai());
		xeTai.doXang(30);
		xeTai.themHangHoa(1000);
		xeTai.chayDoanDuong(130);
		xeTai.hetXangChua();
		System.out.println("Luong xang con lai cua xe tai: " + xeTai.luongXangConLai());
	}
}
