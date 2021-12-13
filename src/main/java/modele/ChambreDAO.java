package modele;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Chambre;

public class ChambreDAO extends DaoContext {

    public void ajouterChambre( Chambre chambre ) {
        try {
            String query = "INSERT INTO chambre VALUES(NULL, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement( query );
            statement.setDouble( 1, chambre.getPrix() );
            statement.setInt( 2, chambre.getNbreLits() );
            statement.setInt( 3, chambre.getNbrePers() );
            statement.setInt( 4, chambre.getConfort() );
            statement.setString( 5, chambre.getDescription() );

            statement.executeUpdate();
        } catch ( SQLException e ) {
            e.printStackTrace();
        }

    }

    public List<Chambre> getAllChambre() {
        List<Chambre> chambres = new ArrayList<Chambre>();
        ResultSet resultSet = requeteStatement( "SELECT * FROM chambre" );
        try {
            while ( resultSet.next() ) {
                Chambre chambre = new Chambre( resultSet.getInt( "numChambre" ),
                        resultSet.getDouble( "prix" ),
                        resultSet.getInt( "nbreLits" ),
                        resultSet.getInt( "nbrePers" ),
                        resultSet.getInt( "confort" ),
                        resultSet.getString( "description" ) );
                chambres.add( chambre );
            }
            return chambres;
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
        return null;
    }

    public Chambre getChambre( int num ) {

        ResultSet resultSet = requetePreparedStatement( "SELECT * FROM chambre WHERE numChambre = ?", num );
        try {
            resultSet.next();
            Chambre chambre = new Chambre( resultSet.getInt( "numChambre" ),
                    resultSet.getDouble( "prix" ),
                    resultSet.getInt( "nbreLits" ),
                    resultSet.getInt( "nbrePers" ),
                    resultSet.getInt( "confort" ),
                    resultSet.getString( "description" ) );

            return chambre;

        } catch ( SQLException e ) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete( Chambre chambre ) {

        String query = "DELETE FROM chambre WHERE numChambre = ?";
        PreparedStatement stmt;

        try {
            stmt = connection.prepareStatement( query );
            stmt.setInt( 1, chambre.getNumChambre() );
            stmt.executeUpdate();
        } catch ( SQLException e ) {
            System.out.println( "delete chambre : " + e.getMessage() );
        }

    }

    public void update( Chambre chambre ) {
        String query = """
                UPDATE chambre SET
                prix = ?,
                nbreLits = ?,
                nbrePers = ?,
                confort = ?,
                description = ?
                WHERE numChambre = ?
                """;
        try {
            PreparedStatement stmt = connection.prepareStatement( query );
            stmt.setDouble( 1, chambre.getPrix() );
            stmt.setInt( 2, chambre.getNbreLits() );
            stmt.setInt( 3, chambre.getNbrePers() );
            stmt.setInt( 4, chambre.getConfort() );
            stmt.setString( 5, chambre.getDescription() );
            stmt.setInt( 6, chambre.getNumChambre() );

            stmt.executeUpdate();

        } catch ( SQLException e ) {
            System.out.println( "update " + e.getMessage() );
        }

    }

}
