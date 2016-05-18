import java.util.Date;

/**
 * Created by Junior on 18/05/2016.
 */
public class Entidade {

    private int id;
    private Date dtCadasstro;
    private Date dtAlteracao;
    private Date dtExclusao;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDtCadasstro() {
        return dtCadasstro;
    }

    public void setDtCadasstro(Date dtCadasstro) {
        this.dtCadasstro = dtCadasstro;
    }

    public Date getDtAlteracao() {
        return dtAlteracao;
    }

    public void setDtAlteracao(Date dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
    }

    public Date getDtExclusao() {
        return dtExclusao;
    }

    public void setDtExclusao(Date dtExclusao) {
        this.dtExclusao = dtExclusao;
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "id=" + id +
                ", dtCadasstro=" + dtCadasstro +
                ", dtAlteracao=" + dtAlteracao +
                ", dtExclusao=" + dtExclusao +
                '}';
    }
}
