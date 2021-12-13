package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Reserver;
import modele.ReservationDAO;

/**
 * Servlet implementation class Reservation
 */
@WebServlet( "/Reservation" )
public class Reservation extends HttpServlet {
    private static final long serialVersionUID = 1L;
    String                    vue              = "/index.jsp";
    final String              VUE_DEF          = "/WEB-INF/vues/";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservation() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        String action = request.getParameter( "action" );

        if ( action != null ) {
            if ( action.equals( "reservations" ) ) {
                ReservationDAO reservationDAO = new ReservationDAO();
                List<Reserver> reservations = reservationDAO.chambreOccupees();
                request.setAttribute( "reservations", reservations );
                vue = VUE_DEF + "listeReservation.jsp";

            } else if ( action.equals( "retirer" ) ) {
                System.out.println( action );

            } else if ( action.equals( "prolonger" ) ) {
                System.out.println( action );

            }
        }

        getServletContext().getRequestDispatcher( vue ).forward( request, response );
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet( request, response );
    }

}
