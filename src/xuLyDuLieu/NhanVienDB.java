/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuLyDuLieu;

import java.util.ArrayList;
import java.util.List;

import model.NhanVien;
import java.sql.ResultSet;


/**
 *
 * @author 20520
 */
public class NhanVienDB {
    private KetNoiCSDL csdl;

    public NhanVienDB() {
        csdl = new KetNoiCSDL();
    }
    
    private NhanVien getNhanVien(ResultSet rs) throws Exception {
        return new NhanVien(rs.getString("manv"), rs.getString("hoten"),rs.getString("sodt"),
				rs.getDate("ngvl"),rs.getString("matkhau"),rs.getString("vaitro"));
    }
    
    
    public ArrayList<NhanVien> tatCa(){
        ArrayList<NhanVien> list = new ArrayList();
        String query = "select * from nhanvien";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        
        return list;
    }
    
    public ArrayList<NhanVien> timNhanVien(String thongtin){
        ArrayList<NhanVien> list = new ArrayList();
        String query = "select * from nhanvien where manv = '"
                + thongtin + "' or hoten like N'%" + thongtin + "%' or sodt = '"
                + thongtin + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getNhanVien(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
    
    public NhanVien timTheoMaNV(String maNV){
        NhanVien nv = null;
        String query = "select * from nhanvien where manv = '"+ maNV + "'"; 
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                nv = getNhanVien(rs);
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return nv;
    }
    
    public void themNhanVien(NhanVien nv){
        String query = "insert into nhanvien (manv,hoten,sodt,ngvl,matkhau,vaitro) values "
	+ "('"+nv.getMaNV()+"',N'"+nv.getHoTen()+"','"+nv.getSoDT()+"','"+nv.getNgVL()+"','"+nv.getMatKhau()+"',N'"+nv.getVaiTro()+"')";
        csdl.setDuLieu(query);
    }
    
    public void capNhatThongTin(NhanVien nv){
        String query = "update nhanvien set hoten = N'" +nv.getHoTen()+"', sodt = '"+nv.getSoDT()
                +"', ngvl = '" + nv.getNgVL()+"', matkhau = '"+nv.getMatKhau()+"', vaitro = N'"+nv.getVaiTro()+
                "' where manv = '" +nv.getMaNV()+"'";
        csdl.setDuLieu(query);
    }
    
    public void xoaNhanVien(String manv){
        String query = "delete from nhanvien where manv = '"+manv+"'";
        csdl.setDuLieu(query);
    }
    
    public static void main(String[] args) {
		NhanVienDB nvBL = new NhanVienDB();
    	NhanVien nv = nvBL.timTheoMaNV("NV02");
    	System.out.println(nv.getHoTen());
	}
}
