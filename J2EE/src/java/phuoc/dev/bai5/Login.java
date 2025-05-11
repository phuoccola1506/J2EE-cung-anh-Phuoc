/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package phuoc.dev.bai5;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(
    urlPatterns = {"/login"},
    initParams = {
        @WebInitParam(name = "message", value = "Dang nhap thanh cong!")
    }
)
public class Login extends HttpServlet {    
    private String message;

    @Override
    public void init() throws ServletException {
        message = getServletConfig().getInitParameter("message");
        System.out.println("==> init() được gọi - " + message);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Dang nhap thanh cong!</h2>");
        response.getWriter().println("<h1>" + message + "</h1>");
    }
}
