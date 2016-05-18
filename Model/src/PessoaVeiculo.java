/**
 * Created by Junior on 18/05/2016.
 */
public class PessoaVeiculo extends Entidade {

    private Pessoa pessoa;
    private Veiculo veiculo;
    private String proprietario;

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

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "PessoaVeiculo{" +
                "pessoa=" + pessoa +
                ", veiculo=" + veiculo +
                ", proprietario='" + proprietario + '\'' +
                '}';
    }
}
