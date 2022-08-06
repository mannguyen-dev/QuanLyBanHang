package xuLyDuLieu;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SanPham;
/**
 *
 * @author 20520
 */
public class SanPhamDB {
    private KetNoiCSDL csdl;

    public SanPhamDB() {
        csdl = new KetNoiCSDL();
    }
    
    private SanPham getSanPham(ResultSet rs)throws Exception{
        return new SanPham(rs.getString("MASP"), rs.getString("TENSP"), rs.getString("DVT"), rs.getString("NUOCSX"),
        		rs.getDouble("GIA"));
    }
    
    public ArrayList<SanPham> tatCa(){
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from SANPHAM";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getSanPham(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public SanPham timTheoMaSP(String maSP){
        SanPham sp = null;
        String query = "select * from SANPHAM where MASP = '" + maSP + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) sp = getSanPham(rs);
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return sp;
    }
    
    public SanPham kiemTraTonTaiMaSP(String maSP){
        SanPham sp = null;
        String query = "select * from SANPHAM where MASP = '" + maSP + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            if (rs.next()) {                
            	sp = getSanPham(rs);
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return sp;
    }
    
    public ArrayList<SanPham> timTheoTenSP(String tenSP){
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from SANPHAM where TENSP like N'%" + tenSP + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getSanPham(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<SanPham> timTheoDonViTinh(String donViTinh){
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from SANPHAM where DVT = N'" + donViTinh + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getSanPham(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<SanPham> timTheoNuocSX(String nuocSX){
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from SANPHAM where NUOCSX like N'%" + nuocSX + "%'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getSanPham(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<SanPham> timTheoGiaBan(double giaBan){
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from SANPHAM where GIA = " + giaBan;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getSanPham(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<SanPham> giaBanCaoHon(double giaBan){
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from SANPHAM where GIA >= " + giaBan;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getSanPham(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public ArrayList<SanPham> giaBanThapHon(double giaBan){
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String query = "select * from SANPHAM where GIA <= " + giaBan;
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
            	if (rs.getString("IS_DELETED")==null) list.add(getSanPham(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public int themSanPham(SanPham sp){
        String query = "insert into SANPHAM (MASP,TENSP,DVT,NUOCSX,GIA) values "
	+ "('"+sp.getMaSP()+"',N'"+sp.getTenSP()+"',N'"+sp.getDonViTinh()+"',N'"+sp.getNuocSX()+"',"+sp.getGiaBan()+")";
        return csdl.setDuLieu(query);
    }
    
    public int capNhatThongTin(SanPham sp){
        String query = "update SANPHAM set TENSP = N'" +sp.getTenSP()+"', DVT = N'"+sp.getDonViTinh()
                +"', NUOCSX = N'" + sp.getNuocSX()+"', GIA = "+sp.getGiaBan()+
                " where MASP = '" +sp.getMaSP()+"'";
        return csdl.setDuLieu(query);
    }
    
    public int xoaSanPham(String masp){
        String query = "delete from SANPHAM where MASP = '"+masp+"'";
        return csdl.setDuLieu(query);
    }
    
    public int xoaMem(String masp){
        String query = "update SANPHAM set IS_DELETED = 'TRUE' where MASP = '"+masp+"'";
        return csdl.setDuLieu(query);
    }
    
    public ArrayList<SanPham> topSanPhamBanChay(int top){
    	ArrayList<SanPham> list = new ArrayList<SanPham>();
        
        //rs include tabs =  soluongsanphamdaban /t masp /t tensp /t nuocsx
        String query = "select top "+top+" with ties A.tong as soluongln, sp.MASP, sp.TENSP, sp.NUOCSX, sp.DVT, sp.GIA "
        		+ "from (select CTHD.MASP, sum (SL) as 'tong' from CTHD group by MASP) A right join SANPHAM sp "
        		+ "on A.MASP = sp.MASP where sp.IS_DELETED is null or A.tong is null order by soluongln desc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getSanPham(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }

    public ArrayList<SanPham> topSanPhamBanCham(int top){
    	ArrayList<SanPham> list = new ArrayList<SanPham>();
        
        //rs include tabs =  soluongsanphamdaban /t masp /t tensp /t nuocsx
        String query = "select top "+top+" with ties A.tong as soluongln, sp.MASP, sp.TENSP, sp.NUOCSX, sp.DVT, sp.GIA "
        		+ "from (select CTHD.MASP, sum (SL) as 'tong' from CTHD group by MASP) A right join SANPHAM sp "
        		+ "on A.MASP = sp.MASP where IS_DELETED is null or A.tong is null order by soluongln asc";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getSanPham(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public int soLuongSPDaBan(String maSP) {
    	String query = "select * from (select CTHD.MASP, sum (CTHD.SL) as SOLUONG from CTHD group by MASP) A, "
    			+ "SANPHAM sp where A.MASP = sp.MASP and sp.MASP = '"+maSP+"'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
        	if (rs.next()) {
				return rs.getInt("SOLUONG");
        	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return 0;
    }
}
