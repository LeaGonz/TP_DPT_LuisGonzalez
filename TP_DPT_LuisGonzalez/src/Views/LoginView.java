package Views;

import Controllers.LoginController;
import Tools.Tools;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {
    LoginController loginController;

    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    public void loginView() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int escolha;

        do {
            System.out.printf(Tools.color.YELLOW + """
                            
                            🎢 Bem-vindo ao Parque Temático CESAELand © 🎡
                            
                            %s1-%s Cliente
                            %s2-%s Membro Staff
                            
                            """, Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET);

            escolha = Tools.numValidation(0, 2);

            switch (escolha) {
                case 1:
                    ClientView clientView = new ClientView();
//                    clientView.clientMenu();
                    break;

                case 2, 3:

                    System.out.println(Tools.color.YELLOW + "\nFaça log-in com as suas credenciais\n"
                            + Tools.color.RESET);

                    System.out.print("Utilizador: ");
                    String utilizador = input.next();

                    System.out.print("Palavra-passe: ");
                    String password = input.next();

                    loginValidation(utilizador, password);
                    break;

                case 0:
                    System.out.println("\nHasta pronto mi amigo... ✌️");
                    break;
            }
        } while (escolha != 0);
    }

    private void loginValidation(String username, String password) {
        String userType = loginController.loginFunction(username, password);

        switch (userType) {
            case "ADMIN":
//                AdminView adminView = new AdminView();
//                adminView.adminMenu();
                break;

            case "ENG":
//                EngView engView = new EngView();
//                engView.engMenu();
                break;

            case "ERROR":
                System.out.println("❌ Credenciais de acesso inválidas ❌");
                break;
        }
    }
}
