package controller;

import service.LoginService;

public class LoginController {
    private LoginService loginService;

    public LoginController() {
        this.loginService = new LoginService();
    }

    public void realizarLogin(String login, String senha) {
        if (loginService.autenticar(login, senha)) {
            String tipoUsuario = loginService.obterTipoUsuario(login);
            System.out.println("Login bem-sucedido! Tipo de usuário: " + tipoUsuario);
            // Redirecionar para a tela principal com base no tipo de usuário
        } else {
            System.out.println("Login falhou! Verifique suas credenciais.");
        }
    }
}