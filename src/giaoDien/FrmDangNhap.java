package giaoDien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tienIch.AppConstants;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDangNhap frame = new FrmDangNhap();
					
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		JLabel lblNewLabel_1 = new JLabel("Mã nhân viên");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(429, 47, 215, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setBounds(429, 85, 331, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mật khẩu");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(429, 132, 215, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("* Nếu chưa có tài khoản, vui lòng liên hệ Admin!");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(new Color(AppConstants.MAU_TIM));
		lblNewLabel_2.setBounds(429, 446, 284, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
		passwordField.setBounds(429, 170, 331, 36);
		contentPane.add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Lưu đăng nhập");
		chckbxNewCheckBox.setForeground(Color.BLACK);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(429, 213, 137, 27);
		chckbxNewCheckBox.setBackground(new Color(AppConstants.MAU_TIM_NHAT_3));
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("Quên mật khẩu?");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(610, 217, 148, 23);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("   Đăng nhập");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmMain frmMain = new FrmMain();
				frmMain.setVisible(true);
				frmMain.setExtendedState(JFrame.MAXIMIZED_BOTH);
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(FrmDangNhap.class.getResource("/hinhAnh/IconDangNhap.png")));
		btnNewButton.setBackground(new Color(AppConstants.MAU_TIM_DAM));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.setBounds(429, 255, 206, 66);
		contentPane.add(btnNewButton);
		
		JLabel lblHinh = new JLabel("New label");
		ImageIcon image2 = new ImageIcon(FrmDangNhap.class.getResource("/hinhAnh/HinhDangNhap.jpg"));
		lblHinh.setBounds(0, 0, 394, 471);
		lblHinh.setIcon(new ImageIcon(image2.getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_DEFAULT)));
		contentPane.add(lblHinh);
		
		JButton btnThot = new JButton("Thoát");
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnThot.setForeground(Color.WHITE);
		btnThot.setFont(new Font("Arial", Font.BOLD, 18));
		btnThot.setBorder(null);
		btnThot.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		btnThot.setBounds(649, 255, 111, 66);
		contentPane.add(btnThot);
		
		setLocationRelativeTo(null);
	}
}
