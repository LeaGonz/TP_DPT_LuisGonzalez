package Model;

import Domain.Login;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LoginRepository {
    private ArrayList<Login> logins;

    public LoginRepository() throws FileNotFoundException {
        this.logins = CSVReader.loginRepository("CSVs/Cesaeland_logins.csv");
    }

    public ArrayList<Login> getLogins() {
        return this.logins;
    }
}
