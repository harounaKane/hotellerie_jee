package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoContext {

    protected Connection connection;

    public DaoContext() {
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
        } catch ( ClassNotFoundException e ) {
            System.out.println( e );
        }

        try {
            this.connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/hotellerie_cda", "root", "" );
        } catch ( SQLException e ) {
            System.out.println( e );
        }
    }

    public ResultSet requeteStatement( String query ) {
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery( query );
        } catch ( SQLException e ) {
            System.out.println( e );
        }

        return null;
    }

    public ResultSet requetePreparedStatement( String query, int value ) {
        ResultSet resultSet = null;
        try {
            // "SELECT * FROM chambre WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement( query );
            statement.setObject( 1, value );
            resultSet = statement.executeQuery();

        } catch ( SQLException e ) {
            System.out.println( e );
        }

        return resultSet;
    }

}
