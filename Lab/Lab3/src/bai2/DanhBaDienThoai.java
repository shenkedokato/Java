package bai2;

public class DanhBaDienThoai {
	private String sdt;
	private String diaChi;

	public DanhBaDienThoai() {
		
	}

	public DanhBaDienThoai(String sdt, String diaChi) {
		this.sdt = sdt;
		this.diaChi = diaChi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "DanhBaDienThoai [sdt=" + sdt + ", diaChi=" + diaChi + "]";
	}
}
