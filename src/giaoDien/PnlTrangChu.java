package giaoDien;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;

import tienIch.AppConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import model.NhanVien;

import java.util.Locale;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

public class PnlTrangChu extends JPanel {
	private JTextField txtHoTen;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JPanel pnlCapNhat;
	private JPanel pnlDoiMK;
	private JDateChooser txtNgayVL;
	private JButton btnHienCN;
	private JButton btnHienDoiMK;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PnlTrangChu() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(AppConstants.MAU_XAM_NHAT));
		panel.setBounds(0, 0, 767, 814);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(AppConstants.MAU_XANH_LA));
		panel_3.setBounds(10, 11, 375, 129);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconDoanhSo.png")));
		lblNewLabel_5.setBounds(10, 11, 105, 107);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tổng doanh Số");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(123, 11, 242, 51);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("1,000,000 VNĐ");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 28));
		lblNewLabel_7.setBounds(125, 59, 240, 59);
		panel_3.add(lblNewLabel_7);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(AppConstants.MAU_DO));
		panel_3_1.setBounds(395, 11, 362, 129);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconHoaDonLon.png")));
		lblNewLabel_5_1.setBounds(10, 11, 105, 107);
		panel_3_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Tổng số hóa đơn");
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_6_1.setBounds(123, 11, 229, 51);
		panel_3_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("100");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_7_1.setBounds(123, 59, 229, 59);
		panel_3_1.add(lblNewLabel_7_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(AppConstants.MAU_CAM));
		panel_3_2.setBounds(10, 151, 375, 129);
		panel.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconSanPhamLon.png")));
		lblNewLabel_5_2.setBounds(10, 11, 105, 107);
		panel_3_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Tổng số sản phẩm");
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_6_2.setBounds(123, 11, 242, 51);
		panel_3_2.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("100");
		lblNewLabel_7_2.setForeground(Color.WHITE);
		lblNewLabel_7_2.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_7_2.setBounds(125, 59, 240, 59);
		panel_3_2.add(lblNewLabel_7_2);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(AppConstants.VIOLET));
		panel_3_1_1.setBounds(395, 151, 362, 129);
		panel.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconKhachHangLon.png")));
		lblNewLabel_5_1_1.setBounds(10, 11, 105, 107);
		panel_3_1_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Tổng số khách hàng");
		lblNewLabel_6_1_1.setForeground(Color.WHITE);
		lblNewLabel_6_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_6_1_1.setBounds(123, 11, 229, 51);
		panel_3_1_1.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("100");
		lblNewLabel_7_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_7_1_1.setBounds(125, 59, 227, 59);
		panel_3_1_1.add(lblNewLabel_7_1_1);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		panel_3_3.setBounds(10, 291, 182, 129);
		panel.add(panel_3_3);
		panel_3_3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconThem.png")));
		lblNewLabel_8.setBounds(41, 11, 99, 87);
		panel_3_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("THÊM HÓA ĐƠN");
		lblNewLabel_9.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_9.setBounds(10, 11, 162, 107);
		panel_3_3.add(lblNewLabel_9);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		panel_3_1_2.setBounds(395, 291, 179, 129);
		panel.add(panel_3_1_2);
		panel_3_1_2.setLayout(null);
		
		JLabel lblNewLabel_8_2 = new JLabel("");
		lblNewLabel_8_2.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconThem.png")));
		lblNewLabel_8_2.setBounds(40, 11, 99, 87);
		panel_3_1_2.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_9_2 = new JLabel("THÊM KHÁCH HÀNG");
		lblNewLabel_9_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_9_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_2.setForeground(Color.WHITE);
		lblNewLabel_9_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_9_2.setBounds(8, 11, 162, 107);
		panel_3_1_2.add(lblNewLabel_9_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(AppConstants.MAU_XAM_NHAT));
		panel_4.setBounds(10, 431, 747, 362);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("THỐNG KÊ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setBounds(0, 11, 123, 36);
		panel_4.add(lblNewLabel_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TOP 5 hóa đơn có giá trị cao nhất", "TOP 5 khách hàng mua nhiều nhất", "TOP 5 sản phẩm bán chạy nhất"}));
		comboBox.setBorder(null);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(133, 11, 470, 33);
		panel_4.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 58, 747, 314);
		panel_4.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnHinTh = new JButton("Hiển thị");
		btnHinTh.setForeground(Color.WHITE);
		btnHinTh.setFont(new Font("Arial", Font.BOLD, 16));
		btnHinTh.setFocusable(false);
		btnHinTh.setBorder(null);
		btnHinTh.setBackground(new Color(73, 80, 87));
		btnHinTh.setBounds(615, 11, 132, 33);
		panel_4.add(btnHinTh);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		panel_3_3_1.setBounds(202, 291, 182, 129);
		panel.add(panel_3_3_1);
		panel_3_3_1.setLayout(null);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconThem.png")));
		lblNewLabel_8_1.setBounds(41, 11, 99, 87);
		panel_3_3_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("THÊM SẢN PHẨM");
		lblNewLabel_9_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_9_1.setBounds(10, 11, 162, 107);
		panel_3_3_1.add(lblNewLabel_9_1);
		
		JPanel panel_3_1_2_1 = new JPanel();
		panel_3_1_2_1.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		panel_3_1_2_1.setBounds(584, 291, 173, 129);
		panel.add(panel_3_1_2_1);
		panel_3_1_2_1.setLayout(null);
		
		JLabel lblNewLabel_8_3 = new JLabel("");
		lblNewLabel_8_3.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconThem.png")));
		lblNewLabel_8_3.setBounds(37, 11, 99, 87);
		panel_3_1_2_1.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_9_3 = new JLabel("THÊM NHÂN VIÊN");
		lblNewLabel_9_3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_9_3.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_9_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_3.setForeground(Color.WHITE);
		lblNewLabel_9_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_9_3.setBounds(5, 11, 162, 107);
		panel_3_1_2_1.add(lblNewLabel_9_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Arial", Font.BOLD, 18));
		panel_1.setBackground(new Color(AppConstants.MAU_TIM_DAM));
		panel_1.setBounds(766, 0, 378, 814);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(AppConstants.MAU_TIM_NHAT));
		panel_2.setBounds(10, 11, 358, 128);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(157, 37, 191, 35);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconUser.png")));
		lblNewLabel_4.setBounds(10, 11, 125, 106);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblMaNV = new JLabel("NV00");
		lblMaNV.setForeground(Color.WHITE);
		lblMaNV.setBounds(157, 66, 191, 51);
		panel_2.add(lblMaNV);
		lblMaNV.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblNewLabel_1 = new JLabel("Họ tên:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 153, 85, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SĐT:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 193, 85, 30);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ngày VL:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 271, 85, 30);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblHoTen = new JLabel("NGUYỄN NGỌC MẪN");
		lblHoTen.setForeground(Color.WHITE);
		lblHoTen.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen.setBounds(105, 153, 265, 30);
		panel_1.add(lblHoTen);
		
		JLabel lblSDT = new JLabel("0912345678");
		lblSDT.setForeground(Color.WHITE);
		lblSDT.setFont(new Font("Arial", Font.BOLD, 18));
		lblSDT.setBounds(103, 193, 265, 30);
		panel_1.add(lblSDT);
		
		JLabel lblNgayVL = new JLabel("28-07-2022");
		lblNgayVL.setForeground(Color.WHITE);
		lblNgayVL.setFont(new Font("Arial", Font.BOLD, 18));
		lblNgayVL.setBounds(103, 271, 265, 30);
		panel_1.add(lblNgayVL);
		
		btnHienCN = new JButton("   Cập nhật thông tin");
		btnHienCN.setFocusable(false);
		btnHienCN.setAlignmentX(0.5f);
		btnHienCN.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconCapNhat.png")));
		btnHienCN.setForeground(Color.BLACK);
		btnHienCN.setBackground(Color.WHITE);
		btnHienCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienCN.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
				btnHienDoiMK.setBackground(Color.WHITE);
				pnlCapNhat.setVisible(true);
				pnlDoiMK.setVisible(false);
			}
		});
		btnHienCN.setBorder(null);
		btnHienCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienCN.setBounds(10, 323, 358, 49);
		panel_1.add(btnHienCN);
		
		btnHienDoiMK = new JButton("   Đổi mật khẩu         ");
		btnHienDoiMK.setFocusable(false);
		btnHienDoiMK.setIcon(new ImageIcon(PnlTrangChu.class.getResource("/hinhAnh/IconDoiMatKhau.png")));
		btnHienDoiMK.setForeground(Color.BLACK);
		btnHienDoiMK.setBackground(Color.WHITE);
		btnHienDoiMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienDoiMK.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
				btnHienCN.setBackground(Color.WHITE);
				pnlCapNhat.setVisible(false);
				pnlDoiMK.setBounds(10, 454, 358, 217);
				pnlDoiMK.setVisible(true);
			}
		});
		btnHienDoiMK.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienDoiMK.setBorder(null);
		btnHienDoiMK.setBounds(10, 383, 358, 49);
		panel_1.add(btnHienDoiMK);
		
		pnlCapNhat = new JPanel();
		pnlCapNhat.setBounds(10, 454, 358, 217);
		panel_1.add(pnlCapNhat);
		pnlCapNhat.setLayout(null);
		pnlCapNhat.setVisible(false);
		
		JLabel lblNewLabel_1_1 = new JLabel("Họ tên:");
		lblNewLabel_1_1.setBounds(10, 14, 122, 31);
		pnlCapNhat.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		
		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Arial", Font.PLAIN, 16));
		txtHoTen.setBounds(142, 12, 203, 35);
		pnlCapNhat.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Số điện thoại:");
		lblNewLabel_2_1.setBounds(10, 60, 122, 31);
		pnlCapNhat.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setBounds(142, 58, 203, 35);
		pnlCapNhat.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ngày vào làm:");
		lblNewLabel_3_1.setBounds(10, 106, 122, 31);
		pnlCapNhat.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JButton btnCpNht = new JButton("Cập nhật");
		btnCpNht.setFocusable(false);
		btnCpNht.setForeground(Color.WHITE);
		btnCpNht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
//					txtHoTen.setText(txtNgayVL.getDate().toString());
//					NhanVienBL nvBL = new NhanVienBL();
//					NhanVien nv = nvBL.timTheoMaNV("NV01");
//					txtHoTen.setText(nv.getHoTen());
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(getRootPane(), "Lỗi... Thông tin vừa nhập không hợp lệ");
				}
			}
		});
		btnCpNht.setBackground(new Color(AppConstants.VIOLET));
		btnCpNht.setFont(new Font("Arial", Font.BOLD, 18));
		btnCpNht.setBorder(null);
		btnCpNht.setBounds(142, 150, 203, 48);
		pnlCapNhat.add(btnCpNht);
		
		JButton btnHuyCN = new JButton("Hủy");
		btnHuyCN.setFocusable(false);
		btnHuyCN.setForeground(Color.WHITE);
		btnHuyCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienCN.setBackground(Color.WHITE);
				pnlCapNhat.setVisible(false);
			}
		});
		btnHuyCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyCN.setBorder(null);
		btnHuyCN.setBackground(new Color(AppConstants.MAU_XAM));
		btnHuyCN.setBounds(10, 150, 122, 48);
		pnlCapNhat.add(btnHuyCN);
		
		txtNgayVL = new JDateChooser();
		txtNgayVL.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNgayVL.setLocale(new Locale("vi", "VN"));
		txtNgayVL.getCalendarButton().setBackground(Color.WHITE);
		txtNgayVL.setBounds(142, 105, 203, 34);
		pnlCapNhat.add(txtNgayVL);
		
		pnlDoiMK = new JPanel();
		pnlDoiMK.setBounds(10, 718, 358, 217);
		panel_1.add(pnlDoiMK);
		pnlDoiMK.setLayout(null);
		pnlDoiMK.setVisible(false);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("MK cũ:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 14, 122, 31);
		pnlDoiMK.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("MK mới:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(10, 60, 122, 31);
		pnlDoiMK.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Nhập lại MK:");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1.setBounds(10, 106, 122, 31);
		pnlDoiMK.add(lblNewLabel_3_1_1);
		
		JButton btnDoiMK = new JButton("Đổi");
		btnDoiMK.setFocusable(false);
		btnDoiMK.setForeground(Color.WHITE);
		btnDoiMK.setFont(new Font("Arial", Font.BOLD, 18));
		btnDoiMK.setBorder(null);
		btnDoiMK.setBackground(new Color(AppConstants.VIOLET));
		btnDoiMK.setBounds(142, 150, 203, 48);
		pnlDoiMK.add(btnDoiMK);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
		passwordField.setBounds(142, 12, 203, 35);
		pnlDoiMK.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		passwordField_1.setBounds(142, 58, 203, 35);
		pnlDoiMK.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		passwordField_2.setBounds(142, 104, 203, 35);
		pnlDoiMK.add(passwordField_2);
		
		JButton btnHuyDoiMK = new JButton("Hủy");
		btnHuyDoiMK.setFocusable(false);
		btnHuyDoiMK.setForeground(Color.WHITE);
		btnHuyDoiMK.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyDoiMK.setBorder(null);
		btnHuyDoiMK.setBackground(new Color(AppConstants.MAU_XAM));
		btnHuyDoiMK.setBounds(10, 150, 122, 48);
		pnlDoiMK.add(btnHuyDoiMK);
		
		JLabel lblNewLabel_2_2 = new JLabel("Vai trò:");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(10, 234, 85, 30);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setForeground(Color.WHITE);
		lblAdmin.setFont(new Font("Arial", Font.BOLD, 18));
		lblAdmin.setBounds(103, 234, 265, 30);
		panel_1.add(lblAdmin);
		btnHuyDoiMK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienDoiMK.setBackground(Color.WHITE);
				pnlDoiMK.setVisible(false);
			}
		});
	}
}
