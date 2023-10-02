package br.com.fag;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.fag.infra.ServicesHandle;
import br.com.fag.interfaces.IService;
import br.com.fag.services.ApostaService;
import br.com.fag.services.FileWriterService;
import br.com.fag.services.RandomGameService;
import br.com.fag.services.UserService;

public class Main {
    public static void main(String[] args) {
        List<IService> dependencias = Stream
        .of(new UserService(),
            new RandomGameService(),
            new ApostaService(),
            new FileWriterService())
        .collect(Collectors.toList());
        ServicesHandle services = new ServicesHandle(dependencias);
        services.run();
    }
}