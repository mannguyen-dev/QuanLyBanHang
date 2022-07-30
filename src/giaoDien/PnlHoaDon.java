package giaoDien;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import tienIch.AppConstants;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.util.Locale;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class PnlHoaDon extends JPanel {
	private JPanel pnlDoiTTHD;
	private JTextField textField;
	private JTable table;
	private JPanel pnlThemHD;
	private JButton btnHienCN;
	private JButton btnHienThem;
	private JLabel lblChuyenCTHD;
	/**
	 * Create the panel.
	 */
	public PnlHoaDon() {
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
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Mã hóa đơn", "Ngày tạo (dd-MM-yyyy)", "Tháng (MM-yyyy)", "Năm (yyyy)", "Mã nhân viên", "Tên nhân viên", "Mã khách hàng", "Tên khách hàng"}));
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
		
		JButton btnHC = new JButton("HĐ có trị giá cao nhất      ");
		btnHC.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconStarFull.png")));
		btnHC.setForeground(Color.WHITE);
		btnHC.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC.setFocusable(false);
		btnHC.setBorder(null);
		btnHC.setBackground(new Color(AppConstants.VIOLET));
		btnHC.setAlignmentX(0.5f);
		btnHC.setBounds(10, 44, 296, 49);
		panel_2.add(btnHC);
		
		JButton btnHC_2 = new JButton("10 HĐ có trị giá cao nhất ");
		btnHC_2.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconHoaDon.png")));
		btnHC_2.setForeground(Color.WHITE);
		btnHC_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC_2.setFocusable(false);
		btnHC_2.setBorder(null);
		btnHC_2.setBackground(new Color(54, 79, 199));
		btnHC_2.setAlignmentX(0.5f);
		btnHC_2.setBounds(10, 164, 296, 49);
		panel_2.add(btnHC_2);
		
		JButton btnHC_2_1 = new JButton("10 HĐ có trị giá thấp nhất");
		btnHC_2_1.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconHoaDon.png")));
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
		
		JButton btnHC_2_2 = new JButton("HĐ có trị giá thấp nhất     ");
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
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Số HĐ tìm thấy: ");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(20, 43, 149, 33);
		panel_3.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("TỔNG TRỊ GIÁ:");
		lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_1.setBounds(20, 240, 141, 33);
		panel_3.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("HD có trị giá cao nhất:");
		lblNewLabel_2_1_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2.setBounds(20, 74, 209, 33);
		panel_3.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("HD có trị giá thấp nhất:");
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
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("Trị giá trung bình:");
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
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN HÓA ĐƠN");
		lblNewLabel.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconThongTinHoaDonNho.png")));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 381, 59);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã HD:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 92, 85, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblHoTen = new JLabel("1000");
		lblHoTen.setForeground(Color.BLACK);
		lblHoTen.setFont(new Font("Arial", Font.BOLD, 28));
		lblHoTen.setBounds(122, 81, 157, 44);
		panel_1.add(lblHoTen);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày tạo:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 136, 85, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblHoTen_1 = new JLabel("29-07-2022");
		lblHoTen_1.setForeground(Color.BLACK);
		lblHoTen_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1.setBounds(122, 136, 269, 30);
		panel_1.add(lblHoTen_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nhân viên: ");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 177, 95, 30);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblHoTen_1_1 = new JLabel("NV00 - Nguyễn Văn A");
		lblHoTen_1_1.setForeground(Color.BLACK);
		lblHoTen_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1_1.setBounds(122, 177, 269, 30);
		panel_1.add(lblHoTen_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Khách hàng:");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(10, 218, 106, 30);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblHoTen_1_1_1 = new JLabel("NV00 - Nguyễn Văn A");
		lblHoTen_1_1_1.setForeground(Color.BLACK);
		lblHoTen_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1_1_1.setBounds(122, 218, 269, 30);
		panel_1.add(lblHoTen_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Trị giá:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1.setBounds(10, 273, 106, 30);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblHoTen_1_1_1_1 = new JLabel("1.000.000 VNĐ");
		lblHoTen_1_1_1_1.setForeground(new Color(AppConstants.MAU_TIM_DAM));
		lblHoTen_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblHoTen_1_1_1_1.setBounds(122, 271, 269, 30);
		panel_1.add(lblHoTen_1_1_1_1);
		
		btnHienCN = new JButton("   Cập nhật thông tin    ");
		btnHienCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienCN.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
				btnHienThem.setBackground(Color.WHITE);
				pnlDoiTTHD.setVisible(true);
				pnlThemHD.setVisible(false);
			}
		});
		btnHienCN.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconCapNhat.png")));
		btnHienCN.setForeground(Color.BLACK);
		btnHienCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienCN.setFocusable(false);
		btnHienCN.setBorder(null);
		btnHienCN.setBackground(Color.WHITE);
		btnHienCN.setAlignmentX(0.5f);
		btnHienCN.setBounds(10, 390, 381, 49);
		panel_1.add(btnHienCN);
		
		pnlDoiTTHD = new JPanel();
		pnlDoiTTHD.setVisible(false);
		pnlDoiTTHD.setBounds(10, 510, 381, 217);
		panel_1.add(pnlDoiTTHD);
		pnlDoiTTHD.setLayout(null);
		
		JLabel lblNewLabel_1_1_11 = new JLabel("Ngày tạo:");
		lblNewLabel_1_1_11.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_11.setBounds(10, 14, 122, 31);
		pnlDoiTTHD.add(lblNewLabel_1_1_11);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nhân viên:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(10, 60, 122, 31);
		pnlDoiTTHD.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Khách hàng:");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1.setBounds(10, 106, 122, 31);
		pnlDoiTTHD.add(lblNewLabel_3_1_1);
		
		JButton btnCapNhat = new JButton("Đổi");
		btnCapNhat.setFocusable(false);
		btnCapNhat.setForeground(Color.WHITE);
		btnCapNhat.setFont(new Font("Arial", Font.BOLD, 18));
		btnCapNhat.setBorder(null);
		btnCapNhat.setBackground(new Color(AppConstants.VIOLET));
		btnCapNhat.setBounds(142, 150, 229, 48);
		pnlDoiTTHD.add(btnCapNhat);
		
		JButton btnHuyCN = new JButton("Hủy");
		btnHuyCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienCN.setBackground(Color.WHITE);
				pnlDoiTTHD.setVisible(false);
			}
		});
		btnHuyCN.setFocusable(false);
		btnHuyCN.setForeground(Color.WHITE);
		btnHuyCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyCN.setBorder(null);
		btnHuyCN.setBackground(new Color(AppConstants.MAU_XAM));
		btnHuyCN.setBounds(10, 150, 122, 48);
		pnlDoiTTHD.add(btnHuyCN);
		
		JComboBox cboNhanVien = new JComboBox();
		cboNhanVien.setModel(new DefaultComboBoxModel(new String[] {"<Trống>"}));
		cboNhanVien.setFont(new Font("Arial", Font.PLAIN, 16));
		cboNhanVien.setBounds(142, 58, 229, 35);
		pnlDoiTTHD.add(cboNhanVien);
		
		JComboBox cboKhachHang = new JComboBox();
		cboKhachHang.setModel(new DefaultComboBoxModel(new String[] {"<Trống>"}));
		cboKhachHang.setFont(new Font("Arial", Font.PLAIN, 16));
		cboKhachHang.setBounds(142, 104, 229, 35);
		pnlDoiTTHD.add(cboKhachHang);
		
		JDateChooser txtNgHD = new JDateChooser();
		txtNgHD.setDateFormatString("dd-MM-yyyy");
		txtNgHD.setBounds(142, 12, 229, 34);
		pnlDoiTTHD.add(txtNgHD);
		txtNgHD.getCalendarButton().setBackground(Color.WHITE);
		txtNgHD.setLocale(new Locale("vi", "VN"));
		txtNgHD.setFont(new Font("Arial", Font.PLAIN, 16));
		
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
		
		btnHienThem = new JButton("   Thêm hóa đơn mới   ");
		btnHienThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienThem.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
				btnHienCN.setBackground(Color.WHITE);
				pnlDoiTTHD.setVisible(false);
				pnlThemHD.setVisible(true);
			}
		});
		btnHienThem.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconThemDen.png")));
		btnHienThem.setForeground(Color.BLACK);
		btnHienThem.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienThem.setFocusable(false);
		btnHienThem.setBorder(null);
		btnHienThem.setBackground(Color.WHITE);
		btnHienThem.setAlignmentX(0.5f);
		btnHienThem.setBounds(10, 450, 381, 49);
		panel_1.add(btnHienThem);
		
		pnlThemHD = new JPanel();
		pnlThemHD.setVisible(false);
		pnlThemHD.setBounds(10, 510, 381, 168);
		panel_1.add(pnlThemHD);
		pnlThemHD.setLayout(null);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Khách hàng:");
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1.setBounds(10, 11, 122, 31);
		pnlThemHD.add(lblNewLabel_3_1_1_1);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setForeground(Color.WHITE);
		btnThem.setFont(new Font("Arial", Font.BOLD, 18));
		btnThem.setFocusable(false);
		btnThem.setBorder(null);
		btnThem.setBackground(new Color(AppConstants.MAU_TIM));
		btnThem.setBounds(142, 53, 229, 48);
		pnlThemHD.add(btnThem);
		
		JButton btnHuyThem = new JButton("Hủy");
		btnHuyThem.setForeground(Color.WHITE);
		btnHuyThem.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyThem.setFocusable(false);
		btnHuyThem.setBorder(null);
		btnHuyThem.setBackground(new Color(73, 80, 87));
		btnHuyThem.setBounds(10, 53, 122, 48);
		pnlThemHD.add(btnHuyThem);
		btnHuyThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienThem.setBackground(Color.WHITE);
				pnlThemHD.setVisible(false);
			}
		});
		
		JComboBox cboKhachHang_1 = new JComboBox();
		cboKhachHang_1.setModel(new DefaultComboBoxModel(new String[] {"<Trống>"}));
		cboKhachHang_1.setFont(new Font("Arial", Font.PLAIN, 16));
		cboKhachHang_1.setBounds(142, 9, 229, 35);
		pnlThemHD.add(cboKhachHang_1);
		
		JButton btnThem2 = new JButton("Thêm và chuyển tới CTHD");
		btnThem2.setForeground(Color.WHITE);
		btnThem2.setFont(new Font("Arial", Font.BOLD, 18));
		btnThem2.setFocusable(false);
		btnThem2.setBorder(null);
		btnThem2.setBackground(new Color(AppConstants.MAU_TIM_DAM));
		btnThem2.setBounds(10, 112, 361, 48);
		pnlThemHD.add(btnThem2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 330, 381, 49);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		lblChuyenCTHD = new JLabel("   Xem chi tiết hóa đơn");
		panel_4.add(lblChuyenCTHD);
		lblChuyenCTHD.setBackground(Color.WHITE);
		lblChuyenCTHD.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconCTHDMauDen.png")));
		lblChuyenCTHD.setHorizontalAlignment(SwingConstants.CENTER);
		lblChuyenCTHD.setFont(new Font("Arial", Font.BOLD, 18));

	}
}
