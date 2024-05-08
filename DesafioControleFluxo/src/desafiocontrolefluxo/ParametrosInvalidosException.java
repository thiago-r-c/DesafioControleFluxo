package desafiocontrolefluxo;
public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro."); // Gera a mensagem a partir do procedimento de exessão atraves do construtor
    }
}
