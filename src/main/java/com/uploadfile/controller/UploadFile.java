package com.uploadfile.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig
@WebServlet(urlPatterns = {"/servlet"})
public class UploadFile extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("1");
		req.setAttribute("path", getServletContext().getRealPath("/Image"));
		RequestDispatcher rd = req.getRequestDispatcher("./index.jsp");
		rd.forward(req, resp);
	}
}
