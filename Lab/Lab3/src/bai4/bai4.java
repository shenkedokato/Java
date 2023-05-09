package bai4;

import java.util.ArrayList;
public class bai4 {

	public static void main(String[] args) {
		QuanLyQuanBai qlQB = new QuanLyQuanBai();
		qlQB.shuffle();
		ArrayList<QuanBai> nhom1 = qlQB.chiaBai(13);
		ArrayList<QuanBai> nhom2 = qlQB.chiaBai(13);
		ArrayList<QuanBai> nhom3 = qlQB.chiaBai(13);
		ArrayList<QuanBai> nhom4 = qlQB.chiaBai(13);

		System.out.println("nhom 1:");
		for (QuanBai QuanBai : nhom1) {
			System.out.println(QuanBai);
		}

		System.out.println("nhom 2:");
		for (QuanBai QuanBai : nhom2) {
			System.out.println(QuanBai);
		}

		System.out.println("nhom 3:");
		for (QuanBai QuanBai : nhom3) {
			System.out.println(QuanBai);
		}

		System.out.println("nhom 4:");
		for (QuanBai QuanBai : nhom4) {
			System.out.println(QuanBai);
		}
	}

}
