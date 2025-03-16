package Model;

import Domain.Login;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LoginRepository {
    private static LoginRepository instance;

    private ArrayList<Login> logins;

    private LoginRepository() throws FileNotFoundException {
        this.logins = CSVReader.loginRepository("CSVs/Cesaeland_logins.csv");
    }

    /**
     * Singleton para evitar carregar várias vezes os dados do CSV logins
     * @return Única instância do repositório
     */
    public static LoginRepository getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new LoginRepository();
        }
        return instance;
    }

    public ArrayList<Login> getLogins() {
        return this.logins;
    }
}
