import java.util.Arrays;

public class Shopping {

    private String nomeShopping;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nomeShopping, Endereco endereco, int numeroLojas) {
        this.nomeShopping = nomeShopping;
        this.endereco = endereco;
        this.lojas = new Loja[numeroLojas];
    }

    public String getNomeShopping() {
        return nomeShopping;
    }

    public void setNomeShopping(String nomeShopping) {
        this.nomeShopping = nomeShopping;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    //métodos

    public boolean insereLoja(Loja l) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = l;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNomeLoja().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;

        for (int i = 0; i < lojas.length; i++) {
            if (tipoLoja.equalsIgnoreCase("Informática") || tipoLoja.equalsIgnoreCase("Informatica") && lojas[i] instanceof Informatica) {
                count++;
            } else if (tipoLoja.equalsIgnoreCase("Alimentacao") || tipoLoja.equalsIgnoreCase("Alimentaçao") && lojas[i] instanceof Alimentacao) {
                count++;
            } else if (tipoLoja.equalsIgnoreCase("Bijuteria") && lojas[i] instanceof Bijuteria) {
                count++;
            } else if (tipoLoja.equalsIgnoreCase("Cosmético") || tipoLoja.equalsIgnoreCase("Cosmetico") && lojas[i] instanceof Cosmetico) {
                count++;
            } else if (tipoLoja.equalsIgnoreCase("Vestuário") || tipoLoja.equalsIgnoreCase("Vestuario") && lojas[i] instanceof Vestuario) {
                count++;
            }
            /*
            Melhorias:
                usar toUpperCase...
                Importar método normalizer
                Transformar Strings em maiúsculas e remover acentos
             */
        }
        if (count == 0) {
            return -1;
        } else {
            return count;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = 0.0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) lojas[i]; //faz o downcasting para puxar seguroEletronicos!!
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos(); //substitui o maiorSeguro pelo novo maiorSeguro
                    lojaMaisCara = lojaInformatica;
                }

            }
        }
        return lojaMaisCara;
    }

    @Override
    public String toString() {
        return "Shopping: " +
                "\nNome do Shopping: " + nomeShopping + '\'' +
                "\nEndereço: " + endereco +
                "\nloja: " + Arrays.toString(lojas);
    }
}
