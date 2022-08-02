package tienIch;

import java.awt.Component;

import javax.swing.JOptionPane;

public class AppHelper {
	public static String LOI = "Lỗi";
	public static String THONG_BAO = "Thông báo";
	public static String CANH_BAO = "Cảnh báo";
	public static String XAC_NHAN = "Xác nhận";
	
	public static void thongBaoLoiQuaTrinhXuLy(Component component) {
		JOptionPane.showMessageDialog(component, "Đã có lỗi trong quá trình xử lý!", LOI, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public static void thongBaoLoiCapNhat(Component component) {
		JOptionPane.showMessageDialog(component, "Đã có lỗi trong quá trình cập nhật!", LOI, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public static void thongBaoLoiThem(Component component) {
		JOptionPane.showMessageDialog(component, "Đã có lỗi trong quá trình thêm!", LOI, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public static void thongBaoLoi(Component component, String noiDung) {
		JOptionPane.showMessageDialog(component, noiDung, LOI, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public static void thongBao(Component component, String noiDung) {
		JOptionPane.showMessageDialog(component, noiDung, THONG_BAO, 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int canhBaoXacNhan(Component component, String noiDung) {
		return JOptionPane.showConfirmDialog(component, noiDung, CANH_BAO, JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE);
	}
	
	public static void thongBaoNhapThieuTruong(Component component, String tenTruong) {
		JOptionPane.showMessageDialog(component, "Vui lòng nhập vào "+tenTruong+"!", THONG_BAO, 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int thongBaoXacNhan(Component component, String noiDung) {
		return JOptionPane.showConfirmDialog(component, noiDung, XAC_NHAN , JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
	}
	
	public static void main(String[] args) {
		thongBaoLoiThem(null);
	}
}
