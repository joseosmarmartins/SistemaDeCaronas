import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Junior on 18/05/2016.
 */
public class Carona extends Entidade {

    private Pessoa pessoa;
    private Veiculo veiculo;
    private int vagas;
    private Date data;

    private List<AvaliacaoCarona> avaliacaoCaronaList = new ArrayList<>();
    private List<CaronaPonto> caronaPontoList = new ArrayList<>();

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

    public List<AvaliacaoCarona> getAvaliacaoCaronaList() {
        return avaliacaoCaronaList;
    }

    public void setAvaliacaoCaronaList(List<AvaliacaoCarona> avaliacaoCaronaList) {
        this.avaliacaoCaronaList = avaliacaoCaronaList;
    }

    public List<CaronaPonto> getCaronaPontoList() {
        return caronaPontoList;
    }

    public void setCaronaPontoList(List<CaronaPonto> caronaPontoList) {
        this.caronaPontoList = caronaPontoList;
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
