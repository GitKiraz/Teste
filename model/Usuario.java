package model;

public class Usuario {
    private String login;
    private String senha;
    private String tipo; // "Aluno", "Professor", "Administrador"

    public Usuario(String login, String senha, String tipo) {
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipo() {
        return tipo;
    }
}