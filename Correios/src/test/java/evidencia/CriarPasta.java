package evidencia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class CriarPasta {
    public String pasta = ("C:\\Users\\Sempre IT\\OneDrive\\Área de Trabalho\\Estudo-Automação\\Testes-usando-Page-Object\\Correios\\src\\main\\resources\\prints");

    public void CriarPasta() {

    }

    public void criarPasta(String caso) throws IOException {

        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String data = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(ts);
        this.pasta = (Files.createDirectory(Paths.get(this.pasta + caso + "_" + data))).toString();

    }

    public String getPasta() {
        return this.pasta;
    }
}
