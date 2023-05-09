package bai4;

public class QuanBai {
	private String tenQB;
	private String thuocTinh;
	
	public QuanBai() {
	}
	
	public QuanBai(String tenQB, String thuocTinh) {
		this.tenQB = tenQB;
		this.thuocTinh = thuocTinh;
	}

	public String getTenQB() {
		return tenQB;
	}

	public void setTenQB(String tenQB) {
		this.tenQB = tenQB;
	}

	public String getThuocTinh() {
		return thuocTinh;
	}

	public void setThuocTinh(String thuocTinh) {
		this.thuocTinh = thuocTinh;
	}

	@Override
	public String toString() {
		return "QuanBai [tenQB=" + tenQB + ", thuocTinh=" + thuocTinh + "]";
	}

	
	

}
