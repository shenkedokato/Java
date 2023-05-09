package bai2;

public class bai2 {

	public static void main(String[] args) {
		QuanLyDanhBa ql = new QuanLyDanhBa();
		DanhBaDienThoai db1 = new DanhBaDienThoai("0123456780", "TP HCM");
		DanhBaDienThoai db2 = new DanhBaDienThoai("0123456781", "TP HCM");
		DanhBaDienThoai db3 = new DanhBaDienThoai("0123456782", "Dong nai");
		DanhBaDienThoai db4 = new DanhBaDienThoai("0123456783", "Go Cong");
		DanhBaDienThoai db5 = new DanhBaDienThoai("0123456789", "Gia Lai");

		ql.addDB(db1);
		ql.addDB(db2);
		ql.addDB(db3);
		ql.addDB(db4);
		ql.addDB(db5);
		ql.show();

		System.out.println("______Search by SDT______ ");
		ql.showInfoBySDT("0123456789");

		System.out.println("______Search by DC______ ");
		ql.showSDTbyDCDK("TP HCM").forEach(db -> System.out.println(db.toString()));

	}

}
