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

@WebServlet("/EditVaccine")
public class EditVaccine extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditVaccine() {
		super();
	}

	@SuppressWarnings("unchecked")
	private Vaccine getEntry(int id) {
		List<Vaccine> shots = (List<Vaccine>) getServletContext().getAttribute("shots");

		for (Vaccine entry : shots) {
			if (entry.getId() == id)
				return entry;
		}
		return null;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id"); // is entry.id from line 35 file ListVaccine.jsp
		request.setAttribute("id", id);
		int ids = Integer.parseInt(id); // stores it as an int. 
		request.setAttribute("ids", ids);
		
		// Display's this file?? 
		request.getRequestDispatcher("/WEB-INF/EditVaccine.jsp").forward(request, response);


		// LIST of Objects
		List<Vaccine> shots = (List<Vaccine>) getServletContext().getAttribute("shots");

		

//		System.out.println(entry1.getDosesRequired());
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		// has the data we want to change. (object)
		Vaccine entry1 = getEntry(Integer.parseInt(request.getParameter("id")));
		
		// these "strings" are from the jsp/[html] code. which has the data stored.
		entry1.setName(request.getParameter("name"));
		int doses = Integer.parseInt(request.getParameter("doses"));
		entry1.setDosesRequired(doses);
		entry1.setDaysBetween(request.getParameter("between"));

		// take us back to this page "ListVaccine.java"
		response.sendRedirect("ListVaccine");
	}


}
