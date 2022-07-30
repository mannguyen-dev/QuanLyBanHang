/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuLyDuLieu;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.KhachHang;

/**
 *
 * @author 20520
 */
public class KhachHangDB {
    private KetNoiCSDL csdl;

    public KhachHangDB() {
        csdl = new KetNoiCSDL();
    }
   
    private KhachHang getKhachHang(ResultSet rs) throws Exception{
       return new KhachHang(rs.getString("makh"), rs.getString("hoten"), rs.getString("dchi"), rs.getString("sodt"), rs.getDate("ngsinh"), rs.getDate("ngdk"), rs.getDouble("doanhso"), rs.getString("loaikh"));
    }
   
    public ArrayList<KhachHang> tatCa(){
       ArrayList<KhachHang> list = new ArrayList<>();
       String query = "select * from khachhang";
       ResultSet rs = csdl.getDuLieu(query);
       try {
           while (rs.next()) {               
               list.add(getKhachHang(rs));
           }
           csdl.getStmt().close();
       } catch (Exception e) {
           e.printStackTrace();
       } finally{
            csdl.offStatement();
        }
       return list;
    }
   
    public ArrayList<KhachHang> timKhachHang(String thongtin){
        ArrayList<KhachHang> list = new ArrayList();
        String query = "select * from khachhang where makh = '"
                + thongtin + "' or hoten like N'%" + thongtin + "%' or sodt = '"
                + thongtin + "'";
        ResultSet rs = csdl.getDuLieu(query);
        try {
            while (rs.next()) {                
                list.add(getKhachHang(rs));
            }
            csdl.getStmt().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            csdl.offStatement();
        }
        return list;
    }
   
    public void themKhachHang(KhachHang kh){
        String query = "insert into khachhang (makh,hoten,dchi,sodt,ngsinh,ngdk,doanhso,loaikh) values "
	+ "('"+kh.getMaKH()+"',N'"+kh.getHoTen()+"',N'"+kh.getDiaChi()+"','"+kh.getSoDT()+"','"+kh.getNgaySinh()+"','"+kh.getNgayDKy()+"','"+kh.getDoanhSo()+"',N'"+kh.getLoaiKH()+"')";
        csdl.setDuLieu(query);
    }
    
    public void capNhatThongTin(KhachHang kh){
        String query = "update khachhang set hoten = N'" +kh.getHoTen()+"', dchi = N'"+kh.getDiaChi()
                +"', sodt = '" + kh.getSoDT()+"', ngsinh = '"+kh.getNgaySinh()+"', ngdk = '"+kh.getNgayDKy()+ "', doanhso = '"+kh.getDoanhSo()+"', loaikh = N'"+kh.getLoaiKH()+
                "' where makh = '" +kh.getMaKH()+"'";
        csdl.setDuLieu(query);
    }
    
    
    public void xoaKhachHang(String makh){
        String query = "delete from khachhang where makh = '"+makh+"'";
        csdl.setDuLieu(query);
    }
   
   
//    public static void main(String[] args) {
//        KhachHangBL kh = new KhachHangBL();
//        //KhachHang p = new KhachHang("XXX", "dacapnhat", "dacapnhat", "dacapnhat", java.sql.Date.valueOf("1993-10-10"), java.sql.Date.valueOf("2006-10-10"), 598632.23, "XXXXX");
//        kh.xoaKhachHang("XXX");
//        ArrayList<KhachHang> list = new ArrayList<>();
//        list = kh.tatCa();
//        list.forEach(s->System.out.println(s.getMaKH()+ ", " + s.getHoTen()+", " + s.getNgaySinh()+", " + s.getDoanhSo()));
//    }
}
