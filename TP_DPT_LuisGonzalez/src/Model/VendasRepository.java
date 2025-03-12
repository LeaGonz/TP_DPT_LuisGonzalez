package Model;

import Domain.Vendas;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasRepository {
    private ArrayList<Vendas> vendas;

    public VendasRepository() throws FileNotFoundException {
        this.vendas = CSVReader.vendasRepository("CSVs/Cesaeland_vendas.csv");
    }

    public ArrayList<Vendas> getVendas() {
        return this.vendas;
    }
}
