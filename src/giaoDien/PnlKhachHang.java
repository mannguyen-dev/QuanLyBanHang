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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class PnlKhachHang extends JPanel {
	
	private JPanel pnlDoiTTKH;
	private JTextField textField;
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
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Create the panel.
	 */
	public PnlKhachHang() {
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(AppConstants.MAU_TIM_NHAT_3));
		panel_1.setBounds(743, 0, 401, 814);
		add(panel_1);
		panel_1.setLayout(null);
		
		pnlThemKH = new JPanel();
		pnlThemKH.setVisible(false);
		
		pnlDoiTTKH = new JPanel();
		pnlDoiTTKH.setVisible(false);
		pnlDoiTTKH.setBounds(10, 454, 381, 327);
		panel_1.add(pnlDoiTTKH);
		pnlDoiTTKH.setLayout(null);
		
		JButton btnCapNhat = new JButton("Đổi");
		btnCapNhat.setFocusable(false);
		btnCapNhat.setForeground(Color.WHITE);
		btnCapNhat.setFont(new Font("Arial", Font.BOLD, 18));
		btnCapNhat.setBorder(null);
		btnCapNhat.setBackground(new Color(AppConstants.VIOLET));
		btnCapNhat.setBounds(122, 269, 249, 44);
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
		btnHuyCN.setBounds(10, 269, 102, 44);
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
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_3 = new JLabel("Địa chỉ:");
		lblNewLabel_3_1_1_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_3.setBounds(10, 184, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_1_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(122, 183, 249, 32);
		pnlDoiTTKH.add(textField_5);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1_1 = new JLabel("Ngày sinh:");
		lblNewLabel_3_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_1_1.setBounds(10, 55, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_2_2 = new JLabel("Ngày ĐK:");
		lblNewLabel_3_1_1_1_1_1_1_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_2_2.setBounds(10, 98, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_1_2_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_2_1_1 = new JLabel("Loại KH:");
		lblNewLabel_3_1_1_1_1_1_1_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_2_1_1.setBounds(10, 141, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_1_2_1_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(122, 140, 249, 32);
		pnlDoiTTKH.add(textField_7);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setLocale(new Locale("vi", "VN"));
		dateChooser_2.setFont(new Font("Arial", Font.PLAIN, 18));
		dateChooser_2.setBounds(122, 54, 249, 32);
		pnlDoiTTKH.add(dateChooser_2);
		
		JDateChooser dateChooser_1_1 = new JDateChooser();
		dateChooser_1_1.setLocale(new Locale("vi", "VN"));
		dateChooser_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		dateChooser_1_1.setBounds(122, 98, 249, 32);
		pnlDoiTTKH.add(dateChooser_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_3_1 = new JLabel("Số ĐT:");
		lblNewLabel_3_1_1_1_1_1_1_3_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_3_1.setBounds(10, 227, 102, 31);
		pnlDoiTTKH.add(lblNewLabel_3_1_1_1_1_1_1_3_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(122, 226, 249, 32);
		pnlDoiTTKH.add(textField_9);
		pnlThemKH.setBounds(10, 454, 381, 349);
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
		btnThem.setBounds(122, 296, 249, 38);
		pnlThemKH.add(btnThem);
		
		JButton btnHuyThem = new JButton("Hủy");
		btnHuyThem.setForeground(Color.WHITE);
		btnHuyThem.setFont(new Font("Arial", Font.BOLD, 18));
		btnHuyThem.setFocusable(false);
		btnHuyThem.setBorder(null);
		btnHuyThem.setBackground(new Color(73, 80, 87));
		btnHuyThem.setBounds(10, 297, 102, 38);
		pnlThemKH.add(btnHuyThem);
		btnHuyThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHienThem.setBackground(Color.WHITE);
				pnlThemKH.setVisible(false);
			}
		});
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Mã KH:");
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
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_3_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1.setBounds(10, 215, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(122, 214, 249, 32);
		pnlThemKH.add(textField_3);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_1 = new JLabel("Ngày sinh:");
		lblNewLabel_3_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_1.setBounds(10, 92, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_2 = new JLabel("Ngày ĐK:");
		lblNewLabel_3_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_2.setBounds(10, 133, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_2_1 = new JLabel("Loại KH:");
		lblNewLabel_3_1_1_1_1_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_2_1.setBounds(10, 174, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(122, 173, 249, 32);
		pnlThemKH.add(textField_6);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setLocale(new Locale("vi", "VN"));
		dateChooser.setFont(new Font("Arial", Font.PLAIN, 18));
		dateChooser.setBounds(122, 91, 249, 32);
		pnlThemKH.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setLocale(new Locale("vi", "VN"));
		dateChooser_1.setFont(new Font("Arial", Font.PLAIN, 18));
		dateChooser_1.setBounds(122, 132, 249, 32);
		pnlThemKH.add(dateChooser_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1_4 = new JLabel("Số ĐT:");
		lblNewLabel_3_1_1_1_1_1_1_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3_1_1_1_1_1_1_4.setBounds(10, 256, 102, 31);
		pnlThemKH.add(lblNewLabel_3_1_1_1_1_1_1_4);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(122, 255, 249, 32);
		pnlThemKH.add(textField_8);
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN KHÁCH HÀNG");
		lblNewLabel.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconThongTinHoaDonNho.png")));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 381, 59);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã KH:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 78, 72, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblHoTen = new JLabel("1000");
		lblHoTen.setForeground(Color.BLACK);
		lblHoTen.setFont(new Font("Arial", Font.BOLD, 28));
		lblHoTen.setBounds(112, 67, 163, 44);
		panel_1.add(lblHoTen);
		
		JLabel lblNewLabel_1_1 = new JLabel("Họ tên:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 107, 72, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblHoTen_1 = new JLabel("Nguyễn Văn A");
		lblHoTen_1.setForeground(Color.BLACK);
		lblHoTen_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1.setBounds(112, 107, 279, 30);
		panel_1.add(lblHoTen_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 226, 95, 30);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblHoTen_1_1 = new JLabel("...");
		lblHoTen_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblHoTen_1_1.setForeground(Color.BLACK);
		lblHoTen_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1_1.setBounds(112, 232, 279, 59);
		panel_1.add(lblHoTen_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ngày sinh:");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(10, 138, 95, 30);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblHoTen_1_1_1 = new JLabel("01/01/2000");
		lblHoTen_1_1_1.setForeground(Color.BLACK);
		lblHoTen_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblHoTen_1_1_1.setBounds(112, 138, 106, 30);
		panel_1.add(lblHoTen_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Doanh số:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1.setBounds(10, 296, 106, 30);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblHoTen_1_1_1_1 = new JLabel("1.000.000 VNĐ");
		lblHoTen_1_1_1_1.setForeground(new Color(AppConstants.MAU_TIM_DAM));
		lblHoTen_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblHoTen_1_1_1_1.setBounds(122, 294, 269, 30);
		panel_1.add(lblHoTen_1_1_1_1);
		
		btnHienCN = new JButton("Cập nhật TT ");
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
		btnHienCN.setBounds(207, 334, 184, 49);
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
		
		btnHienThem = new JButton("   Thêm KH mới   ");
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
		btnHienThem.setBounds(10, 394, 381, 49);
		panel_1.add(btnHienThem);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(13, 334, 184, 49);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		lblChuyenCTHD = new JLabel("Xem hóa đơn");
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
				
				JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Ngày ĐK:");
				lblNewLabel_1_1_1_1_2.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
				lblNewLabel_1_1_1_1_2.setBounds(10, 167, 95, 30);
				panel_1.add(lblNewLabel_1_1_1_1_2);
				
				JLabel lblHoTen_1_1_1_2 = new JLabel("01/01/2000");
				lblHoTen_1_1_1_2.setForeground(Color.BLACK);
				lblHoTen_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 18));
				lblHoTen_1_1_1_2.setBounds(112, 167, 279, 30);
				panel_1.add(lblHoTen_1_1_1_2);
				
				JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Loại KH:");
				lblNewLabel_1_1_1_1_2_1.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
				lblNewLabel_1_1_1_1_2_1.setBounds(10, 197, 85, 30);
				panel_1.add(lblNewLabel_1_1_1_1_2_1);
				
				JLabel lblHoTen_1_1_1_2_1 = new JLabel("Thường xuyên");
				lblHoTen_1_1_1_2_1.setForeground(Color.BLACK);
				lblHoTen_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 18));
				lblHoTen_1_1_1_2_1.setBounds(112, 197, 279, 30);
				panel_1.add(lblHoTen_1_1_1_2_1);
				
				JLabel lblNewLabel_1_1_1_1_3 = new JLabel("SĐT:");
				lblNewLabel_1_1_1_1_3.setForeground(Color.BLACK);
				lblNewLabel_1_1_1_1_3.setFont(new Font("Arial", Font.PLAIN, 18));
				lblNewLabel_1_1_1_1_3.setBounds(224, 138, 51, 30);
				panel_1.add(lblNewLabel_1_1_1_1_3);
				
				JLabel lblHoTen_1_1_1_3 = new JLabel("01234567890");
				lblHoTen_1_1_1_3.setForeground(Color.BLACK);
				lblHoTen_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 18));
				lblHoTen_1_1_1_3.setBounds(276, 138, 115, 30);
				panel_1.add(lblHoTen_1_1_1_3);
		
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
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Mã khách hàng", "Họ tên", "Địa chỉ", "Số điện thoại", "Ngày sinh (dd/MM/yyyy)", "Ngày ĐK (dd/MM/yyyy)", "Tháng ĐK (MM/yyyy)", "Năm ĐK (yyyy)", "Loại khách hàng", "Doanh số cao hơn", "Doanh số thấp hơn"}));
		comboBox_2.setBounds(346, 11, 227, 43);
		panel.add(comboBox_2);
		
		JButton btnTm = new JButton("Tìm kiếm");
		btnTm.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconTimKiem.png")));
		btnTm.setForeground(Color.WHITE);
		btnTm.setFont(new Font("Arial", Font.BOLD, 22));
		btnTm.setFocusable(false);
		btnTm.setBorder(null);
		btnTm.setBackground(new Color(73, 80, 87));
		btnTm.setBounds(583, 11, 150, 43);
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
		
		JButton btnHC = new JButton("KH có DS cao nhất      ");
		btnHC.setIcon(new ImageIcon(PnlHoaDon.class.getResource("/hinhAnh/IconStarFull.png")));
		btnHC.setForeground(Color.WHITE);
		btnHC.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC.setFocusable(false);
		btnHC.setBorder(null);
		btnHC.setBackground(new Color(AppConstants.VIOLET));
		btnHC.setAlignmentX(0.5f);
		btnHC.setBounds(10, 44, 296, 49);
		panel_2.add(btnHC);
		
		JButton btnHC_2 = new JButton("10 KH có DS\r\n cao nhất ");
		btnHC_2.setIcon(new ImageIcon(PnlKhachHang.class.getResource("/hinhAnh/IconKhachHang.png")));
		btnHC_2.setForeground(Color.WHITE);
		btnHC_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnHC_2.setFocusable(false);
		btnHC_2.setBorder(null);
		btnHC_2.setBackground(new Color(54, 79, 199));
		btnHC_2.setAlignmentX(0.5f);
		btnHC_2.setBounds(10, 164, 296, 49);
		panel_2.add(btnHC_2);
		
		JButton btnHC_2_1 = new JButton("10 KH có DS thấp nhất");
		btnHC_2_1.setIcon(new ImageIcon(PnlKhachHang.class.getResource("/hinhAnh/IconKhachHang.png")));
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
		
		JButton btnHC_2_2 = new JButton("KH có DS thấp nhất     ");
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
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Số KH tìm thấy: ");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2.setBounds(20, 43, 149, 33);
		panel_3.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("TỔNG DS:");
		lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_1.setBounds(20, 240, 141, 33);
		panel_3.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("KH có doanh số cao nhất:");
		lblNewLabel_2_1_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2.setBounds(20, 74, 367, 33);
		panel_3.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("KH có doanh số thấp nhất:");
		lblNewLabel_2_1_2_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2_1.setBounds(20, 142, 367, 33);
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
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("DS trung bình:");
		lblNewLabel_2_1_2_2_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1_2_2_1_1.setBounds(20, 205, 149, 33);
		panel_3.add(lblNewLabel_2_1_2_2_1_1);
		
		JLabel lblNewLabel_2_1_2_3_2_2 = new JLabel("1.000.000 VNĐ");
		lblNewLabel_2_1_2_3_2_2.setForeground(new Color(54, 79, 199));
		lblNewLabel_2_1_2_3_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1_2_3_2_2.setBounds(171, 205, 216, 33);
		panel_3.add(lblNewLabel_2_1_2_3_2_2);

	}
}
