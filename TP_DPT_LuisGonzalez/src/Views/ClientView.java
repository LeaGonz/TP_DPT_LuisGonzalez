package Views;

import Controllers.ClientController;
import Tools.Tools;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientView {
    ClientController clientController;

    public ClientView() {
        this.clientController = new ClientController();
    }

    public void clientMenu() throws FileNotFoundException {
        //Scanner input = new Scanner(System.in);

        int escolha;
        do {
            System.out.printf(Tools.color.YELLOW + """
                            
                            🎢 Menu Cliente - Parque Temático CESAELand © 🎡
                            
                            %s1-%s Consultar Atrações Disponíveis
                            %s2-%s Consultar Atrações Favoritas
                            
                            """, Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET);

            escolha = Tools.numValidation(0, 2);

            switch (escolha) {
                case 1:
                    // FALTA IMPLEMENTAR
                    break;

                case 2:
                    // IMPLEMENTAR?
                    break;

                case 0:
                    System.out.println("\nTe vas directo al menu anterior compadre... 🔙");
                    break;
            }
        } while (escolha != 0);
    }
}
