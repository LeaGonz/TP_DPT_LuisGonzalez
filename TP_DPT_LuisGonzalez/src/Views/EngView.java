package Views;

import Controllers.EngController;
import Tools.Tools;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EngView {
    EngController engController;

    public EngView() {
        this.engController = new EngController();
    }

    public void engMenu() throws FileNotFoundException {
//        Scanner input = new Scanner(System.in);

        int escolha;
        do {
            System.out.printf(Tools.color.YELLOW + """
                            
                            🎢 Menu Engenheiro de Manutenção - Parque Temático CESAELand © 🎡
                            
                            %s1-%s Consultar Próximas Revisões
                            %s2-%s Consultar Histórico de Revisões
                            
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
                    System.out.println("\nTe vas directo al menu anterior Sr. Ingeniero... 🔙");
                    break;
            }
        } while (escolha != 0);
    }
}
