package com.app;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class registerServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException{
        PrintWriter pw = res.getWriter();

        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try{
            ClassforName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb","root","Crunchy@123");

            PreparedStatement ps = con.prepareStatement("insert into users(username,email,password)values(?,?,?)");

            ps.setString(1,username);
            ps.setString(2,email);
            ps.setString(3,password);

            if(row>0){
                pw.println("register succesfull");
                resp.sendRedirect("login.htlm");
            }
            else{
                pw.println("register failed");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            pw.println(e.getMessage());
        }
    }
}
