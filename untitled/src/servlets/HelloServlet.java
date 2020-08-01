package servlets;

import bean.User;
import database.Connect;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/servletapi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "School14class11ABladykoDanila");
        Statement statement = connection.createStatement();


        ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE name="
                                                        + request.getParameter("name") +
                                                        " AND password=" + request.getParameter("password"));

        if(!resultSet.first()) {
            System.out.println("Nothing");
        }
        else {
            resultSet.next();
            System.out.println(resultSet.getString(1) + " - Name\n" + resultSet.getString(1) + " - Password");
        }

        connection.close();
    }
}


