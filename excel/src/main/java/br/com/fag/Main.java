package br.com.fag;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.fag.domain.entities.Resultado;
import br.com.fag.infra.ServicesHandle;
import br.com.fag.interfaces.IService;
import br.com.fag.services.ApostaService;
import br.com.fag.services.RandomGame;
import br.com.fag.services.UserService;

public class Main {
    public static void main(String[] args) {
        Resultado analisa = new Resultado();
        List<IService> dependencias = Stream
        .of(new UserService(),
            new RandomGame(),
            new ApostaService())
        .collect(Collectors.toList());
        ServicesHandle services = new ServicesHandle(dependencias);
        services.run();
        System.out.println(analisa.toString());
    }
}