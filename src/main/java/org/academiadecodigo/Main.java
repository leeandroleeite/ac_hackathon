package org.academiadecodigo;

public class Main {

    public static void main(String[] args) {
        String pass = "arroz12<feijão";

        System.out.println(pass.hashCode());

        System.out.println(pass.hashCode() == "arroz12<feijao".hashCode());

    }
}
