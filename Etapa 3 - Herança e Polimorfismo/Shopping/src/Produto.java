public class Produto {

    private String nomeProduto;
    private double preco;
    private Data dataValidade;

    public Produto(String nomeProduto, double preco, Data dataValidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataRecebida) {
        if (dataRecebida.getAno() > dataValidade.getAno()) {
            return true; //se o ano for menor que o da data de validade, retorne true

        } else if (dataRecebida.getAno() == dataValidade.getAno()) {
            if (dataRecebida.getMes() >= dataValidade.getMes()) {
                return true; // se o ano for igual, e o mês menor, retorne true

            } else if (dataRecebida.getMes() == dataValidade.getMes()) {
                if (dataRecebida.getDia() >= dataValidade.getDia())
                    return true; // se o ano e mês forem iguais, e o dia menor ou igual, retorne true
            }
        }
        return false; // se não, retorne falso
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNome(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "\nNome do produto: " + nomeProduto +
                "\nPreço do produto: " + preco +
                "\nData de validade: " + dataValidade;
    }
}
