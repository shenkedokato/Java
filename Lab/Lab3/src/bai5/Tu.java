package bai5;

public class Tu {
	private String tuTA;
	private String nghia;
	private String loai;
	private String ghiChu;

	public Tu() {
		
	}

	public Tu(String tuTA, String nghia, String loai, String ghiChu) {
		super();
		this.tuTA = tuTA;
		this.nghia = nghia;
		this.loai = loai;
		this.ghiChu = ghiChu;
	}

	public String getTuTA() {
		return tuTA;
	}

	public void setTuTA(String tuTA) {
		this.tuTA = tuTA;
	}

	public String getNghia() {
		return nghia;
	}

	public void setNghia(String nghia) {
		this.nghia = nghia;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Override
	public String toString() {
		return "Tu [tuTA=" + tuTA + ", nghia=" + nghia + ", loai=" + loai + ", ghiChu=" + ghiChu + "]";
	}

}
