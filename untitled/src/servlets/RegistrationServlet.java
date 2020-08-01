package servlets;

import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet("/")
public class RegistrationServlet extends HttpServlet {

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/servletapi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "School14class11ABladykoDanila");
        Statement statement = connection.createStatement();


        statement.execute("INSERT INTO users(name, password) VALUES (" + request.getParameter("name") + "," +
                request.getParameter("password") + ")");
    }
}
