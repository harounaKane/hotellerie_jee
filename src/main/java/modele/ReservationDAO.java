package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import beans.Client;
import beans.Reserver;

public class ReservationDAO extends DaoContext {

    public List<Reserver> chambreOccupees() {
        ChambreDAO chambre = new ChambreDAO();
        List<Reserver> reservers = new ArrayList<Reserver>();
        ResultSet resultSet = requeteStatement( "SELECT * FROM reserver" );
        try {
            while ( resultSet.next() ) {
                Reserver reserver = new Reserver(
                        getClient( resultSet.getInt( "client" ) ),
                        chambre.getChambre( resultSet.getInt( "chambre" ) ),
                        resultSet.getString( "dateArrivee" ),
                        resultSet.getString( "dateDepart" ) );

                Date date = new Date();
                if ( date.before( resultSet.getDate( "dateDepart" ) ) )
                    reservers.add( reserver );
            }
            return reservers;
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
        return null;
    }

    public Client getClient( int id ) {
        ResultSet resultSet = requetePreparedStatement( "SELECT * FROM client WHERE numClient = ?", id );
        try {
            resultSet.next();
            return new Client(
                    resultSet.getInt( "numClient" ),
                    resultSet.getString( "nom" ),
                    resultSet.getString( "prenom" ),
                    resultSet.getInt( "telephone" ),
                    resultSet.getString( "adresse" ),
                    resultSet.getInt( "cp_client" ),
                    resultSet.getString( "ville" ) );
        } catch ( SQLException e ) {
            System.out.println( "recup client " + e.getMessage() );
        }
        return null;
    }

}
