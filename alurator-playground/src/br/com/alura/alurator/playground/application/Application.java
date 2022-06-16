package br.com.alura.alurator.playground.application;

import br.com.alura.alurator.playground.controle.Controle;
import br.com.alura.alurator.playground.controle.SubControle;

import java.util.Objects;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // url /controle/1
        String url = "/controle/1";

        String[] urlReflection = url.replaceFirst("/", "").split("/");

        // first method
         Class<Controle> controleClass1 = Controle.class;;

        // second method
        Controle controle = new Controle();
        SubControle subControle = new SubControle();
        Class<? extends Controle> controleClass2 = controle.getClass();

        // third method
        Class<?> controleClass3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");

        Controle test1 = controleClass1.newInstance();
        Controle test2 = controleClass2.newInstance();
        Object test3 = controleClass3.newInstance();

        System.out.println(urlReflection[0]);
        System.out.println(test1 instanceof Controle);
//        System.out.println(test2 instanceof Controle);
//        System.out.println(test3 instanceof Controle);
    }
}
