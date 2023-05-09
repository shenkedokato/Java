package bai1;

public class SinhVien {
	private long maSV;
	private String tenSV;
	private double diem;

	public SinhVien() {
	}

	public SinhVien(long maSV, String tenSV, double diem) {
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.diem = diem;
	}

	public long getMaSV() {
		return this.maSV;
	}

	public void setMaSV(long maSV) throws Exception {
		if (!String.valueOf(maSV).matches("\\d+")) {
			throw new Exception("maSV phai la so");
		}
		this.maSV = maSV;
	}

	public String getTenSV() {
		return this.tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public double getDiem() {
		return this.diem;
	}

	public void setDiem(double diem) throws Exception {
		if (!String.valueOf(diem).matches("^\\d*(\\.\\d+)?$")) {
			throw new Exception("Diem phai la so.");
		}
		if (diem < 0 || diem > 10) {
			throw new Exception("Diem phai thuoc [0; 10].");
		}
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "Sinhvien [maSV=" + maSV + ", tenSV=" + tenSV + ", diem=" + diem + "]";
	}
};
