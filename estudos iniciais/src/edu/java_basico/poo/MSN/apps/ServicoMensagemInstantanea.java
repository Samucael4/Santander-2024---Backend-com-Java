package edu.java_basico.poo.MSN.apps;

public abstract class ServicoMensagemInstantanea {
    // metodos publicos
    abstract public void enviarMensagem();

    abstract public void receberMensagem();

    // metodos privados
    private void validarConectadoInternet() {
        System.out.println("Validando conexao com a internet.");
    }

    private void salvarHistoriocoMensagem() {
        System.out.println("Salvando historico de mensagem.");
    }

    //metodos protegidos
    protected void validarConexao(){
        System.out.println("Verificando conexao com a internet");
    }
}
