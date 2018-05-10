package fapi.poo.operacoes;

public class Divicao implements Operacao {
    public float executar(float n1, float n2) {
        if(n2 != 0)return n1/n2;
        else return 0;
    }
}
