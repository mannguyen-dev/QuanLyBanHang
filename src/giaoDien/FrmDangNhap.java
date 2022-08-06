package giaoDien;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.NhanVien;
import tienIch.AppConstants;
import tienIch.AppHelper;
import xuLyDuLieu.NhanVienDB;

public class FrmDangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaNV;
	private JPasswordField txtMatKhau;
	private JCheckBox cboLuuDangNhap;

	/**
	 * Create the frame.
	 */
	public FrmDangNhap() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FrmDangNhap.class.getResource("/hinhAnh/LogoApp.jpg")));
		setBackground(Color.WHITE);
		setTitle("QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(AppConstants.MAU_TIM_NHAT_3));
		contentPane.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên");
		lblMaNV.setForeground(Color.BLACK);
		lblMaNV.setFont(new Font("Arial", Font.BOLD, 18));
		lblMaNV.setBounds(429, 47, 215, 27);
		contentPane.add(lblMaNV);
		
		txtMaNV = new JTextField();
		txtMaNV.setBorder(null);
		txtMaNV.setFont(new Font("Arial", Font.PLAIN, 18));
		txtMaNV.setBounds(429, 85, 331, 36);
		contentPane.add(txtMaNV);
		txtMaNV.setColumns(10);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu");
		lblMatKhau.setForeground(Color.BLACK);
		lblMatKhau.setFont(new Font("Arial", Font.BOLD, 18));
		lblMatKhau.setBounds(429, 132, 215, 27);
		contentPane.add(lblMatKhau);
		
		JLabel lblNewLabel_2 = new JLabel("* Nếu chưa có tài khoản, vui lòng liên hệ Admin!");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(new Color(AppConstants.MAU_TIM));
		lblNewLabel_2.setBounds(429, 446, 284, 14);
		contentPane.add(lblNewLabel_2);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBorder(null);
		txtMatKhau.setFont(new Font("Arial", Font.PLAIN, 18));
		txtMatKhau.setBounds(429, 170, 331, 36);
		contentPane.add(txtMatKhau);
		
		cboLuuDangNhap = new JCheckBox("Lưu tên đăng nhập");
		cboLuuDangNhap.setSelected(true);
		cboLuuDangNhap.setForeground(Color.BLACK);
		cboLuuDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboLuuDangNhap.setBounds(429, 213, 175, 27);
		cboLuuDangNhap.setBackground(new Color(AppConstants.MAU_TIM_NHAT_3));
		contentPane.add(cboLuuDangNhap);
		
		JLabel lblQuenMK = new JLabel("Quên mật khẩu?");
		lblQuenMK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Da yeu gui yeu cau reset lai mat khau
				if (AppHelper.thongBaoXacNhan(getRootPane(), "Hệ thống sẽ gửi yêu cầu reset mật khẩu. Xác nhận?")
						== JOptionPane.OK_OPTION) {
					// TODO: lien he admin
					
					AppHelper.thongBao(getRootPane(), "Đã gửi yêu cầu reset mật khẩu lên hệ thống. Xin vui lòng chờ admin liên hệ, cảm ơn!");
				}
			}
		});
		lblQuenMK.setForeground(Color.BLACK);
		lblQuenMK.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuenMK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuenMK.setBounds(610, 217, 148, 23);
		contentPane.add(lblQuenMK);
		
		JButton btnDangNhap = new JButton("   Đăng nhập");
		btnDangNhap.setForeground(Color.WHITE);
		btnDangNhap.setBorder(null);
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// Dang nhap
				String maNV = txtMaNV.getText();
				String matKhau = String.valueOf(txtMatKhau.getPassword());
				if (maNV.equals("")) {
					JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mã nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}else if (matKhau.equals("")){
					JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}else {
					NhanVienDB nvDB = new NhanVienDB();
					NhanVien nv = nvDB.timTheoMaNV(maNV);
					
					if (nv == null) {
						JOptionPane.showMessageDialog(rootPane, "Nhân viên không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
					} else if (!nv.getMatKhau().equals(matKhau)) {
						JOptionPane.showMessageDialog(rootPane, "Sai mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
					} else {
						FrmMain frmMain = new FrmMain(nv);
						frmMain.setExtendedState(JFrame.MAXIMIZED_BOTH);
						frmMain.setVisible(true);
						setVisible(false);
						
						// Luu dang nhap
						try {
							File file = new File(AppConstants.NOI_LUU_TK_DANG_NHAP);
							if (cboLuuDangNhap.isSelected()) {
								FileOutputStream os = null;
								if (!file.isFile()) {
										file.createNewFile();
								}
								os = new FileOutputStream(file);
								os.write(maNV.getBytes());								
								os.close();
							}else {
								file.delete();
							}
						} catch (IOException e1) {
							AppHelper.thongBaoLoiQuaTrinhXuLy(getRootPane());
						}
					}
				}
			}
		});
		btnDangNhap.setIcon(new ImageIcon(FrmDangNhap.class.getResource("/hinhAnh/IconDangNhap.png")));
		btnDangNhap.setBackground(new Color(AppConstants.MAU_TIM_DAM));
		btnDangNhap.setFont(new Font("Arial", Font.BOLD, 18));
		btnDangNhap.setBounds(429, 255, 206, 66);
		contentPane.add(btnDangNhap);
		
		JLabel lblHinh = new JLabel("New label");
		ImageIcon image2 = new ImageIcon(FrmDangNhap.class.getResource("/hinhAnh/HinhDangNhap.jpg"));
		lblHinh.setBounds(0, 0, 394, 471);
		lblHinh.setIcon(new ImageIcon(image2.getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_DEFAULT)));
		contentPane.add(lblHinh);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		btnThoat.setForeground(Color.WHITE);
		btnThoat.setFont(new Font("Arial", Font.BOLD, 18));
		btnThoat.setBorder(null);
		btnThoat.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		btnThoat.setBounds(649, 255, 111, 66);
		contentPane.add(btnThoat);
		
		setLocationRelativeTo(null);
		
		loadData();
	}
	
	private void loadData() {
		try {
			File file = new File(AppConstants.NOI_LUU_TK_DANG_NHAP);
			FileInputStream is = null;
			if (file.isFile()) {
				is = new FileInputStream(file);
				FileChannel fc = is.getChannel();
				ByteBuffer bb = ByteBuffer.allocate(0x100);
				bb.order(ByteOrder.LITTLE_ENDIAN);
				fc.read(bb);
				String data = new String(bb.array());
				int  i = 0;
				while (data.charAt(i) != '\0') {
					i++;
				}
				String maNV = data.substring(0,i);
				txtMaNV.setText(maNV);
				is.close();
			}			
		} catch (IOException e) {
			AppHelper.thongBaoLoiQuaTrinhXuLy(getRootPane());
		}
	}
}
