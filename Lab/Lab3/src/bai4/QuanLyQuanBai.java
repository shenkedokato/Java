package bai4;

import java.util.ArrayList;
import java.util.Collections;

public class QuanLyQuanBai {
    private ArrayList<QuanBai> dsQuanBai;

    public QuanLyQuanBai() {
        dsQuanBai = new ArrayList<QuanBai>();
        String[] thuocTich = {"co", "ro", "chuon", "bich"};
        String[] tenQB = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String s : thuocTich) {
            for (String r : tenQB) {
                QuanBai QuanBai = new QuanBai(s, r);
                dsQuanBai.add(QuanBai);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(dsQuanBai);
    }

    public ArrayList<QuanBai> chiaBai(int n) {
        int sizeBai = dsQuanBai.size();
        ArrayList<QuanBai> nhom = new ArrayList<QuanBai>();
        for (int i = 0; i < n; i++) {
            nhom.add(dsQuanBai.remove(sizeBai-i-1));
        }
        return nhom;
    }
    
    public void show() {
    	dsQuanBai.forEach(qb -> System.out.println(qb.toString()));
    }
}

