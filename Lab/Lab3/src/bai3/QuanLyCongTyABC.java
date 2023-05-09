package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

public class QuanLyCongTyABC{

	public static void main(String[] args) {
		List<String> dsNhanVien = new ArrayList<>();
		dsNhanVien.add("N V A");
		dsNhanVien.add("N V E");
		dsNhanVien.add("N V C");
		dsNhanVien.add("N V D");
		dsNhanVien.add("N V D");
		dsNhanVien.add("N V E");
		dsNhanVien.add("N V D");
		dsNhanVien.add("N V F");
		dsNhanVien.add("N V G");
		dsNhanVien.add("N V H");
		dsNhanVien.add("N V F");
		dsNhanVien.add("N V A");
		dsNhanVien.add("N V E");
		dsNhanVien.add("N V C");
		dsNhanVien.add("N V I");
		dsNhanVien.add("N V K");
		dsNhanVien.add("N V E");
		dsNhanVien.add("N V D");
		dsNhanVien.add("N V F");
		dsNhanVien.add("N V M");
		dsNhanVien.add("N V F");
		dsNhanVien.add("N V N");
		dsNhanVien.add("N V A");
		dsNhanVien.add("N V O");
		dsNhanVien.add("N V C");
		dsNhanVien.add("N V D");
		dsNhanVien.add("N V U");
		dsNhanVien.add("N V E");
		dsNhanVien.add("N V D");
		dsNhanVien.add("N V F");


		Random rand = new Random();
		int quaTang = rand.nextInt(dsNhanVien.size());
		System.out.println("Nhan vien nhan qua cua thang la: " + dsNhanVien.get(quaTang));


		TreeSet<String> dsSanPham = new TreeSet<>();

		dsSanPham.addAll(dsNhanVien);
		System.out.println("Danh Sach San Pham");
		dsSanPham.forEach(sp -> System.out.println(sp.toString()));


		Map<String, Integer> count = new HashMap<>();
		int maxCount = 0;
		for (String nv : dsNhanVien) {
			if (count.containsKey(nv)) {
				int updatedCount = count.get(nv) + 1;
				count.put(nv, updatedCount);
				maxCount = Math.max(maxCount, updatedCount);
			} else {
				count.put(nv, 1);
				maxCount = Math.max(maxCount, 1);
			}
		}

		for (Map.Entry<String, Integer> entry : count.entrySet()) {
			if (entry.getValue() == maxCount) {
				System.out.println("Ten san pham moi la (ten nhan vien pho bien nhat -> " + entry.getValue() + " lan): "
						+ entry.getKey());
				dsSanPham.add(entry.getKey());
			}
		}


		TreeSet<Integer> random20DKDL = new TreeSet<>();
		Random randDK = new Random();
		for(int i=0;i<20;i++){
			random20DKDL.add(randDK.nextInt(dsNhanVien.size()));
		}

		
		List<String> dsDangkyDuLich = new ArrayList<>();
		for (Integer i : random20DKDL) {
			dsDangkyDuLich.add(dsNhanVien.get(i));
		}
		
		System.out.println("Danh Sach Nhan vien:");
		dsDangkyDuLich.forEach(dk -> System.out.println(dk.toString()));

		
		HashMap<String, Double> dsKhachHang = new HashMap<String, Double>();
		dsKhachHang.put("KH A", 1000.0);
		dsKhachHang.put("KH B", 5000.0);
		dsKhachHang.put("KH C", 2000.0);
		dsKhachHang.put("KH D", 5500.0);
		dsKhachHang.put("KH E", 3000.0);

		
		List<Map.Entry<String, Double>> dsSapXep = new ArrayList<>(dsKhachHang.entrySet());

		
		Collections.sort(dsSapXep, new Comparator<Map.Entry<String, Double>>() {
			public int compare(Map.Entry<String, Double> entry1, Map.Entry<String, Double> entry2) {
				return (int) (entry2.getValue() - entry1.getValue());
			}
		});

		System.out.println("Danh sach khach hang da sap xep theo doanh so giam dan: ");
		for (Map.Entry<String, Double> entry : dsSapXep) {
			System.out.println("Khach hang: " + entry.getKey() + ", Doanh so: " + entry.getValue());
		}
		
		
	}
}
