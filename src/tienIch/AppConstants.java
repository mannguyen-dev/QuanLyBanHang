package tienIch;

public class AppConstants {
	//tai khoan ket noi database
	public final static String DB_NAME			= "QLBH4";
	public final static String DB_USERNAME		= "sa";
	public final static String DB_PASSWORD		= "sa";
	
	//Colors
	public final static int MAU_TIM		 	= Integer.parseInt("4C6EF5",16);
	public final static int MAU_TIM_DAM		= Integer.parseInt("364fc7",16);
	public final static int MAU_TIM_NHAT 	= Integer.parseInt("748FFC",16);
	public final static int MAU_TIM_NHAT_2 	= Integer.parseInt("bac8ff",16);
	public final static int MAU_TIM_NHAT_3 	= Integer.parseInt("dbe4ff",16);
	
	public final static int MAU_XAM 		= Integer.parseInt("495057",16);
	public final static int MAU_XAM_NHAT 	= Integer.parseInt("DEE2E6",16);
	public final static int MAU_XAM_NHAT_2 	= Integer.parseInt("868E96",16);
	
	public final static int MAU_DO 			= Integer.parseInt("fa5252",16);
	public final static int MAU_XANH_LA 	= Integer.parseInt("0ca678",16);
	public final static int MAU_CAM 		= Integer.parseInt("f08c00",16);
	public final static int VIOLET 			= Integer.parseInt("7048e8",16);
	
	//Kinds
	public final static String TRANG_CHU 	= "TrangChu";
	public final static String HOA_DON 		= "HoaDon";
	public final static String SAN_PHAM 	= "SanPham";
	public final static String KHACH_HANG 	= "KhachHang";
	public final static String CTHD 		= "CTHD";
	public final static String NHAN_VIEN 	= "NhanVien";
	
	//Menh de
	public final static String CHON_HOA_DON	= "<Vui lòng chọn hóa đơn để hiển thị>";
	public final static String EMPTY		= "<trống>";
	public final static String NO_INFO		= "...";
	public final static String HOA_DON_GAN_NHAT		= "TOP 10 hóa đơn gần nhất";
	public final static String HOA_DON_CU_NHAT		= "TOP 10 hóa đơn cũ nhất";
	public final static String HOA_DON_CAO_NHAT		= "TOP 10 hóa đơn có trị giá cao nhất";
	public final static String HOA_DON_THAP_NHAT	= "TOP 10 hóa đơn có trị giá thấp nhất";
	public final static String SAN_PHAM_BAN_CHAY	= "TOP 10 sản phẩm bán chạy nhất";
	public final static String SAN_PHAM_BAN_CHAM	= "TOP 10 sản phẩm bán chậm nhất";
	public final static String KHACH_HANG_DS_CAO_NHAT	= "TOP 10 khách hàng có doanh số cao nhất";
	public final static String KHACH_HANG_DS_THAP_NHAT	= "TOP 10 khách hàng có doanh số thấp nhất";
	
	//ten truong
	public final static String SO_HOA_DON	= "Số hóa đơn";
	public final static String MA_NV		= "Mã nhân viên";
	public final static String TEN_NV		= "Tên nhân viên";
	public final static String MA_KH		= "Mã khách hàng";
	public final static String TEN_KH		= "Tên khách hàng";
	public final static String NGAY_HD		= "Ngày HĐ (dd/MM/yyyy)";
	public final static String THANG_HD		= "Tháng HĐ (MM/yyyy)";
	public final static String NAM_HD		= "Năm HĐ (yyyy)";	
	public final static String TRIGIA_CAOHON		= "Trị giá cao hơn";
	public final static String TRIGIA_THAPHON		= "Trị giá thấp hơn";
	public final static String HO_TEN		= "Họ tên";
	public final static String DIA_CHI		= "Địa chỉ";
	public final static String SO_DT		= "Số điện thoại";
	public final static String NGAY_SINH	= "Ngày sinh (dd/MM/yyyy)";
	public final static String NGAY_DK		= "Ngày ĐK (dd/MM/yyyy)";
	public final static String THANG_DK		= "Tháng ĐK (MM/yyyy)";
	public final static String NAM_DK		= "Năm ĐK (yyyy)";
	public final static String LOAI_KH		= "Loại khách hàng";
	public final static String DS_CAOHON	= "Doanh số cao hơn";
	public final static String DS_THAPHON	= "Doanh số thấp hơn";
	public final static String MA_SP		= "Mã sản phẩm";
	public final static String TEN_SP		= "Tên sản phẩm";
	public final static String DVT			= "ĐVT (cây, hộp, cái, quyển, chục)";
	public final static String NUOC_SX		= "Nước sản xuất";
	public final static String GIA_CAOHON	= "Giá cao hơn";
	public final static String GIA_THAPHON	= "Giá thấp hơn";
	public final static String NGAY_VL		= "Ngày VL (dd/MM/yyyy)";
	public final static String THANG_VL		= "Tháng VL (MM/yyyy)";
	public final static String NAM_VL		= "Năm VL (yyyy)";
	public final static String VAITRO		= "Vai trò";
	
	//don vi tinh
	public final static String CAY			= "cây";
	public final static String CHUC			= "chục";
	public final static String CAI			= "cái";
	public final static String QUYEN		= "quyển";
	public final static String HOP			= "hộp";
	
	//Vai tro
	public final static String VT_ADMIN		= "Admin";
	public final static String VT_NHANVIEN	= "Nhân Viên";
	
	//Dinh dang thoi gian
	public final static String DD_NGAY		= "dd/MM/yyyy";
	public final static String DD_THANG		= "MM/yyyy";
	public final static String DD_NAM		= "yyyy";
	
	//Ten cot
	public final static String COT_STT		= "STT";
	public final static String COT_HOTEN	= "HỌ TÊN";
	
	public final static String COT_SOHD		= "SỐ HĐ";
	public final static String COT_NGHD		= "NGÀY HĐ";
	public final static String COT_TTKH		= "TT KHÁCH HÀNG";
	public final static String COT_TTNV		= "TT NHÂN VIÊN";
	public final static String COT_TRIGIA	= "TRỊ GIÁ";
	
	public final static String COT_MASP		= "MÃ SP";
	public final static String COT_TENSP	= "TÊN SP";
	public final static String COT_DVT		= "ĐVT";
	public final static String COT_NUOCSX	= "NƯỚC SX";
	public final static String COT_DONGIA	= "ĐƠN GIÁ";
	public final static String COT_SLDABAN	= "SL ĐÃ BÁN";
	
	public final static String COT_MAKH		= "MÃ KH";
	public final static String COT_DIACHI	= "ĐỊA CHỈ";
	public final static String COT_SODT		= "SỐ ĐT";
	public final static String COT_NGSINH	= "NGÀY SINH";
	public final static String COT_NGDK		= "NGÀY ĐK";
	public final static String COT_LOAIKH	= "LOẠI KH";
	public final static String COT_DOANHSO	= "DOANH SỐ";
	
	public final static String COT_SANPHAM	= "SẢN PHẨM";
	public final static String COT_SL		= "SỐ LƯỢNG";
	
	public final static String COT_MANV		= "MÃ NV";
	public final static String COT_VAITRO	= "VAI TRÒ";
	public final static String COT_NGVL		= "NGÀY VL";

	
	//orther
	public final static double THUE			= 0.1;
	public final static String MATKHAU_MACDINH		= "12345678";
	public final static String NOI_LUU_TK_DANG_NHAP = "src/DangNhap.dat";
}
