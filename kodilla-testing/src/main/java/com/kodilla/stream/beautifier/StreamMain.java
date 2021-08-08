package com.kodilla.stream.beautifier;

public class StreamMain {


    public static void main(String args[]){

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemDecorator add_exclam = (s) -> s + "!";
        PoemDecorator add_ask = (s) -> s + "?";
        PoemDecorator toUpper = (s) -> s.toUpperCase();

        System.out.println( poemBeautifier.beautify("addBeau", add_exclam ));
        System.out.println( poemBeautifier.beautify( "addBeau", add_ask ));
        System.out.println( poemBeautifier.beautify( "addBeau", toUpper ));

    }



}
