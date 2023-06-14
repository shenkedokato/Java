import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;

public class DSSachModel {
	private ArrayList<SachModel> listSach = new ArrayList<SachModel>();
	int soluong = 0;

	public DSSachModel() {
		super();
	}

	public DSSachModel(ArrayList<SachModel> listSach) {
		super();
		this.listSach = listSach;
	}
	
	public static DSSachModel getInstance()
	{
		return new DSSachModel();
	}
	
	public boolean Themsach(SachModel sach) {
		for(SachModel i:listSach)
		{
			if (i.getMasach().equals(sach.getMasach()))
			{
				return false;
			}
		}
		this.listSach.add(sach);
		this.soluong++;
		return true;
	}

	public SachModel LayThongTinSach(int i) {
		for (int j = 0; j < listSach.size(); j++) {
			if (i == j) {
				SachModel sach = new SachModel(listSach.get(i).getMasach(), listSach.get(i).getTensach(),
						listSach.get(i).getTacgia(), listSach.get(i).getNxb(), listSach.get(i).getGia());
				return sach;
			}
		}
		return null;
	}

	public boolean Xoasach(String Masach) {
		for (int i = 0; i < listSach.size(); i++) {
			if (listSach.get(i).getMasach().equals(Masach)) {
				listSach.remove(i);
				this.soluong--;
				return true;
			}
		}
		return false;
	}

	public SachModel Timsach(String Masach) {
		for (int i = 0; i < listSach.size(); i++) {
			if (listSach.get(i).getMasach().equals(Masach)) {
				SachModel sach = new SachModel(listSach.get(i).getMasach(), listSach.get(i).getTensach(),
						listSach.get(i).getTacgia(), listSach.get(i).getNxb(), listSach.get(i).getGia());
				return sach;
			}
		}
		return null;
	}

	public void CapNhatThongTinSach(String masach, String tens, String tg, String nxb, double gia) {
		for (int i = 0; i < listSach.size(); i++) {
			if (listSach.get(i).getMasach().equals(masach)) {
				listSach.get(i).setTensach(tens);
				listSach.get(i).setGia(gia);
				listSach.get(i).setNxb(nxb);
				listSach.get(i).setTacgia(nxb);
				return;
			}
		}
	}

	public int TongSoSach() {
		return soluong;
	}
	public ArrayList<SachModel> returnListSach()
	{
		return this.listSach;
	}

}
