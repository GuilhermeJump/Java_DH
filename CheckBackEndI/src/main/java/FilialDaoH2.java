import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class FilialDaoH2 implements IDao<Filial> {

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger logger = Logger.getLogger(String.valueOf(FilialDaoH2.class));

    public FilialDaoH2(ConfiguracaoJDBC configJDBC) {
        this.configuracaoJDBC = configJDBC;
    }


    @Override
    public Filial salvar(Filial filial) throws SQLException {
        logger.info("Cadastrando uma nova "+filial);
        Connection connection = null;
        Statement statement;

        String sqlInsert = String.format("INSERT INTO FILIAL (NOME_FILIAL, RUA, NUMERO, CIDADE, ESTADO, CINCO_ESTRELA) " +
                        "VALUES ('%s','%s','%s','%s','%s','%s')",
                filial.getNomeFilial(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.getCincoEstrelas());

        try {
            connection = configuracaoJDBC.getConnection();

            statement = connection.createStatement();
            statement.executeUpdate(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if(keys.next()){
                filial.setId(keys.getInt(1));
                statement.close();
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
            connection.rollback();
        }

        return filial;
    }
}
