package kz.zhelezyaka.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

@WebServlet("/users")
public class UsersServlet extends HttpServlet {
    private Connection connection;

    @Override
    public void init() throws ServletException {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(getServletContext().getRealPath("/WEB-INF/classes/db.properties")));
            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClassName = properties.getProperty("db.driverClassName");

            Class.forName(driverClassName);
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/jsp/addUser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("first-name");
        String lastName = req.getParameter("last-name");

        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO fix_user(first_name, last_name)" +
                    "VALUES (?, ?)");
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
