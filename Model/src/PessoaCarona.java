/**
 * Created by Junior on 18/05/2016.
 */
public class PessoaCarona extends Entidade {

    private Pessoa pessoa;
    private Carona carona;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Carona getCarona() {
        return carona;
    }

    public void setCarona(Carona carona) {
        this.carona = carona;
    }

    @Override
    public String toString() {
        return "PessoaCarona{" +
                "pessoa=" + pessoa +
                ", carona=" + carona +
                '}';
    }
}
