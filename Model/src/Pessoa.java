import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa extends Entidade{

    private String nome;
    private String cpf;
    private String sobrenome;
    private Date dtNasc;
    private String senha;
    private String usuario;
    private String cidade;
    private String uf;
    private String motorista;

    private List<AvaliacaoCaroneiro> avaliacaoCaroneiroList = new ArrayList<>();
    private List<PessoaCarona> pessoaCaronaList = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public List<AvaliacaoCaroneiro> getAvaliacaoCaroneiroList() {
        return avaliacaoCaroneiroList;
    }

    public void setAvaliacaoCaroneiroList(List<AvaliacaoCaroneiro> avaliacaoCaroneiroList) {
        this.avaliacaoCaroneiroList = avaliacaoCaroneiroList;
    }

    public List<PessoaCarona> getPessoaCaronaList() {
        return pessoaCaronaList;
    }

    public void setPessoaCaronaList(List<PessoaCarona> pessoaCaronaList) {
        this.pessoaCaronaList = pessoaCaronaList;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dtNasc=" + dtNasc +
                ", senha='" + senha + '\'' +
                ", usuario='" + usuario + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", motorista='" + motorista + '\'' +
                '}';
    }
}
