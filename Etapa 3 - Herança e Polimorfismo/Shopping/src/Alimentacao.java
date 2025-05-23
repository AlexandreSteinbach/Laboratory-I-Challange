public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao (String nomeLoja, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao: " +
                "Data do alvará: " + dataAlvara;
    }
}
