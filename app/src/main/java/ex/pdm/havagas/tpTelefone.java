package ex.pdm.havagas;

public enum tpTelefone {

    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial");

    private String tipo;

    tpTelefone(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
