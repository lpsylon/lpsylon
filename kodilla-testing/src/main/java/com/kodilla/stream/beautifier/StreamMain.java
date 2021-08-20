package com.kodilla.stream.beautifier;

public class StreamMain {


<<<<<<< HEAD
    public static void main(String[] args){
=======
    public static void main(String args[]){
>>>>>>> 60f74a3eb4a187ed05063707b78f2b99d6fd3518

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        PoemDecorator add_exclam = (s) -> s + "!";
        PoemDecorator add_ask = (s) -> s + "?";
<<<<<<< HEAD
        PoemDecorator toUpper = String::toUpperCase;
=======
        PoemDecorator toUpper = (s) -> s.toUpperCase();
>>>>>>> 60f74a3eb4a187ed05063707b78f2b99d6fd3518

        System.out.println( poemBeautifier.beautify("addBeau", add_exclam ));
        System.out.println( poemBeautifier.beautify( "addBeau", add_ask ));
        System.out.println( poemBeautifier.beautify( "addBeau", toUpper ));

    }
<<<<<<< HEAD
}
=======



}
>>>>>>> 60f74a3eb4a187ed05063707b78f2b99d6fd3518
