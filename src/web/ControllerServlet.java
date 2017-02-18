package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import metier.CreditMetier;

public class ControllerServlet  extends HttpServlet{
	
	private CreditMetier creditMetier ;
	
	@Override
	public void init() throws ServletException {
		creditMetier = new CreditMetier();
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		req.setAttribute("mod", new CreditModel());
		req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double montant = Double.parseDouble(req.getParameter("Montant"));
		double Taux = Double.parseDouble(req.getParameter("Taux"));
		double Duree = Double.parseDouble(req.getParameter("Duree"));
		CreditModel creditModel = new CreditModel();
		creditModel.setDuree(Duree);
		creditModel.setMontant(montant);
		creditModel.setTaux(Taux);
		
		double res = creditMetier.CalculeMetionaliter(montant, Duree, Taux);
		
		creditModel.setMensulite(res);
		
		req.setAttribute("mod", creditModel);
		
		req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
		
	}

}
