package cs3220.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220.model.Vaccine;

@WebServlet("/NewDoses")
public class NewDoses extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewDoses() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		

		// Display's this file?? 
		request.getRequestDispatcher("/WEB-INF/NewDose.jsp").forward(request, response);

		// LIST of Objects
		List<Vaccine> shots = (List<Vaccine>) getServletContext().getAttribute("shots");


	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get list
		List<Vaccine> shots = (List<Vaccine>) getServletContext().getAttribute("shots");

		// Store the data from the JSP to these variables. 
		String names = request.getParameter("name");
		int received = Integer.parseInt(request.getParameter("received"));
		int total;

		for (Vaccine entry : shots) {
			if ((entry.getName()).equals(names)) {
				total = entry.getDosesRecieved() + received;
				entry.setDosesRecieved(total);
				
				//left doses
				entry.setDosesLeft(total);
			}
		}

		response.sendRedirect("ListVaccine");
	}

}
