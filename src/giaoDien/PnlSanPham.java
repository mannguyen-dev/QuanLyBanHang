package giaoDien;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import tienIch.AppConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PnlSanPham extends JPanel {
	
	private JPanel pnlDoiTTSP;
	private JPanel pnlThemSP;
	private JTextField textField;
	private JTable table;
	private JButton btnHienCN;
	private JButton btnHienThem;
	private JTextField textField_1;
	private JTextField textField_1_1;
	private JTextField textField_2;
	private JTextField textField_2_1;
	private JTextField textField_3;
	private JTextField textField_3_1;

	/**
	 * Create the panel.
	 */
	public PnlSanPham() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(AppConstants.MAU_XAM_NHAT));
		panel.setBounds(0, 0, 743, 814);
		add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setBounds(10, 11, 326, 43);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Mã sản phẩm", "Tên sản phẩm", "ĐVT (cây, hộp, cái, quyển, chục)", "Nước sản xuất", "Giá thấp hơn", "Giá cao hơn"}));
		comboBox_2.setBounds(346, 11, 245, 43);
		panel.add(comboBox_2);
		
		JButton btnTm = new JButton("Tìm kiếm");
		btnTm.setForeground(Color.WHITE);
		btnTm.setFont(new Font("Arial", Font.BOLD, 22));
		btnTm.setFocusable(false);
		btnTm.setBorder(null);
		btnTm.setBackground(new Color(73, 80, 87));
		btnTm.setBounds(601, 11, 132, 43);
		panel.add(btnTm);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 723, 443);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 519, 316, 284);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Tiện ích");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_2.setBounds(10, 11, 99, 33);
		panel_2.add(lblNewLabel_2);
		
		JButton btnHC = new JButton("SP bán chạy nhất      ");
		btnHC.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconStarFull.png")));
		btnHC.setForeground(Color.WHITE);
		btnHC.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC.setFocusable(false);
		btnHC.setBorder(null);
		btnHC.setBackground(new Color(AppConstants.VIOLET));
		btnHC.setAlignmentX(0.5f);
		btnHC.setBounds(10, 44, 296, 49);
		panel_2.add(btnHC);
		
		JButton btnHC_2 = new JButton("10 SP bán chạy nhất ");
		btnHC_2.setIcon(new ImageIcon(PnlSanPham.class.getResource("/hinhAnh/IconSanPham.png")));
		btnHC_2.setForeground(Color.WHITE);
		btnHC_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC_2.setFocusable(false);
		btnHC_2.setBorder(null);
		btnHC_2.setBackground(new Color(54, 79, 199));
		btnHC_2.setAlignmentX(0.5f);
		btnHC_2.setBounds(10, 164, 296, 49);
		panel_2.add(btnHC_2);
		
		JButton btnHC_2_1 = new JButton("10 SP bán chậm nhất");
		btnHC_2_1.setIcon(new ImageIcon(PnlSanPham.class.getResource("/hinhAnh/IconSanPham.png")));
		btnHC_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHC_2_1.setForeground(Color.WHITE);
		btnHC_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC_2_1.setFocusable(false);
		btnHC_2_1.setBorder(null);
		btnHC_2_1.setBackground(new Color(54, 79, 199));
		btnHC_2_1.setAlignmentX(0.5f);
		btnHC_2_1.setBounds(10, 224, 296, 49);
		panel_2.add(btnHC_2_1);
		
		JButton btnHC_2_2 = new JButton("SP bán chậm nhất     ");
		btnHC_2_2.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconStar.png")));
		btnHC_2_2.setForeground(Color.WHITE);
		btnHC_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC_2_2.setFocusable(false);
		btnHC_2_2.setBorder(null);
		btnHC_2_2.setBackground(new Color(AppConstants.VIOLET));
		btnHC_2_2.setAlignmentX(0.5f);
		btnHC_2_2.setBounds(10, 104, 296, 49);
		panel_2.add(btnHC_2_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(336, 519, 397, 284);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Thống kê");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(10, 11, 130, 33);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Số SP tìm thấy: ");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(20, 43, 149, 33);
		panel_3.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("TỔNG GIÁ:");
		lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_1.setBounds(20, 240, 141, 33);
		panel_3.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("SP có giá cao nhất:");
		lblNewLabel_2_1_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2.setBounds(20, 74, 209, 33);
		panel_3.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("SP có giá thấp nhất:");
		lblNewLabel_2_1_2_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2_1.setBounds(20, 142, 209, 33);
		panel_3.add(lblNewLabel_2_1_2_2_1);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("10");
		lblNewLabel_2_1_2_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1_2_3.setBounds(171, 43, 216, 33);
		panel_3.add(lblNewLabel_2_1_2_3);
		
		JLabel lblNewLabel_2_1_2_3_1 = new JLabel("10.000.000 VNĐ");
		lblNewLabel_2_1_2_3_1.setForeground(new Color(AppConstants.MAU_DO));
		lblNewLabel_2_1_2_3_1.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_2_1_2_3_1.setBounds(171, 239, 216, 33);
		panel_3.add(lblNewLabel_2_1_2_3_1);
		
		JLabel lblNewLabel_2_1_2_3_2 = new JLabel("1000 - 1.000.000 VNĐ");
		lblNewLabel_2_1_2_3_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_3_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1_2_3_2.setBounds(102, 106, 285, 33);
		panel_3.add(lblNewLabel_2_1_2_3_2);
		
		JLabel lblNewLabel_2_1_2_3_2_1 = new JLabel("1000 - 1.200.000 VNĐ");
		lblNewLabel_2_1_2_3_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_3_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1_2_3_2_1.setBounds(102, 173, 285, 33);
		panel_3.add(lblNewLabel_2_1_2_3_2_1);
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("Giá trung bình:");
		lblNewLabel_2_1_2_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2_1_1.setBounds(20, 205, 149, 33);
		panel_3.add(lblNewLabel_2_1_2_2_1_1);
		
		JLabel lblNewLabel_2_1_2_3_2_2 = new JLabel("1.000.000 VNĐ");
		lblNewLabel_2_1_2_3_2_2.setForeground(new Color(54, 79, 199));
		lblNewLabel_2_1_2_3_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1_2_3_2_2.setBounds(171, 205, 216, 33);
		panel_3.add(lblNewLabel_2_1_2_3_2_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(AppConstants.MAU_TIM_NHAT_3));
		panel_1.setBounds(743, 0, 401, 814);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN SẢN PHẨM");
		lblNewLabel.setIcon(new ImageIcon(PnlSanPham.class.getResource("/hinhAnh/IconSanPhamNhoDen.png")));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 381, 59);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã SP:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 92, 85, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblHoTen = new JLabel("1000");
		lblHoTen.setForeground(Color.BLACK);
		lblHoTen.setFont(new Font("Arial", Font.BOLD, 28));
		lblHoTen.setBounds(122, 81, 157, 44);
		panel_1.add(lblHoTen);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên SP:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 136, 85, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblHoTen_1 = new JLabel("Bút bi");
		lblHoTen_1.setForeground(Color.BLACK);
		lblHoTen_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1.setBounds(122, 136, 269, 30);
		panel_1.add(lblHoTen_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Đơn vị tính:");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 177, 102, 30);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblHoTen_1_1 = new JLabel("cây");
		lblHoTen_1_1.setForeground(Color.BLACK);
		lblHoTen_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1_1.setBounds(122, 177, 269, 30);
		panel_1.add(lblHoTen_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nước SX:");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(10, 218, 106, 30);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblHoTen_1_1_1 = new JLabel("Việt Nam");
		lblHoTen_1_1_1.setForeground(Color.BLACK);
		lblHoTen_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1_1_1.setBounds(122, 218, 269, 30);
		panel_1.add(lblHoTen_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Giá:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1.setBounds(10, 273, 106, 30);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblHoTen_1_1_1_1 = new JLabel("15.000 VNĐ");
		lblHoTen_1_1_1_1.setForeground(new Color(AppConstants.MAU_TIM_DAM));
		lblHoTen_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblHoTen_1_1_1_1.setBounds(122, 271, 269, 30);
		panel_1.add(lblHoTen_1_1_1_1);
		
		btnHienCN = new JButton("   Cập nhật thông tin    ");
		btnHienCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienCN.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
				btnHienThem.setBackground(Color.WHITE);
				pnlDoiTTSP.setVisible(true);
				pnlThemSP.setVisible(false);
			}
		});
		btnHienCN.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconCapNhat.png")));
		btnHienCN.setForeground(Color.BLACK);
		btnHienCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienCN.setFocusable(false);
		btnHienCN.setBorder(null);
		btnHienCN.setBackground(Color.WHITE);
		btnHienCN.setAlignmentX(0.5f);
		btnHienCN.setBounds(10, 332, 381, 49);
		panel_1.add(btnHienCN);
		
		pnlDoiTTSP = new JPanel();
		pnlDoiTTSP.setVisible(false);
		pnlDoiTTSP.setBounds(10, 452, 381, 299);
		panel_1.add(pnlDoiTTSP);
		pnlDoiTTSP.setLayout(null);
		
		JLabel lblNewLabel_1_1_11 = new JLabel("Tên SP:");
		lblNewLabel_1_1_11.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_11.setBounds(10, 58, 122, 31);
		pnlDoiTTSP.add(lblNewLabel_1_1_11);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Đơn vị tính:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(10, 103, 122, 31);
		pnlDoiTTSP.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Nước SX:");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1.setBounds(10, 149, 122, 31);
		pnlDoiTTSP.add(lblNewLabel_3_1_1);
		
		JButton btnCapNhat = new JButton("Đổi");
		btnCapNhat.setFocusable(false);
		btnCapNhat.setForeground(Color.WHITE);
		btnCapNhat.setFont(new Font("Arial", Font.BOLD, 18));
		btnCapNhat.setBorder(null);
		btnCapNhat.setBackground(new Color(AppConstants.VIOLET));
		btnCapNhat.setBounds(142, 236, 229, 48);
		pnlDoiTTSP.add(btnCapNhat);
		
		JButton btnHuyCN = new JButton("Hủy");
		btnHuyCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienCN.setBackground(Color.WHITE);
				pnlDoiTTSP.setVisible(false);
			}
		});
		btnHuyCN.setFocusable(false);
		btnHuyCN.setForeground(Color.WHITE);
		btnHuyCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyCN.setBorder(null);
		btnHuyCN.setBackground(new Color(AppConstants.MAU_XAM));
		btnHuyCN.setBounds(10, 236, 122, 48);
		pnlDoiTTSP.add(btnHuyCN);
		
		JComboBox cboNhanVien = new JComboBox();
		cboNhanVien.setModel(new DefaultComboBoxModel(new String[] {"<Trống>", "cây", "chục", "cái", "quyển", "hộp"}));
		cboNhanVien.setFont(new Font("Arial", Font.PLAIN, 16));
		cboNhanVien.setBounds(142, 101, 229, 35);
		pnlDoiTTSP.add(cboNhanVien);
		
		JComboBox cboKhachHang = new JComboBox();
		cboKhachHang.setEditable(true);
		cboKhachHang.setModel(new DefaultComboBoxModel(new String[] {"<Trống>"}));
		cboKhachHang.setFont(new Font("Arial", Font.PLAIN, 16));
		cboKhachHang.setBounds(142, 147, 229, 35);
		pnlDoiTTSP.add(cboKhachHang);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setBounds(142, 58, 229, 34);
		pnlDoiTTSP.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1_11_1 = new JLabel("Giá:");
		lblNewLabel_1_1_11_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_11_1.setBounds(10, 194, 122, 31);
		pnlDoiTTSP.add(lblNewLabel_1_1_11_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(142, 191, 177, 34);
		pnlDoiTTSP.add(textField_2);
		
		JLabel lblNewLabel_1_1_11_2 = new JLabel("Mã SP:");
		lblNewLabel_1_1_11_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_11_2.setBounds(10, 11, 122, 31);
		pnlDoiTTSP.add(lblNewLabel_1_1_11_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(142, 11, 229, 34);
		pnlDoiTTSP.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("VNĐ");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(324, 193, 47, 30);
		pnlDoiTTSP.add(lblNewLabel_1_1_1_1_1_1);
		
		pnlThemSP = new JPanel();
		pnlThemSP.setVisible(false);
		pnlThemSP.setBounds(10, 452, 381, 299);
		panel_1.add(pnlThemSP);
		pnlThemSP.setLayout(null);
		
		JLabel lblNewLabel_1_1_111 = new JLabel("Tên SP:");
		lblNewLabel_1_1_111.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_111.setBounds(10, 58, 122, 31);
		pnlThemSP.add(lblNewLabel_1_1_111);
		
		JLabel lblNewLabel_2_1_11 = new JLabel("Đơn vị tính:");
		lblNewLabel_2_1_11.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_11.setBounds(10, 103, 122, 31);
		pnlThemSP.add(lblNewLabel_2_1_11);
		
		JLabel lblNewLabel_3_1_11 = new JLabel("Nước SX:");
		lblNewLabel_3_1_11.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_11.setBounds(10, 149, 122, 31);
		pnlThemSP.add(lblNewLabel_3_1_11);
		
		JButton btnThemSP = new JButton("Thêm");
		btnThemSP.setFocusable(false);
		btnThemSP.setForeground(Color.WHITE);
		btnThemSP.setFont(new Font("Arial", Font.BOLD, 18));
		btnThemSP.setBorder(null);
		btnThemSP.setBackground(new Color(AppConstants.MAU_TIM_DAM));
		btnThemSP.setBounds(142, 236, 229, 48);
		pnlThemSP.add(btnThemSP);
		
		JButton btnHuyCN1 = new JButton("Hủy");
		btnHuyCN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienThem.setBackground(Color.WHITE);
				pnlThemSP.setVisible(false);
			}
		});
		btnHuyCN1.setFocusable(false);
		btnHuyCN1.setForeground(Color.WHITE);
		btnHuyCN1.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyCN1.setBorder(null);
		btnHuyCN1.setBackground(new Color(AppConstants.MAU_XAM));
		btnHuyCN1.setBounds(10, 236, 122, 48);
		pnlThemSP.add(btnHuyCN1);
		
		JComboBox cboNhanVien1 = new JComboBox();
		cboNhanVien1.setModel(new DefaultComboBoxModel(new String[] {"<Trống>", "cây", "chục", "cái", "quyển", "hộp"}));
		cboNhanVien1.setFont(new Font("Arial", Font.PLAIN, 16));
		cboNhanVien1.setBounds(142, 101, 229, 35);
		pnlThemSP.add(cboNhanVien1);
		
		JComboBox cboKhachHang1 = new JComboBox();
		cboKhachHang1.setEditable(true);
		cboKhachHang1.setModel(new DefaultComboBoxModel(new String[] {"<Trống>"}));
		cboKhachHang1.setFont(new Font("Arial", Font.PLAIN, 16));
		cboKhachHang1.setBounds(142, 147, 229, 35);
		pnlThemSP.add(cboKhachHang1);
		
		textField_1_1 = new JTextField();
		textField_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1_1.setBounds(142, 58, 229, 34);
		pnlThemSP.add(textField_1_1);
		textField_1_1.setColumns(10);
		
		JLabel lblNewLabel_1_1_11_11 = new JLabel("Giá:");
		lblNewLabel_1_1_11_11.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_11_11.setBounds(10, 194, 122, 31);
		pnlThemSP.add(lblNewLabel_1_1_11_11);
		
		textField_2_1 = new JTextField();
		textField_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2_1.setColumns(10);
		textField_2_1.setBounds(142, 191, 177, 34);
		pnlThemSP.add(textField_2_1);
		
		JLabel lblNewLabel_1_1_11_21 = new JLabel("Mã SP:");
		lblNewLabel_1_1_11_21.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_11_21.setBounds(10, 11, 122, 31);
		pnlThemSP.add(lblNewLabel_1_1_11_21);
		
		textField_3_1 = new JTextField();
		textField_3_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_3_1.setColumns(10);
		textField_3_1.setBounds(142, 11, 229, 34);
		pnlThemSP.add(textField_3_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("VNĐ");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(324, 193, 47, 30);
		pnlThemSP.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JButton btnHienCN_1 = new JButton(" Xóa");
		btnHienCN_1.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconXoa.png")));
		btnHienCN_1.setForeground(Color.WHITE);
		btnHienCN_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienCN_1.setFocusable(false);
		btnHienCN_1.setBorder(null);
		btnHienCN_1.setBackground(new Color(AppConstants.MAU_DO));
		btnHienCN_1.setAlignmentX(0.5f);
		btnHienCN_1.setBounds(285, 81, 106, 44);
		panel_1.add(btnHienCN_1);
		
		btnHienThem = new JButton("   Thêm sản phẩm mới");
		btnHienThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienThem.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
				btnHienCN.setBackground(Color.WHITE);
				pnlDoiTTSP.setVisible(false);
				pnlThemSP.setVisible(true);
			}
		});
		btnHienThem.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconThemDen.png")));
		btnHienThem.setForeground(Color.BLACK);
		btnHienThem.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienThem.setFocusable(false);
		btnHienThem.setBorder(null);
		btnHienThem.setBackground(Color.WHITE);
		btnHienThem.setAlignmentX(0.5f);
		btnHienThem.setBounds(10, 392, 381, 49);
		panel_1.add(btnHienThem);

	}
}
