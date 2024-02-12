package Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LoginDao;
import Model.Login;


@WebServlet(urlPatterns = {  "/controller" , "/enter" , "/cadastro"})
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public controller() {
        super();
      
    }
    Login login = new Login();
	LoginDao logindao = new LoginDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	   
		String action  = request.getServletPath();
		System.out.println(action);
		 if(action.equals("/enter")) {
			 Logar(request, response);
			 
		 }
		 
		 else if (action.equals("/cadastro")) {
			 
			 Cadastro(request, response);
		 }
	}

	
	protected void Cadastro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		
		login.setSenha(request.getParameter("username"));
		login.setUsuario(request.getParameter("username"));
		
		logindao.InsertLogin(login);
		response.sendRedirect("login.jsp");
	
	}
	
	
	
	protected void Logar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		
		login.setSenha(request.getParameter("username"));
		login.setUsuario(request.getParameter("username"));
		
		ResultSet rs =  logindao.valid(login);
		
		if(rs.next()) {
			
			System.out.println("Logado");
		}
		
		else {
			
			response.sendRedirect("login.jsp");
		}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	

	
}
