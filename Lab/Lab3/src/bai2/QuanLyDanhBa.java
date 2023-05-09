package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyDanhBa {
	List<DanhBaDienThoai> danhSachDBDT;

	public QuanLyDanhBa() {
		danhSachDBDT = new ArrayList<>();
	}
	
	public void addDB(DanhBaDienThoai db) {
		this.danhSachDBDT.add(db);
	}
	
	public void show() {
		this.danhSachDBDT.forEach(db -> System.out.println(db.toString()));
	}

	public void showInfoBySDT(String sdt) {
		DanhBaDienThoai temp = danhSachDBDT.stream().filter(dt -> dt.getSdt().equals(sdt)).findFirst().orElse(null);
		if (temp != null) {
			System.out.println(temp.toString());
		} else
			System.out.println("khong tim thay sdt trong danh sach");
	}

	public List<DanhBaDienThoai> showSDTbyDCDK(String dc) {
		DanhBaDienThoai temp = danhSachDBDT.stream().filter(dt -> dt.getDiaChi().equals(dc)).findFirst().orElse(null);
		if (temp == null) {
			System.out.println("Khong tim thay dia chi trong danh sach");
			return null;
		}

		return danhSachDBDT.stream().filter(dt -> dt.getDiaChi().equals(dc)).collect(Collectors.toList());
	}

}
