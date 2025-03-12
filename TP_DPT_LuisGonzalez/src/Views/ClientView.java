package Views;

import Controllers.ClientController;
import Domain.Atracoes;
import Tools.Tools;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientView {
    ClientController clientController;

    public ClientView() throws FileNotFoundException {
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
                            
                            """,
                    Tools.color.GREEN, Tools.color.RESET,
                    Tools.color.GREEN, Tools.color.RESET);

            escolha = Tools.numValidation(0, 2);

            switch (escolha) {
                case 1:
                    this.atracoesDisponiveis();
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

    /**
     * Função para mostrar as atrações disponíveis no formato de tabela
     */
    public void atracoesDisponiveis() {
        System.out.println(Tools.color.YELLOW + "\n🎢 Atrações Disponíveis - Parque Temático CESAELand © 🎡\n" + Tools.color.RESET);
        System.out.printf(Tools.color.GREEN + "%-40s | %16s | %16s | %20s%n" + Tools.color.RESET, "ATRAÇÃO", "PREÇO ADULTO", "PREÇO CRIANÇA", "DURAÇÃO (min:seg)");

        ArrayList<Atracoes> atracoes = clientController.getAtracoes();

        for (Atracoes atracao : atracoes) {
            System.out.printf("%-40s | %15s€ | %15s€ | %20s%n",
                    atracao.getAtracao(),
                    atracao.getPrecoAdulto(),
                    atracao.getPrecoCrianca(),
                    clientController.segToMinSeg(atracao.getDuracaoSeg()));
        }
    }
}
