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

@WebServlet("/NewVaccine")
public class NewVaccine extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewVaccine() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Display's this file??
		request.getRequestDispatcher("/WEB-INF/NewVaccine.jsp").forward(request, response);

		// LIST of Objects
		List<Vaccine> shots = (List<Vaccine>) getServletContext().getAttribute("shots");

	}

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		int doses = Integer.parseInt(request.getParameter("doses"));
		String daysBetween = request.getParameter("between");

		Vaccine entry = new Vaccine(doses, daysBetween, 0, 0, name);

		List<Vaccine> shots = (List<Vaccine>) getServletContext().getAttribute("shots"); // list
		shots.add(entry); // saving inside the list

		
		
		response.sendRedirect("ListVaccine");

	}

}
