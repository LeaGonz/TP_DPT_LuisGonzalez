package Model;

import Domain.Custos;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CustosRepository {
    private ArrayList<Custos> custos;
    public CustosRepository() throws FileNotFoundException {
        this.custos = CSVReader.custosRepository("CSVs/Cesaeland_custos.csv");
    }
    public ArrayList<Custos> getCustos() {
        return this.custos;
    }
}
