import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class FilialServiceTest {

    private final FilialService filialService =  new FilialService(new FilialDaoH2(new ConfiguracaoJDBC()));

    @Test
    void cadastrar () throws SQLException {
        Filial filial = new Filial("Filial dos Amigos"," Rua 15","26","Arniqueiras","MG",true);
        Filial filial2 = new Filial("Filial da Neide","Rua 12","22","Manga Rosa","PB",false);
        Filial filial3 = new Filial("Filial dos Brothers", "Rua 33","32","Araquaia","MA",true);
        Filial filial4 = new Filial("Filial Quinta Avenida", "Rua 35","42","Quintalzinho","DF",false);
        Filial filial5 = new Filial("Filial Samba no Pé", "Rua 112","12","Biblioteca","SP",true);

        filialService.salvar(filial);
        filialService.salvar(filial2);
        filialService.salvar(filial3);
        filialService.salvar(filial4);
        filialService.salvar(filial5);

    }




}
