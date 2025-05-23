public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nomeLoja, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,
                     boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Vestuario: " +
                "Produtos importados: " + produtosImportados;
    }
}
