package com.rr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculationServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	String firstValue=request.getParameter("firstValue");
	String secondValue=request.getParameter("secondValue");
	Calculation objCalculation=new Calculation();
	String c=objCalculation.add(firstValue,secondValue);
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	pw.write("<html>");
	pw.write("<body>");
	pw.write("<h1>value is"+c+"</h>");
	pw.write("</body>");
	pw.write("</html>");
	
	}

}
