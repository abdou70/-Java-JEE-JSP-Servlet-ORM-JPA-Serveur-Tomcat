package Controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senForageEjb.entities.Village;
import sn.senForageEjb.dao.IClientLocal;
import sn.senForageEjb.dao.IVillageLocal;
import sn.senForageEjb.entities.Client;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/Client")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private IClientLocal clientdao;
	@EJB
    private IVillageLocal villagedao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("villages", villagedao.liste());
		request.getRequestDispatcher("WEB-INF/client.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		Client client = new Client();
		
		String nom=request.getParameter("nom").toString();
		String adresse=request.getParameter("adresse").toString();
		String telephone=request.getParameter("telephone").toString();
		int id_village = Integer.parseInt(request.getParameter("id_village"));
		System.out.println("zbdhdhfjfgfjg######################################" + id_village);
		Village village = new Village();
		village=villagedao.getVillage(id_village);
		System.out.println("le village retourner" + village.getNom());
		
		client.setNom(nom);
		client.setAdresse(adresse);
		client.setTelephone(telephone);
		client.setVillage(village);
		//int ok =
		clientdao.add(client);
		doGet(request, response);
	}

}
