public class Studente {

    private String nome;

    private String cognome;

    private int identificativo = 0;

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
    public int setIdentificativo(int identificativo){
        this.identificativo = identificativo;
        return identificativo;
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
