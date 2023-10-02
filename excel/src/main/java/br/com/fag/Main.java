package br.com.fag;

import java.util.List;

import br.com.fag.controllers.ApostaController;
import br.com.fag.domain.entities.Analisa;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.services.ApostaService;
import br.com.fag.services.RandomGame;
import br.com.fag.services.UserService;

public class Main {
    public static void main(String[] args) {
        Analisa analisa = new Analisa();
        Integer[] jogoUsuario = new UserService().start();
        Integer[] jogoAleatorio = RandomGame.start();
        List<Aposta> listaApostas = new ApostaService().start();
        ApostaController apostaController = new ApostaController(listaApostas).prepare();
        apostaController.handle();
        System.out.println(analisa.toString());
    }
}