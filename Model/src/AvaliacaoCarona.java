/**
 * Created by José Osmar on 18/05/2016.
 */
public class AvaliacaoCarona extends Entidade {

    private Carona carona;
    private Pessoa caroneiro;
    private String nota;
    private String comentario;

    public Carona getCarona() {
        return carona;
    }

    public void setCarona(Carona carona) {
        this.carona = carona;
    }

    public Pessoa getCaroneiro() {
        return caroneiro;
    }

    public void setCaroneiro(Pessoa caroneiro) {
        this.caroneiro = caroneiro;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
