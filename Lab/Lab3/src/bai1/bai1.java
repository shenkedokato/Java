package bai1;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		try {
			System.out.print("MaSV: ");
			sv.setMaSV(sc.nextLong());

			System.out.print("TenSV: ");
			sc.nextLine();
			sv.setTenSV(sc.nextLine());

			System.out.print("Diem: ");
			sv.setDiem(sc.nextDouble());
			System.out.println(sv.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

};
