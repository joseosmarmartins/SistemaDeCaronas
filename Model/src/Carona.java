import java.util.Date;

/**
 * Created by Junior on 18/05/2016.
 */
public class Carona extends Entidade {

    private Pessoa pessoa;
    private Veiculo veiculo;
    private int vagas;
    private Date data;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Carona{" +
                "pessoa=" + pessoa +
                ", veiculo=" + veiculo +
                ", vagas=" + vagas +
                ", data=" + data +
                '}';
    }
}
