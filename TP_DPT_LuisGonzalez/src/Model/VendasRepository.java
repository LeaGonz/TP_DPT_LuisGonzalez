package Model;

import Domain.Vendas;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasRepository {
    private static VendasRepository instance;

    private ArrayList<Vendas> vendas;

    private VendasRepository() throws FileNotFoundException {
        this.vendas = CSVReader.vendasRepository("CSVs/Cesaeland_vendas.csv");
    }

    /**
     * Singleton para evitar carregar várias vezes os dados do CSV vendas
     * @return Única instância do repositório
     */
    public static VendasRepository getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new VendasRepository();
        }
        return instance;
    }

    /**
     * Função para devolver toda a informação do CSV
     * @return Lista de Vendas
     */
    public ArrayList<Vendas> getVendas() {
        return this.vendas;
    }

}
