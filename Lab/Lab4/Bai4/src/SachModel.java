
public class SachModel {
	private String masach;
	private String tensach;
	private String tacgia;
	private String nxb;
	private Double gia;
	public SachModel(String masach, String tensach, String tacgia, String nxb, Double gia) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.nxb = nxb;
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "SachModel [masach=" + masach + ", tensach=" + tensach + ", tacgia=" + tacgia + ", nxb=" + nxb + ", gia="
				+ gia + "]";
	}
	public SachModel() {
		super();
	}
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public String getNxb() {
		return nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	public Double getGia() {
		return gia;
	}
	public void setGia(Double gia) {
		this.gia = gia;
	}
	
	
}
