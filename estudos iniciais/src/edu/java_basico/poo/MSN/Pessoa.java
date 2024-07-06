package edu.java_basico.poo.MSN;

import edu.java_basico.poo.MSN.apps.MSNMessenger;
import edu.java_basico.poo.MSN.apps.ServicoMensagemInstantanea;
import edu.java_basico.poo.MSN.apps.Telegram;

public class Pessoa {
    public static void main(String[] args) {
        //MSNMessenger pessoa1 = new MSNMessenger();
        //pessoa1.enviarMensagem();

        //ofertando 2 servicos: msn e telegram
        //nao sabe qual app usar, mas ambos sao p/ envio e recebimento de msgs
        ServicoMensagemInstantanea smi = null;
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("telegram")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }

}
