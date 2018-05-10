package fapi.poo.geometria;

public class Circulo implements FormaGeometrica {
    public float raio;

    public float calcularArea() {
        return (float)(raio*raio*3.14);
    }

    public float calcularPerimetro() {
        return (float)(3.14*3.14*raio);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
