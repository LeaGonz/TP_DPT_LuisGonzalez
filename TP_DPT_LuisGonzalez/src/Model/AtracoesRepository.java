package Model;

import Domain.Atracoes;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AtracoesRepository {
    private ArrayList<Atracoes> atracoes;

    public AtracoesRepository() throws FileNotFoundException {
        this.atracoes = CSVReader.atracoesRepository("CSVs/Cesaeland_atracoes.csv");
    }

    public ArrayList<Atracoes> getAtracoes() {
        return this.atracoes;
    }
}
