import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JButton;

public class QuanLiSachView extends JFrame {

	private JPanel contentPane;
	private JTextField txtMasach;
	private JTextField txtTenSach;
	private JTextField txtGia;
	private JTextField txtTG;
	private JTextField txtNXB;
	private JTable table;
	private DSSachModel dsSach = new DSSachModel();

	public QuanLiSachView() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel jLabelTTsach = new JLabel("Thông tin sách");
		jLabelTTsach.setBounds(338, 11, 161, 27);
		jLabelTTsach.setFont( new Font("Arial", Font.BOLD, 22));
		
		contentPane.add(jLabelTTsach);
		
		JLabel jlabMaSach = new JLabel("Mã sách");
		jlabMaSach.setFont(new Font("Arial", Font.BOLD, 13));
		jlabMaSach.setBounds(32, 62, 58, 14);
		contentPane.add(jlabMaSach);
		
		JLabel jlabTensach = new JLabel("Tên sách");
		jlabTensach.setFont(new Font("Arial", Font.BOLD, 13));
		jlabTensach.setBounds(32, 99, 58, 14);
		contentPane.add(jlabTensach);
		
		JLabel jlabGia = new JLabel("Giá");
		jlabGia.setFont(new Font("Arial", Font.BOLD, 13));
		jlabGia.setBounds(32, 134, 58, 14);
		contentPane.add(jlabGia);
		
		txtMasach = new JTextField("");
		txtMasach.setBounds(109, 59, 198, 20);
		contentPane.add(txtMasach);
		
		txtTenSach = new JTextField("");
		txtTenSach.setColumns(10);
		txtTenSach.setBounds(109, 96, 198, 20);
		contentPane.add(txtTenSach);
		
		txtGia = new JTextField("");
		txtGia.setColumns(10);
		txtGia.setBounds(109, 131, 198, 20);
		contentPane.add(txtGia);
		
		JLabel jlabTacgia = new JLabel("Tác giả");
		jlabTacgia.setFont(new Font("Arial", Font.BOLD, 13));
		jlabTacgia.setBounds(415, 62, 58, 14);
		contentPane.add(jlabTacgia);
		
		JLabel jlabNXB = new JLabel("Nhà xuất bản");
		jlabNXB.setFont(new Font("Arial", Font.BOLD, 13));
		jlabNXB.setBounds(415, 99, 107, 14);
		contentPane.add(jlabNXB);
		
		txtTG = new JTextField("");
		txtTG.setColumns(10);
		txtTG.setBounds(529, 59, 198, 20);
		contentPane.add(txtTG);
		
		txtNXB = new JTextField("");
		txtNXB.setColumns(10);
		txtNXB.setBounds(529, 96, 198, 20);
		contentPane.add(txtNXB);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 s\u00E1ch", "T\u00EAn s\u00E1ch", "T\u00E1c gi\u1EA3", "NXB", "Gi\u00E1"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.setBounds(36, 180, 691, 178);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(32, 180, 691, 178);
		contentPane.add(scrollPane);
		
		JButton jbutThem = new JButton("Thêm");
		jbutThem.setBounds(36, 397, 89, 23);
		contentPane.add(jbutThem);
		jbutThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChucNangThem();
			}
		});
		
		JButton jbutXoa = new JButton("Xóa");
		jbutXoa.setBounds(135, 397, 89, 23);
		contentPane.add(jbutXoa);
		jbutXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChucNangXoa();
			}
		});
		
		JButton jbutSua = new JButton("Sửa");
		jbutSua.setBounds(234, 397, 89, 23);
		contentPane.add(jbutSua);
		jbutSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CChucNangSua();
				
			}
		});
		
		JButton jbutLuu = new JButton("Lưu");
		jbutLuu.setBounds(338, 397, 89, 23);
		contentPane.add(jbutLuu);
		jbutLuu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChucNangLuu();
				
			}
		});
		
		JButton jbutTim = new JButton("Tìm");
		jbutTim.setBounds(437, 397, 89, 23);
		contentPane.add(jbutTim);
		jbutTim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChucNangTim();
				
			}
		});
		
		JButton jbutClear = new JButton("Clear");
		jbutClear.setBounds(539, 397, 89, 23);
		contentPane.add(jbutClear);
		jbutClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChucNangClear();
				
			}
		});
		
		JButton jbutThoat = new JButton("Thoát");
		jbutThoat.setBounds(638, 397, 89, 23);
		contentPane.add(jbutThoat);
		jbutThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChucNangThoat();
			}
		});
		
		

		 try {
				DefaultTableModel model_table= (DefaultTableModel) table.getModel();
	            FileReader reader = new FileReader("C:/Users/DPSDEV/eclipse-workspace/Practice_login/litSach.txt");
	            BufferedReader bufferedReader = new BufferedReader(reader);

	            String line = bufferedReader.readLine();
	            while (line != null) {
	                System.out.println(line);
	                String [] data = line.split("\\#");
	    			model_table.addRow(new Object[] {data[0], data[1], data[2], data[3], data[4]});
	    			SachModel sach = new SachModel(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
	    			this.dsSach.Themsach(sach);
	                line = bufferedReader.readLine();
	            }
	            bufferedReader.close();
	        } catch (IOException e) {
	            System.out.println("Lỗi đọc dữ liệu từ file: " + e.getMessage());
	        }
		
		setBounds(100, 100, 766, 500);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void ChucNangThem()
	{
		if(txtMasach.getText().equals("") || txtTenSach.getText().equals("") 
				|| txtGia.getText().equals("") || txtNXB.getText().equals("") || txtTG.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this, "các ô không được bỏ trống", "Không Thành Công", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			try {
				String masach = txtMasach.getText();
				String tensach = txtTenSach.getText();
				String tg = txtTG.getText();
				String nxb = txtNXB.getText();
				Double gia = Double.parseDouble(txtGia.getText()) + 0.0;
				SachModel sachmoi  = new SachModel(masach, tensach, tg, nxb, gia);
				
				if ((this.dsSach.Timsach(masach) == null) )
				{
					this.dsSach.Themsach(sachmoi);
					JOptionPane.showMessageDialog(this, "Thêm mới thành công", "Thành công", JOptionPane.DEFAULT_OPTION);
					ShowTable();
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Sách bị trùng",
							"KhôngThành Công", JOptionPane.ERROR_MESSAGE);
				}
				
			} catch (NumberFormatException e) {
			    JOptionPane.showMessageDialog(this, "Vui lòng nhập một số hợp lệ!");
			}
		}
	}
	public void ChucNangXoa()
	{
		int kq = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sách này không",
				"Chắc chắn", JOptionPane.YES_NO_OPTION);
		if (kq == JOptionPane.YES_NO_OPTION)
		{
			this.dsSach.Xoasach(txtMasach.getText());
			ShowTable();
		}
		return;
	}
	public void CChucNangSua()
	{
		try {
			Double gia = Double.parseDouble(txtGia.getText()) + 0.0;
			this.dsSach.CapNhatThongTinSach(txtMasach.getText(), 
					txtTenSach.getText(), txtTG.getText(), txtNXB.getText(), gia);
			ShowTable();
		} catch (NumberFormatException e) {
		    JOptionPane.showMessageDialog(this, "Vui lòng nhập một số hợp lệ!");
			e.printStackTrace();
		}
	}
	public void ChucNangLuu()
	{
		try {
			FileWriter writer = new FileWriter("C:/Users/DPSDEV/eclipse-workspace/Practice_login/litSach.txt");
			for(SachModel i:dsSach.returnListSach())
			{
				writer.write(i.getMasach() + "#" + i.getTensach() + "#" +i.getTacgia()
				+ "#" + i.getNxb() + "#" + i.getGia()+ "\n");
			}
			writer.close();
			JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công", "Thành công", JOptionPane.DEFAULT_OPTION);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ChucNangTim()
	{
		SachModel sach = this.dsSach.Timsach(txtMasach.getText());
		if(sach != null)
		{
			DefaultTableModel model_table= (DefaultTableModel) table.getModel();
			model_table.setRowCount(0);
			model_table.addRow(new Object[] {sach.getMasach(), sach.getTensach(), sach.getTacgia(),
					sach.getNxb(), sach.getGia()});
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Không tìm thấy sách");
		}
	}
	public void ChucNangClear()
	{
		txtGia.setText("");
		txtMasach.setText("");
		txtNXB.setText("");
		txtTenSach.setText("");
		txtTG.setText("");
	}
	public void ChucNangThoat()
	{
		System.exit(0);
	}
	public void ShowTable()
	{
		DefaultTableModel model_table= (DefaultTableModel) table.getModel();
		model_table.setRowCount(0);
		for (SachModel s : dsSach.returnListSach()) {
	        System.out.println(s.getMasach());
	    }
		for(SachModel i:this.dsSach.returnListSach())
		{
			model_table.addRow(new Object[] {i.getMasach(), i.getTensach(), i.getTacgia(), i.getNxb(), i.getGia()});
		}
		model_table.fireTableDataChanged();
	}
	
}
