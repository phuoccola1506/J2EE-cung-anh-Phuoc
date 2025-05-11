/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package phuoc.dev.bai3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Admin
 */
@WebServlet("/hello")
public class Bai3 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("==> init() được gọi");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("==> doGet() được gọi");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Xin chào từ HelloServlet!</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("==> destroy() được gọi");
    }
}
