public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Alterada para valor padrão: 1/1/2020");
            this.dia = 1;
            this.mes = 1;
            this. ano = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public boolean validaData(int dia, int mes, int ano) {
        if (dia < 1 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        }
        if (mes == 2) {
            if (dia == 29 && verificaAnoBissexto() != true) {
                return false;
            } if (dia > 29) {
                return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        } else {
            if (dia > 31) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Data: " +
                "\nDia: " + dia +
                "\nMes: " + mes +
                "\nAno: " + ano;
    }
}
