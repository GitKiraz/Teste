package dao;

import model.Usuario;

import java.sql.*;

public class UsuarioDAO {
    // Configurações de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/projetologin1";
    private static final String USER = "root"; // Substitua pelo seu usuário do MySQL
    private static final String PASSWORD = "sua_senha"; // Substitua pela sua senha do MySQL

    public Usuario buscarUsuario(String login) {
        String query = "SELECT * FROM usuarios WHERE login = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, login);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Usuario(
                    rs.getString("login"),
                    rs.getString("senha"),
                    rs.getString("tipo")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}