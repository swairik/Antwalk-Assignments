package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String lang = req.getParameter("dropdown");
		String agree = req.getParameter("ckbox");
		
//		System.out.println(name);
//		System.out.println(password);
//		System.out.println(email);
//		System.out.println(gender);
//		System.out.println(lang);
//		System.out.println(agree);
		
		out.println("Welcome to registration page!!");
		
		if(agree == null) {
			out.println("Please agree to T&C");
			return;
		}
		out.println("name = " + name);
		out.println("password = " + password);
		out.println("email = " + email);
		out.println("gender = " + gender);
		out.println("lang = " + lang);
		
	}
}
