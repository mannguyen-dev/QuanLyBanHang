package giaoDien;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import tienIch.AppConstants;

import java.awt.BorderLayout;
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

public class PnlNhanVien extends JPanel {
	
	private JPanel pnlDoiTTKH;
	private JTextField txtTimKiem;
	private JTable table;
	private JPanel pnlThemKH;
	private JButton btnHienCN;
	private JButton btnHienThem;
	private JLabel lblChuyenCTHD;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public PnlNhanVien() {
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(AppConstants.MAU_TIM_NHAT_3));
		panel_1.setBounds(743, 0, 401, 814);
		add(panel_1);
		panel_1.setLayout(null);
		
		pnlDoiTTKH = new JPanel();
		pnlDoiTTKH.setVisible(false);
		
		pnlThemKH = new JPanel();
		pnlThemKH.setVisible(false);
		pnlThemKH.setBounds(10, 460, 381, 269);
		panel_1.add(pnlThemKH);
		pnlThemKH.setLayout(null);
		
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
		btnThem.setBounds(122, 216, 249, 38);
		pnlThemKH.add(btnThem);
		
		JButton btnHuyThem = new JButton("Hủy");
		btnHuyThem.setForeground(Color.WHITE);
		btnHuyThem.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyThem.setFocusable(false);
		btnHuyThem.setBorder(null);
		btnHuyThem.setBackground(new Color(73, 80, 87));
		btnHuyThem.setBounds(10, 217, 102, 38);
		pnlThemKH.add(btnHuyThem);
		btnHuyThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienThem.setBackground(Color.WHITE);
				pnlThemKH.setVisible(false);
			}
		});
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Mã NV:");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1.setBounds(10, 10, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setBounds(122, 9, 249, 32);
		pnlThemKH.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Họ tên:");
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1.setBounds(10, 51, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(122, 50, 249, 32);
		pnlThemKH.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(122, 93, 249, 32);
		pnlThemKH.add(textField_3);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1 = new JLabel("Số ĐT:");
		lblNewLabel_3_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_1.setBounds(10, 92, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_2 = new JLabel("Ngày VL:");
		lblNewLabel_3_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_2.setBounds(10, 133, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_2_1 = new JLabel("Vai trò:");
		lblNewLabel_3_1_1_1_1_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_2_1.setBounds(10, 174, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(122, 173, 249, 32);
		pnlThemKH.add(textField_6);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setLocale(new Locale("vi", "VN"));
		dateChooser_1.setFont(new Font("Arial", Font.PLAIN, 18));
		dateChooser_1.setBounds(122, 132, 249, 32);
		pnlThemKH.add(dateChooser_1);
		pnlDoiTTKH.setBounds(10, 460, 381, 246);
		panel_1.add(pnlDoiTTKH);
		pnlDoiTTKH.setLayout(null);
		
		JButton btnCapNhat = new JButton("Đổi");
		btnCapNhat.setFocusable(false);
		btnCapNhat.setForeground(Color.WHITE);
		btnCapNhat.setFont(new Font("Arial", Font.BOLD, 18));
		btnCapNhat.setBorder(null);
		btnCapNhat.setBackground(new Color(AppConstants.VIOLET));
		btnCapNhat.setBounds(122, 183, 249, 44);
		pnlDoiTTKH.add(btnCapNhat);
		
		JButton btnHuyCN = new JButton("Hủy");
		btnHuyCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienCN.setBackground(Color.WHITE);
				pnlDoiTTKH.setVisible(false);
			}
		});
		btnHuyCN.setFocusable(false);
		btnHuyCN.setForeground(Color.WHITE);
		btnHuyCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyCN.setBorder(null);
		btnHuyCN.setBackground(new Color(AppConstants.MAU_XAM));
		btnHuyCN.setBounds(10, 183, 102, 44);
		pnlDoiTTKH.add(btnHuyCN);
		
		JLabel lblNewLabel_3_1_1_1_1_1_2 = new JLabel("Họ tên:");
		lblNewLabel_3_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_2.setBounds(10, 12, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(122, 11, 249, 32);
		pnlDoiTTKH.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(122, 54, 249, 32);
		pnlDoiTTKH.add(textField_5);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1 = new JLabel("Số ĐT:");
		lblNewLabel_3_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_1_1.setBounds(10, 55, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_2_2 = new JLabel("Ngày VL:");
		lblNewLabel_3_1_1_1_1_1_1_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_2_2.setBounds(10, 98, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_1_2_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_2_1_1 = new JLabel("Vai trò:");
		lblNewLabel_3_1_1_1_1_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_2_1_1.setBounds(10, 141, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_1_2_1_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(122, 140, 249, 32);
		pnlDoiTTKH.add(textField_7);
		
		JDateChooser dateChooser_1_1 = new JDateChooser();
		dateChooser_1_1.setLocale(new Locale("vi", "VN"));
		dateChooser_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		dateChooser_1_1.setBounds(122, 98, 249, 32);
		pnlDoiTTKH.add(dateChooser_1_1);
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN NHÂN VIÊN");
		lblNewLabel.setIcon(new ImageIcon(PnlNhanVien.class.getResource("/hinhAnh/IconNhanVienDen.png")));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 381, 59);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã NV:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 78, 72, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblMaNV = new JLabel("1000");
		lblMaNV.setForeground(Color.BLACK);
		lblMaNV.setFont(new Font("Arial", Font.BOLD, 28));
		lblMaNV.setBounds(112, 67, 163, 44);
		panel_1.add(lblMaNV);
		
		JLabel lblNewLabel_1_1 = new JLabel("Họ tên:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 119, 72, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblHoTen = new JLabel("Nguyễn Văn A");
		lblHoTen.setForeground(Color.BLACK);
		lblHoTen.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen.setBounds(112, 119, 279, 30);
		panel_1.add(lblHoTen);
		
		btnHienCN = new JButton("Cập nhật thông tin                ");
		btnHienCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienCN.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
				btnHienThem.setBackground(Color.WHITE);
				pnlDoiTTKH.setVisible(true);
				pnlThemKH.setVisible(false);
			}
		});
		btnHienCN.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconCapNhat.png")));
		btnHienCN.setForeground(Color.BLACK);
		btnHienCN.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienCN.setFocusable(false);
		btnHienCN.setBorder(null);
		btnHienCN.setBackground(Color.WHITE);
		btnHienCN.setAlignmentX(0.5f);
		btnHienCN.setBounds(10, 340, 381, 49);
		panel_1.add(btnHienCN);
		
		JButton btnHienCN_1 = new JButton(" Xóa");
		btnHienCN_1.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconXoa.png")));
		btnHienCN_1.setForeground(Color.WHITE);
		btnHienCN_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienCN_1.setFocusable(false);
		btnHienCN_1.setBorder(null);
		btnHienCN_1.setBackground(new Color(AppConstants.MAU_DO));
		btnHienCN_1.setAlignmentX(0.5f);
		btnHienCN_1.setBounds(285, 67, 106, 41);
		panel_1.add(btnHienCN_1);
		
		btnHienThem = new JButton("Thêm nhân viên mới            ");
		btnHienThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienThem.setBackground(new Color(AppConstants.MAU_TIM_NHAT_2));
				btnHienCN.setBackground(Color.WHITE);
				pnlDoiTTKH.setVisible(false);
				pnlThemKH.setVisible(true);
			}
		});
		btnHienThem.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconThemDen.png")));
		btnHienThem.setForeground(Color.BLACK);
		btnHienThem.setFont(new Font("Arial", Font.BOLD, 18));
		btnHienThem.setFocusable(false);
		btnHienThem.setBorder(null);
		btnHienThem.setBackground(Color.WHITE);
		btnHienThem.setAlignmentX(0.5f);
		btnHienThem.setBounds(10, 400, 381, 49);
		panel_1.add(btnHienThem);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 280, 381, 49);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		lblChuyenCTHD = new JLabel("Xem hóa đơn của nhân viên");
		//		lblChuyenCTHD.addMouseListener(new MouseAdapter() {
		//			@Override
		//			public void mouseClicked(MouseEvent e) {
		//				controller.setViewCTHD();
		//			}
		//		});
		
				panel_4.add(lblChuyenCTHD);
				lblChuyenCTHD.setBackground(Color.WHITE);
				lblChuyenCTHD.setIcon(new ImageIcon(PnlKhachHang.class.getResource("/hinhAnh/IconThongTinHoaDonNho.png")));
				lblChuyenCTHD.setHorizontalAlignment(SwingConstants.CENTER);
				lblChuyenCTHD.setFont(new Font("Arial", Font.BOLD, 18));
				
				JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Ngày VL:");
				lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
				lblNewLabel_1_1_1_1_2.setBounds(10, 198, 95, 30);
				panel_1.add(lblNewLabel_1_1_1_1_2);
				
				JLabel lblNgVL = new JLabel("01/01/2000");
				lblNgVL.setForeground(Color.BLACK);
				lblNgVL.setFont(new Font("Arial", Font.BOLD, 18));
				lblNgVL.setBounds(112, 198, 279, 30);
				panel_1.add(lblNgVL);
				
				JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Vai trò:");
				lblNewLabel_1_1_1_1_2_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
				lblNewLabel_1_1_1_1_2_1.setBounds(10, 239, 85, 30);
				panel_1.add(lblNewLabel_1_1_1_1_2_1);
				
				JLabel lblVaiTro = new JLabel("Admin");
				lblVaiTro.setForeground(Color.BLACK);
				lblVaiTro.setFont(new Font("Arial", Font.BOLD, 18));
				lblVaiTro.setBounds(112, 239, 279, 30);
				panel_1.add(lblVaiTro);
				
				JLabel lblNewLabel_1_1_1_1_3 = new JLabel("SĐT:");
				lblNewLabel_1_1_1_1_3.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 18));
				lblNewLabel_1_1_1_1_3.setBounds(10, 157, 51, 30);
				panel_1.add(lblNewLabel_1_1_1_1_3);
				
				JLabel lblSoDT = new JLabel("01234567890");
				lblSoDT.setForeground(Color.BLACK);
				lblSoDT.setFont(new Font("Arial", Font.BOLD, 18));
				lblSoDT.setBounds(112, 157, 255, 30);
				panel_1.add(lblSoDT);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(AppConstants.MAU_XAM_NHAT));
		panel.setBounds(0, 0, 743, 814);
		add(panel);
		panel.setLayout(null);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setFont(new Font("Arial", Font.PLAIN, 20));
		txtTimKiem.setBounds(10, 11, 326, 43);
		panel.add(txtTimKiem);
		txtTimKiem.setColumns(10);
		
		JComboBox cboTimKiem = new JComboBox();
		cboTimKiem.setFont(new Font("Arial", Font.PLAIN, 20));
		cboTimKiem.setModel(new DefaultComboBoxModel(new String[] {"Mã nhân viên", "Họ tên", "Số điện thoại", "Ngày VL (dd/MM/yyyy)", "Tháng VL (MM/yyyy)", "Năm VL (yyyy)", "Vai trò", "Doanh số cao hơn", "Doanh số thấp hơn"}));
		cboTimKiem.setBounds(346, 11, 227, 43);
		panel.add(cboTimKiem);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconTimKiem.png")));
		btnTimKiem.setForeground(Color.WHITE);
		btnTimKiem.setFont(new Font("Arial", Font.BOLD, 22));
		btnTimKiem.setFocusable(false);
		btnTimKiem.setBorder(null);
		btnTimKiem.setBackground(new Color(73, 80, 87));
		btnTimKiem.setBounds(583, 11, 150, 43);
		panel.add(btnTimKiem);
		
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
		
		JButton btnHC = new JButton("NV có DS cao nhất      ");
		btnHC.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconStarFull.png")));
		btnHC.setForeground(Color.WHITE);
		btnHC.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC.setFocusable(false);
		btnHC.setBorder(null);
		btnHC.setBackground(new Color(AppConstants.VIOLET));
		btnHC.setAlignmentX(0.5f);
		btnHC.setBounds(10, 44, 296, 49);
		panel_2.add(btnHC);
		
		JButton btnHC_2 = new JButton("10 NV có DS\r\n cao nhất ");
		btnHC_2.setIcon(new ImageIcon(PnlNhanVien.class.getResource("/hinhAnh/IconNhanVien.png")));
		btnHC_2.setForeground(Color.WHITE);
		btnHC_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC_2.setFocusable(false);
		btnHC_2.setBorder(null);
		btnHC_2.setBackground(new Color(54, 79, 199));
		btnHC_2.setAlignmentX(0.5f);
		btnHC_2.setBounds(10, 164, 296, 49);
		panel_2.add(btnHC_2);
		
		JButton btnHC_2_1 = new JButton("10 NV có DS thấp nhất");
		btnHC_2_1.setIcon(new ImageIcon(PnlNhanVien.class.getResource("/hinhAnh/IconNhanVien.png")));
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
		
		JButton btnHC_2_2 = new JButton("NV có DS thấp nhất     ");
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
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Số NV tìm thấy: ");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(20, 43, 149, 33);
		panel_3.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("TỔNG DS:");
		lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_1.setBounds(20, 240, 141, 33);
		panel_3.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("NV có doanh số cao nhất:");
		lblNewLabel_2_1_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2.setBounds(20, 74, 367, 33);
		panel_3.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("NV có doanh số thấp nhất:");
		lblNewLabel_2_1_2_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2_1.setBounds(20, 142, 367, 33);
		panel_3.add(lblNewLabel_2_1_2_2_1);
		
		JLabel lblSoNVTimThay = new JLabel("10");
		lblSoNVTimThay.setFont(new Font("Arial", Font.BOLD, 18));
		lblSoNVTimThay.setBounds(171, 43, 216, 33);
		panel_3.add(lblSoNVTimThay);
		
		JLabel lblDoanhSoTong = new JLabel("10.000.000 VNĐ");
		lblDoanhSoTong.setForeground(new Color(AppConstants.MAU_DO));
		lblDoanhSoTong.setFont(new Font("Arial", Font.BOLD, 22));
		lblDoanhSoTong.setBounds(171, 239, 216, 33);
		panel_3.add(lblDoanhSoTong);
		
		JLabel lblDoanhSoNVMax = new JLabel("1000 - 1.000.000 VNĐ");
		lblDoanhSoNVMax.setForeground(Color.BLACK);
		lblDoanhSoNVMax.setFont(new Font("Arial", Font.BOLD, 18));
		lblDoanhSoNVMax.setBounds(102, 106, 285, 33);
		panel_3.add(lblDoanhSoNVMax);
		
		JLabel lblDoanhSoNVMin = new JLabel("1000 - 1.200.000 VNĐ");
		lblDoanhSoNVMin.setForeground(Color.BLACK);
		lblDoanhSoNVMin.setFont(new Font("Arial", Font.BOLD, 18));
		lblDoanhSoNVMin.setBounds(102, 173, 285, 33);
		panel_3.add(lblDoanhSoNVMin);
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("DS trung bình:");
		lblNewLabel_2_1_2_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2_1_1.setBounds(20, 205, 149, 33);
		panel_3.add(lblNewLabel_2_1_2_2_1_1);
		
		JLabel lblDoanhSoTB = new JLabel("1.000.000 VNĐ");
		lblDoanhSoTB.setForeground(new Color(54, 79, 199));
		lblDoanhSoTB.setFont(new Font("Arial", Font.BOLD, 18));
		lblDoanhSoTB.setBounds(171, 205, 216, 33);
		panel_3.add(lblDoanhSoTB);

	}

}
