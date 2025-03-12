package Views;

import Controllers.AdminController;
import Tools.Tools;

import java.util.Scanner;

public class AdminView {
    AdminController adminController;

    public AdminView() {
        this.adminController = new AdminController();
    }

    public void adminMenu() {
        Scanner input = new Scanner(System.in);

        int escolha;
        do {
            System.out.printf(Tools.color.YELLOW + """
                            
                            🎢 Menu Administrador - Parque Temático CESAELand © 👨‍💻
                            
                            %s1-%s  Consultar o total de todas as vendas
                            %s2-%s  Consultar o total de lucro
                            %s3-%s  Consultar o total de vendas e lucro por mês, de forma tabelar
                            %s4-%s  Consultar a atração mais procurada por adultos (número de bilhetes vendidos)
                            %s5-%s  Consultar a atração mais procurada por crianças (número de bilhetes vendidos)
                            %s6-%s  Consultar a atração mais procurada (número de bilhetes vendidos)
                            %s7-%s  Consultar a atração mais lucrativa (considere o período total)
                            %s8-%s  Consultar a atração menos lucrativa (considere o período total)
                            %s9-%s  Consultar a atração com melhor preço/tempo. Apresenta a atração que custa menos por segundo
                            %s10-%s Adicionar novo login
                            
                            """,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET);

            escolha = Tools.numValidation(0, 10);

            switch (escolha) {
                case 1:
                    // FALTA IMPLEMENTAR
                    break;

                case 2:
                    // IMPLEMENTAR?
                    break;
                case 3:
                    // IMPLEMENTAR?
                    break;
                case 4:
                    // FALTA IMPLEMENTAR
                    break;
                case 5:
                    // FALTA IMPLEMENTAR
                    break;
                case 6:
                    // FALTA IMPLEMENTAR
                    break;
                case 7:
                    // IMPLEMENTAR?
                    break;
                case 8:
                    // IMPLEMENTAR?
                    break;
                case 9:
                    // IMPLEMENTAR?
                    break;
                case 10:
                    // IMPLEMENTAR?
                    break;
                case 0:
                    System.out.println("\nQue tengas un buen día Administrador... 🔙");
                    break;
            }
        } while (escolha != 0);
    }
}
