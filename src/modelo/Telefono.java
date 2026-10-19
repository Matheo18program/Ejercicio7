package modelo;

public class Telefono {
    private String referencia;
    private double costo;
    private String marca;
    private String modelo;

    public Telefono(String referencia, double costo, String marca, String modelo) {
        this.referencia = referencia;
        this.costo = costo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}