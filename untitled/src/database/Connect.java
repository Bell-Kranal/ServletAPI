package database;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public Connection connection;

    @SneakyThrows
    public Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/servletapi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "School14class11ABladykoDanila");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
