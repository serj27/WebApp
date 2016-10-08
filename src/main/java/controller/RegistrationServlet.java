package controller;

import DTO.UserDTO;
import Service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;

/**
 * Created by serjd on 06.10.2016.
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = "/registrServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String secondName = request.getParameter("secondName");
        LocalDate birthday = LocalDate.of(Integer.parseInt(request.getParameter("year")),
                Integer.parseInt(request.getParameter("month")), Integer.parseInt(request.getParameter("day")));
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            UserServiceImpl.getInstance().saveUser(new UserDTO(firstName, secondName, birthday, email, password));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("homePage.jsp").forward(request,response);
    }
}
