/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.User;
import services.AccountService;

/**
 *
 * @author 759005
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String message = request.getParameter("message");
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {

            AccountService auth = new AccountService();
            User user = null;

            if (username != null && username.contentEquals("") && password != null && password.contentEquals("")) {
                user = auth.login(username, password);

                session.setAttribute("user", user);
                response.sendRedirect("home");
            } else { 
                        request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.setAttribute("message", "Invalid Login");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("message", "Invalid Login");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

    }
}
