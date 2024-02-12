package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Conexao.BancoConexao;
import Model.Login;

public class LoginDao {


    BancoConexao conn = new BancoConexao(); 



    public void InsertLogin(Login log){
        String insert = "insert into tabelalogin (usuario , senha) values (?, ?)";
      try {
        Connection con  = conn.creaConnection();
        PreparedStatement pst = con.prepareStatement(insert);
        pst.setString(1, log.getUsuario());
        pst.setString(2, log.getSenha());

        pst.executeUpdate();
        con.close();
      } catch (Exception e) {
        System.out.println(e);
      }

    }
    
public ResultSet valid(Login log){
String sel = "select*from tabelalogin where usuario = ? and senha = ?";
    try {
        Connection con  = conn.creaConnection();
        PreparedStatement pst = con.prepareStatement(sel);
        pst.setString(1, log.getUsuario());
        pst.setString(2, log.getSenha());
        ResultSet rs = pst.executeQuery();
        return rs;
    } catch (Exception e) {
        System.out.println(e);    
       return null;
    }
}



}
