package ex.pdm.havagas;

public class Formulario {

    private String nome;
    private String email;
    private boolean emailAtualizacao;
    private String telefone;
    private Enum<tpTelefone> tipoTelefone;
    private String celular;
    private Enum<Sexo> sexo;
    private String dtNascimento;
    private String anoFormatura;
    private String anoConclusao;
    private String instituicao;
    private String titulo;
    private String orientador;
    private String vagas;

    public Formulario() {}

    public Formulario(String nome, String email, boolean emailAtualizacao, String telefone, Enum<tpTelefone> tipoTelefone, String celular, Enum<Sexo> sexo, String dtNascimento, String anoFormatura, String anoConclusao, String instituicao, String titulo, String orientador, String vagas) {
        this.nome = nome;
        this.email = email;
        this.emailAtualizacao = emailAtualizacao;
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        this.celular = celular;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
        this.anoFormatura = anoFormatura;
        this.anoConclusao = anoConclusao;
        this.instituicao = instituicao;
        this.titulo = titulo;
        this.orientador = orientador;
        this.vagas = vagas;
    }

    public Formulario(String nome, String email, boolean emailAtualizacao, String telefone, Enum<tpTelefone> tipoTelefone, String celular, Enum<Sexo> sexo, String dtNascimento, null, null, null, null, null, String vagas) {
        this.nome = nome;
        this.email = email;
        this.emailAtualizacao = emailAtualizacao;
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        this.celular = celular;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
        this.anoFormatura = null;
        this.anoConclusao = null;
        this.instituicao = null;
        this.titulo = null;
        this.orientador = null;
        this.vagas = vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmailAtualizacao() {
        return emailAtualizacao;
    }

    public void setEmailAtualizacao(boolean emailAtualizacao) {
        this.emailAtualizacao = emailAtualizacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Enum<tpTelefone> getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(Enum<tpTelefone> tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Enum<Sexo> getSexo() {
        return sexo;
    }

    public void setSexo(Enum<Sexo> sexo) {
        this.sexo = sexo;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getAnoFormatura() {
        return anoFormatura;
    }

    public void setAnoFormatura(String anoFormatura) {
        this.anoFormatura = anoFormatura;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", emailAtualizacao=" + emailAtualizacao +
                ", telefone='" + telefone + '\'' +
                ", tipoTelefone=" + tipoTelefone +
                ", celular='" + celular + '\'' +
                ", sexo=" + sexo +
                ", dtNascimento='" + dtNascimento + '\'' +
                ", anoFormatura='" + anoFormatura + '\'' +
                ", anoConclusao='" + anoConclusao + '\'' +
                ", instituicao='" + instituicao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", orientador='" + orientador + '\'' +
                ", vagas='" + vagas + '\'' +
                '}';
    }
}