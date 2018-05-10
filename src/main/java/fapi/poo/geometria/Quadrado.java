package fapi.poo.geometria;

public class Quadrado implements FormaGeometrica {
    public float lado;

    public float calcularArea() {
        return (float)lado*lado;
    }

    public float calcularPerimetro() {
        return (float)lado*4;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
