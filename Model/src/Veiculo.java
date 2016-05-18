/**
 * Created by Junior on 18/05/2016.
 */
public class Veiculo extends Entidade{

    private String modelo;
    private String ano;
    private String placa;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
