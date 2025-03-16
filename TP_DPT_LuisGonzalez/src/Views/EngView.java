package Views;

import Controllers.EngController;
import Tools.Tools;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class EngView {
    EngController engController;

    public EngView() throws FileNotFoundException {
        this.engController = new EngController();
    }

    public void engMenu() throws InterruptedException {
        int escolha;
        do {
            System.out.printf(Tools.color.YELLOW + """
                            
                            🎢 Menu Engenheiro de Manutenção - Parque Temático CESAELand © 🛠️
                            
                            %s1-%s Consultar Próximas Revisões
                            %s2-%s Consultar Histórico de Revisões
                            
                            """, Tools.color.GREEN, Tools.color.YELLOW,
                    Tools.color.GREEN, Tools.color.RESET);

            escolha = Tools.numValidation(0, 2);

            switch (escolha) {
                case 1:
                    consultaRevisoes();
                    break;

                case 2:
                    System.out.println("\nAqui deveria estar o Histórico de Revisões, mas não estão... 🤖");
                    sleep(300);
                    break;

                case 0:
                    System.out.println("\nTe vas directo al menu anterior Sr. Ingeniero... 🔙");
                    sleep(300);
                    break;
            }
        } while (escolha != 0);
    }

    /**
     * Função para mostrar as próximas 3 revisões e bilehetes faltantes
     */
    private void consultaRevisoes() throws InterruptedException {
        System.out.println(Tools.color.YELLOW + "\n🎢 Próximas 3 Revisões - Parque Temático CESAELand © 🎡\n" + Tools.color.RESET);

        System.out.printf(Tools.color.GREEN + "%-5s | %-35s | %s%n" + Tools.color.RESET, "ID", "ATRAÇÃO", "BILHETES FALTANTES PRÓX REVISÃO");

        ArrayList<ArrayList<String>> revisoes = engController.proximasRevisoes();

        for (int i = 0; i < 3 && i < revisoes.size(); i++) {
            System.out.printf("%-5s | %-35s | %s%n",
                    revisoes.get(i).get(0),
                    revisoes.get(i).get(1),
                    revisoes.get(i).get(2));
            sleep(200);
        }
    }
}
