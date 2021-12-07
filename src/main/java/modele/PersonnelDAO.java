package modele;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Utilisateur;

public class PersonnelDAO extends DaoContext{
	
	public Utilisateur connexion(String login, String mdp) {
		PreparedStatement statement;
		
		try {
			statement = connection.prepareStatement("SELECT * FROM utilisateur WHERE login = ? AND mot_de_passe = ?");
			statement.setString(1, login);
			statement.setString(2, mdp);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			int id = resultSet.getInt("id_perso");
			String log = resultSet.getString("login");
			String pass = resultSet.getString("mot_de_passe");
			
			
			return new Utilisateur(id, log, pass, resultSet.getString("role"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
