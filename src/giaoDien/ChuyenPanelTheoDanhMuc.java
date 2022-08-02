package giaoDien;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.DanhMucBean;
import tienIch.AppConstants;

public class ChuyenPanelTheoDanhMuc {
	private FrmMain frmMain;
	private JPanel root;
	private String kindSelected = "";
	private List<DanhMucBean> listItem = null;
	
	public ChuyenPanelTheoDanhMuc(FrmMain jpnRoot) {
		super();
		frmMain = jpnRoot;
		this.root = jpnRoot.getJpnView();
	}
	
	public void setView(JPanel jpnItem, JLabel jlbItem) {
		kindSelected = AppConstants.TRANG_CHU;
		jpnItem.setBackground(new Color(AppConstants.MAU_TIM));
		jlbItem.setBackground(new Color(AppConstants.MAU_TIM));
		
		root.removeAll();
		root.setLayout(new BorderLayout());
		PnlTrangChu pnlTC = new PnlTrangChu(frmMain.getUser());
		root.add(pnlTC);
		root.validate();
		root.repaint();
	}
	
	public void setViewCTHD() {
		kindSelected = AppConstants.CTHD;
		listItem.get(1).getJlb().setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		listItem.get(1).getJpn().setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		listItem.get(2).getJlb().setBackground(new Color(AppConstants.MAU_TIM));
		listItem.get(2).getJpn().setBackground(new Color(AppConstants.MAU_TIM));
		
		PnlHoaDon pnlHD = (PnlHoaDon) root.getComponent(0);
		PnlCTHD pnlCTHD = new PnlCTHD(pnlHD.getHdHienTai());
		root.removeAll();
		root.setLayout(new BorderLayout());
		root.add(pnlCTHD);
		root.validate();
		root.repaint();
	}
	
	public void setViewFromKhachHangToHoaDon() {
		kindSelected = AppConstants.HOA_DON;
		listItem.get(4).getJlb().setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		listItem.get(4).getJpn().setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
		listItem.get(1).getJlb().setBackground(new Color(AppConstants.MAU_TIM));
		listItem.get(1).getJpn().setBackground(new Color(AppConstants.MAU_TIM));
		
		PnlKhachHang pnlKH = (PnlKhachHang) root.getComponent(0);
		PnlHoaDon pnlHD = new PnlHoaDon();
		root.removeAll();
		root.setLayout(new BorderLayout());
		root.add(pnlHD);
		pnlHD.hienThiHoaDonKhachHang(pnlKH.getKhHienTai());
		pnlHD.setController(pnlKH.getController());
		root.validate();
		root.repaint();
	}
	
	public void setEvent(List<DanhMucBean> listItem) {
		this.listItem = listItem;
		for (DanhMucBean item: listItem) {
			item.getJpn().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
		}
	}
	
	class LabelEvent implements MouseListener{
		
		private JPanel node;
		
		private String kind;
		private JPanel jpnItem;
		private JLabel jlbItem;
				
		public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
			super();
			this.kind = kind;
			this.jpnItem = jpnItem;
			this.jlbItem = jlbItem;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			clickEvent();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			clickEvent();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (!kindSelected.equalsIgnoreCase(kind)) {
				jpnItem.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
				jlbItem.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (!kindSelected.equalsIgnoreCase(kind)) {
				jpnItem.setBackground(new Color(7639036));
				jlbItem.setBackground(new Color(7639036));
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!kindSelected.equalsIgnoreCase(kind)) {
				jpnItem.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
				jlbItem.setBackground(new Color(AppConstants.MAU_XAM_NHAT_2));
			}
		}
		
		private void clickEvent() {
			kindSelected = kind;
			switch(kind) {
				case AppConstants.TRANG_CHU:
					node = new PnlTrangChu(frmMain.getUser());
					PnlTrangChu nodeTC = (PnlTrangChu) node;
					nodeTC.setUser(frmMain.getUser());
					break;
				case AppConstants.HOA_DON:
					node = new PnlHoaDon();
					PnlHoaDon nodeHD = (PnlHoaDon) node;
//					nodeHD.setJpnView(root);
					nodeHD.setController(frmMain.getController());
					nodeHD.setUser(frmMain.getUser());
					break;
				case AppConstants.CTHD:
					node = new PnlCTHD(null);
					break;
				case AppConstants.SAN_PHAM:
					node = new PnlSanPham();
					break;
				case AppConstants.KHACH_HANG:
					node = new PnlKhachHang();
					PnlKhachHang nodeKH = (PnlKhachHang) node;
					nodeKH.setController(frmMain.getController());
					break;
				case AppConstants.NHAN_VIEN:
					node = new PnlNhanVien();
					break;
				default:
					node = new PnlTrangChu(frmMain.getUser());
					break;
			}
			root.removeAll();
			root.setLayout(new BorderLayout());
			root.add(node);
			root.validate();
			root.repaint();
			setChangeBackground(kind,AppConstants.MAU_TIM,AppConstants.MAU_XAM_NHAT_2);
		}
		
	}
	
	private void setChangeBackground(String kind, int colorActive, int colorInactive) {
		for (DanhMucBean item: listItem) {
			if(item.getKind().equalsIgnoreCase(kind)) {
				item.getJlb().setBackground(new Color(colorActive));
				item.getJpn().setBackground(new Color(colorActive));
			}else {
				item.getJlb().setBackground(new Color(colorInactive));
				item.getJpn().setBackground(new Color(colorInactive));
			}
		}
	}	
}
