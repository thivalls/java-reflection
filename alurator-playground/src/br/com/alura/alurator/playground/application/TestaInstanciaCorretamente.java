package br.com.alura.alurator.playground.application;

import br.com.alura.alurator.playground.controle.SubControle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestaInstanciaCorretamente {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SubControle> subControleClass = SubControle.class;

        // System.out.println(subControleClass.getClass().getSimpleName());

        Constructor<SubControle> constructor = subControleClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        // System.out.println(constructor.getClass().getSimpleName());

        SubControle subControle = constructor.newInstance();
        System.out.println(subControle);
    }
}
