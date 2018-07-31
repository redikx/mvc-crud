package testDb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testDbServlet")
public class testDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String user = "mvc_crud";
		String password = "radek01";
		String jdbcUrl = "jdbc:mysql://localhost/apptestcasedb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=CET";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			@SuppressWarnings("unused")
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			response.getWriter().append("Connected at: " + jdbcUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
