package giaoDien;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import model.ChiTietHoaDon;
import model.HoaDon;
import model.KhachHang;
import model.NhanVien;
import tienIch.AppConstants;
import xuLyDuLieu.ChiTietHoaDonDB;
import xuLyDuLieu.HoaDonDB;
import xuLyDuLieu.KhachHangDB;
import xuLyDuLieu.NhanVienDB;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class PnlCTHD extends JPanel {
	private JButton btnHienCN;
	private JButton btnHienThem;
	private JTable table;
	private JTextField textField;
	private HoaDon hoaDon = null;
	private List<HoaDon> listAllHD = null;
	private List<ChiTietHoaDon> listCTHD = null;
	private JComboBox<String> cboChonHD;
	private JLabel lblMaHD;
	private JLabel lblNgHD;
	private JLabel lblTenKH;
	private JLabel lblTenNV;

	/**
	 * Create the panel.
	 */
	public PnlCTHD() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(222, 226, 230));
		panel.setBounds(0, 0, 743, 814);
		add(panel);
		
		cboChonHD = new JComboBox();
		cboChonHD.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selected = (String) cboChonHD.getSelectedItem();
				HoaDonDB hdDB = new HoaDonDB();
				KhachHangDB khDB = new KhachHangDB();
				NhanVienDB nvDB = new NhanVienDB();
				hoaDon = hdDB.timTheoSoHD(Integer.parseInt(selected.substring(0, 4)));
				lblMaHD.setText(String.valueOf(hoaDon.getSoHoaDon()));
				lblNgHD.setText(hoaDon.getNgayHoaDonToString());
				KhachHang kh = khDB.timTheoMaKH(hoaDon.getMaKhachKhang());
				lblTenKH.setText((kh==null?"<trống>":kh.getHoTen()));
				NhanVien nv = nvDB.timTheoMaNV(hoaDon.getMaNhanVien());
				lblTenNV.setText((nv==null?"<trống>":nv.getHoTen()));
			}
		});
		cboChonHD.setModel(new DefaultComboBoxModel(new String[] {"HD01", "HD02", "HD03"}));
		cboChonHD.setFont(new Font("Arial", Font.PLAIN, 20));
		cboChonHD.setBounds(264, 11, 469, 43);
		panel.add(cboChonHD);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 148, 723, 488);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mã HD:");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_2_2.setBounds(20, 65, 107, 33);
		panel.add(lblNewLabel_2_2);
		
		lblMaHD = new JLabel("...");
		lblMaHD.setFont(new Font("Arial", Font.BOLD, 22));
		lblMaHD.setBounds(137, 65, 144, 33);
		panel.add(lblMaHD);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Tên KH:");
		lblNewLabel_2_2_2.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_2_2_2.setBounds(309, 66, 94, 33);
		panel.add(lblNewLabel_2_2_2);
		
		lblTenNV = new JLabel("...");
		lblTenNV.setFont(new Font("Arial", Font.BOLD, 22));
		lblTenNV.setBounds(413, 104, 303, 33);
		panel.add(lblTenNV);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Ngày tạo:");
		lblNewLabel_2_2_2_1.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_2_2_2_1.setBounds(20, 103, 106, 33);
		panel.add(lblNewLabel_2_2_2_1);
		
		lblNgHD = new JLabel("...");
		lblNgHD.setFont(new Font("Arial", Font.BOLD, 22));
		lblNgHD.setBounds(137, 103, 144, 33);
		panel.add(lblNgHD);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("Tên NV:");
		lblNewLabel_2_2_2_2.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_2_2_2_2.setBounds(309, 104, 94, 33);
		panel.add(lblNewLabel_2_2_2_2);
		
		lblTenKH = new JLabel("...");
		lblTenKH.setFont(new Font("Arial", Font.BOLD, 22));
		lblTenKH.setBounds(413, 65, 303, 33);
		panel.add(lblTenKH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 647, 723, 156);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Trị giá:");
		lblNewLabel_2_2_3.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_2_2_3.setBounds(180, 11, 120, 33);
		panel_2.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("20.000.000 VNĐ");
		lblNewLabel_2_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2_4.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_2_2_4.setBounds(379, 11, 334, 33);
		panel_2.add(lblNewLabel_2_2_4);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("Thuế GTGT (10%)");
		lblNewLabel_2_2_3_1.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_2_2_3_1.setBounds(180, 55, 189, 33);
		panel_2.add(lblNewLabel_2_2_3_1);
		
		JLabel lblNewLabel_2_2_4_1 = new JLabel("2.000.000 VNĐ");
		lblNewLabel_2_2_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2_4_1.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_2_2_4_1.setBounds(379, 55, 334, 33);
		panel_2.add(lblNewLabel_2_2_4_1);
		
		JLabel lblNewLabel_2_2_3_2 = new JLabel("Thành tiền:");
		lblNewLabel_2_2_3_2.setForeground(new Color(AppConstants.MAU_DO));
		lblNewLabel_2_2_3_2.setFont(new Font("Arial", Font.PLAIN, 28));
		lblNewLabel_2_2_3_2.setBounds(180, 109, 189, 33);
		panel_2.add(lblNewLabel_2_2_3_2);
		
		JLabel lblNewLabel_2_2_4_1_1 = new JLabel("22.000.000 VNĐ");
		lblNewLabel_2_2_4_1_1.setForeground(new Color(AppConstants.MAU_DO));
		lblNewLabel_2_2_4_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2_4_1_1.setFont(new Font("Arial", Font.BOLD, 32));
		lblNewLabel_2_2_4_1_1.setBounds(379, 99, 334, 50);
		panel_2.add(lblNewLabel_2_2_4_1_1);
		
		JLabel lblChnHan = new JLabel("CHỌN HÓA ĐƠN:");
		lblChnHan.setForeground(Color.BLACK);
		lblChnHan.setFont(new Font("Arial", Font.BOLD, 24));
		lblChnHan.setBounds(20, 11, 234, 43);
		panel.add(lblChnHan);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(AppConstants.MAU_TIM_NHAT_3));
		panel_1.setBounds(743, 0, 401, 814);
		add(panel_1);
		panel_1.setLayout(null);
		
		btnHienCN = new JButton("   In hóa đơn    ");
		btnHienCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				btnHienCN.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
//				btnHienThem.setBackground(Color.WHITE);
//				pnlDoiTTHD.setVisible(true);
//				pnlThemHD.setVisible(false);
			}
		});
		btnHienCN.setIcon(new ImageIcon(PnlCTHD.class.getResource("/hinhAnh/IconIn.png")));
		btnHienCN.setForeground(Color.BLACK);
		btnHienCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienCN.setFocusable(false);
		btnHienCN.setBorder(null);
		btnHienCN.setBackground(Color.WHITE);
		btnHienCN.setAlignmentX(0.5f);
		btnHienCN.setBounds(10, 738, 381, 65);
		panel_1.add(btnHienCN);
		
		btnHienThem = new JButton(" Thêm  ");
		btnHienThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHienThem.setForeground(Color.WHITE);
		btnHienThem.setFont(new Font("Arial", Font.BOLD, 22));
		btnHienThem.setFocusable(false);
		btnHienThem.setBorder(null);
		btnHienThem.setBackground(new Color(AppConstants.MAU_TIM_DAM));
		btnHienThem.setAlignmentX(0.5f);
		btnHienThem.setBounds(183, 443, 208, 65);
		panel_1.add(btnHienThem);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(116, 143, 252));
		panel_2_1.setBounds(10, 11, 381, 128);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel = new JLabel("Mã hóa đơn");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(157, 37, 191, 35);
		panel_2_1.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(PnlCTHD.class.getResource("/hinhAnh/IconCTHDLon.png")));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 11, 125, 106);
		panel_2_1.add(lblNewLabel_4);
		
		JLabel lblMaNV = new JLabel("1000");
		lblMaNV.setForeground(Color.BLACK);
		lblMaNV.setFont(new Font("Arial", Font.BOLD, 28));
		lblMaNV.setBounds(157, 66, 191, 51);
		panel_2_1.add(lblMaNV);
		
		JLabel lblChiTitHa = new JLabel("CHI TIẾT HÓA ĐƠN");
		lblChiTitHa.setForeground(Color.BLACK);
		lblChiTitHa.setFont(new Font("Arial", Font.BOLD, 24));
		lblChiTitHa.setBounds(10, 150, 381, 51);
		panel_1.add(lblChiTitHa);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBox_2_1.setBounds(127, 207, 264, 43);
		panel_1.add(comboBox_2_1);
		
		JLabel lblSnPhm = new JLabel("Sản phẩm:");
		lblSnPhm.setForeground(Color.BLACK);
		lblSnPhm.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSnPhm.setBounds(10, 207, 107, 43);
		panel_1.add(lblSnPhm);
		
		JLabel lblSnPhm_1 = new JLabel("Sản phẩm:");
		lblSnPhm_1.setForeground(Color.BLACK);
		lblSnPhm_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSnPhm_1.setBounds(10, 312, 107, 43);
		panel_1.add(lblSnPhm_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("1");
		textField.setBounds(214, 312, 90, 43);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnHienThem_1 = new JButton("");
		btnHienThem_1.setIcon(new ImageIcon(PnlCTHD.class.getResource("/hinhAnh/IconNhoHon.png")));
		btnHienThem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHienThem_1.setForeground(Color.BLACK);
		btnHienThem_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienThem_1.setFocusable(false);
		btnHienThem_1.setBorder(null);
		btnHienThem_1.setBackground(new Color(AppConstants.MAU_TIM_DAM));
		btnHienThem_1.setAlignmentX(0.5f);
		btnHienThem_1.setBounds(127, 312, 77, 43);
		panel_1.add(btnHienThem_1);
		
		JButton btnHienThem_1_1 = new JButton("");
		btnHienThem_1_1.setIcon(new ImageIcon(PnlCTHD.class.getResource("/hinhAnh/IconLonHon.png")));
		btnHienThem_1_1.setForeground(Color.BLACK);
		btnHienThem_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienThem_1_1.setFocusable(false);
		btnHienThem_1_1.setBorder(null);
		btnHienThem_1_1.setBackground(new Color(AppConstants.MAU_TIM_DAM));
		btnHienThem_1_1.setAlignmentX(0.5f);
		btnHienThem_1_1.setBounds(314, 312, 77, 43);
		panel_1.add(btnHienThem_1_1);
		
		JLabel lblnGi = new JLabel("Đơn giá:");
		lblnGi.setForeground(Color.BLACK);
		lblnGi.setFont(new Font("Arial", Font.PLAIN, 20));
		lblnGi.setBounds(10, 261, 107, 43);
		panel_1.add(lblnGi);
		
		JLabel lblVn = new JLabel("1.000 VNĐ");
		lblVn.setForeground(Color.BLACK);
		lblVn.setFont(new Font("Arial", Font.PLAIN, 20));
		lblVn.setBounds(127, 261, 264, 43);
		panel_1.add(lblVn);
		
		JLabel lblTmTnh = new JLabel("Thành tiền:");
		lblTmTnh.setForeground(Color.BLACK);
		lblTmTnh.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTmTnh.setBounds(10, 366, 107, 43);
		panel_1.add(lblTmTnh);
		
		JLabel lblVn_1 = new JLabel("20.000 VNĐ");
		lblVn_1.setForeground(Color.BLACK);
		lblVn_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblVn_1.setBounds(127, 366, 264, 43);
		panel_1.add(lblVn_1);
		
		JButton btnHienThem_2 = new JButton("Xóa");
		btnHienThem_2.setForeground(Color.WHITE);
		btnHienThem_2.setFont(new Font("Arial", Font.BOLD, 22));
		btnHienThem_2.setFocusable(false);
		btnHienThem_2.setBorder(null);
		btnHienThem_2.setBackground(new Color(AppConstants.MAU_DO));
		btnHienThem_2.setAlignmentX(0.5f);
		btnHienThem_2.setBounds(10, 443, 163, 65);
		panel_1.add(btnHienThem_2);
		
		loadData();
	}
	
	private void loadData() {
		HoaDonDB hdDB = new HoaDonDB();
		KhachHangDB khDB = new KhachHangDB();
		listAllHD = hdDB.tatCa();
		DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>();
		dcm.addElement(AppConstants.CHON_HOA_DON);
		for(int i = listAllHD.size()-1;i>=0;i--) {
			KhachHang kh = khDB.timTheoMaKH(listAllHD.get(i).getMaKhachKhang());
			String hoTen;
			if (kh == null) {
				hoTen = "<Trống>";
			}else {
				hoTen = kh.getHoTen();
			}
			dcm.addElement(listAllHD.get(i).getSoHoaDon()+" - "+hoTen+" - "+listAllHD.get(i).getNgayHoaDonToString());
		}
		cboChonHD.setModel(dcm);
		
	}
}
