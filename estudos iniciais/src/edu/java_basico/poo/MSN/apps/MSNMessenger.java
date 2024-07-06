package edu.java_basico.poo.MSN.apps;

//import edu.java_basico.poo.MSN.apps.ServicoMensagemInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo msn");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo menssagem por msn");
    }


    
}
