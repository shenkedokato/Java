package bai5;

import java.util.TreeMap;

public class TuDien {
    private TreeMap<String, Tu> dsTu;

    public TuDien() {
        dsTu = new TreeMap<>();
    }

    public void addTu(String tuTA, String nghia, String loai, String ghiChu) {
        Tu Tu = new Tu(tuTA, nghia, loai, ghiChu);
        dsTu.put(tuTA.toLowerCase(), Tu);
    }

    public void traTu(String tuTA) {
        Tu t = dsTu.get(tuTA.toLowerCase());
        if (t != null) {
            System.out.println(t.toString());
        } else {
            System.out.println("khong tim thay trong TuDien.");
        }
    }

}
