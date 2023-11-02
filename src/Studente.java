public class Studente {

    private String nome;
    private String cognome;
    private int identificativo;

    public Studente(String nome, String cognome, int identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String setCognome(String cognome) {
        this.cognome = cognome;
        return cognome;
    }
    public int getIdentificativo(){
        return identificativo;
    }
    public void setIdentificativo(int identificativo){
        this.identificativo = identificativo;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", identificativo=" + identificativo +
                '}';
    }
}
