package service;

import dao.UsuarioDAO;
import model.Usuario;

public class LoginService {
    private UsuarioDAO usuarioDAO;

    public LoginService() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(String login, String senha) {
        Usuario usuario = usuarioDAO.buscarUsuario(login);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return true;
        }
        return false;
    }

    public String obterTipoUsuario(String login) {
        Usuario usuario = usuarioDAO.buscarUsuario(login);
        return usuario != null ? usuario.getTipo() : null;
    }
}