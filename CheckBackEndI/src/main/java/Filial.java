public class Filial {

    private int id;
    private String nomeFilial;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private Boolean cincoEstrelas;

    public Filial(int id, String nomeFilial, String rua, String numero, String cidade, String estado, Boolean cincoEstrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
    }

    public Filial(String nomeFilial, String rua, String numero, String cidade, String estado, Boolean cincoEstrelas) {
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getCincoEstrelas() {
        return cincoEstrelas;
    }

    public void setCincoEstrelas(Boolean cincoEstrelas) {
        this.cincoEstrelas = cincoEstrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cincoEstrelas=" + cincoEstrelas +
                '}';
    }
}
