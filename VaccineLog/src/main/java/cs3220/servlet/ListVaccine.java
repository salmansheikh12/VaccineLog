package cs3220.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs3220.model.Vaccine;
@WebServlet(urlPatterns = "/ListVaccine", loadOnStartup = 1)
public class ListVaccine extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListVaccine() {
		super();

	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		List<Vaccine> shots = new ArrayList<Vaccine>();
		shots.add(new Vaccine(2, "21", 10000, 10000, "Pfizer/BioNTech"));
		shots.add(new Vaccine(1, " ", 5000, 5000, "Johnson & Johnson"));

		getServletContext().setAttribute("shots", shots); // application scope
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/ListVaccine.jsp").forward(request, response);
	
	
	}



}
