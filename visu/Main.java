package visu;

import controller.LoginController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Login ===");
        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        loginController.realizarLogin(login, senha);
    }
}