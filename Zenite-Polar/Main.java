import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        // Scanner scanner = new Scanner(System.in);

        // /*
        //     Z-E-N-I-T
        //     P-O-L-A-R
        // */

        // String textoInserido = scanner.nextLine();
        // String textoCodificado = "";
        
        // for (int i = 0; i < textoInserido.length(); i++) {
        //     System.out.println(textoInserido.charAt(i) + " = " + i);
        //     if(textoInserido.charAt(i) == 'Z' || textoInserido.charAt(i) == 'z') {
        //         textoCodificado += 'p';
        //     } else if(textoInserido.charAt(i) == 'E' || textoInserido.charAt(i) == 'e') {
        //         textoCodificado += 'o';
        //     } else if(textoInserido.charAt(i) == 'N' || textoInserido.charAt(i) == 'n') {
        //         textoCodificado += 'l';
        //     } else if(textoInserido.charAt(i) == 'I' || textoInserido.charAt(i) == 'i') {
        //         textoCodificado += 'a';
        //     } else if(textoInserido.charAt(i) == 'T' || textoInserido.charAt(i) == 't') {
        //         textoCodificado += 'r';
        //     } else if (textoInserido.charAt(i) == 'P' || textoInserido.charAt(i) == 'p') {
        //         textoCodificado += 'z';
        //     } else if (textoInserido.charAt(i) == 'O' || textoInserido.charAt(i) == 'o') {
        //         textoCodificado += 'e';
        //     } else if (textoInserido.charAt(i) == 'L' || textoInserido.charAt(i) == 'l') {
        //         textoCodificado += 'n';
        //     } else if (textoInserido.charAt(i) == 'A' || textoInserido.charAt(i) == 'a') {
        //         textoCodificado += 'i';
        //     } else if (textoInserido.charAt(i) == 'R' || textoInserido.charAt(i) == 'r') {
        //         textoCodificado += 't';
        //     } else {
        //         textoCodificado += textoInserido.charAt(i);
        //     }
        // }

        // System.out.println("---");
        // System.out.println(textoInserido);
        // System.out.println(textoCodificado);

        // System.out.println("===");
        // System.out.println((int)'A');   //65   65 + 32 = 97 (32 casas da ASCII para maíusculo)
        // System.out.println(((int)'a')); //97

        //===================================

        Codificador codificador1 = new Codificador("ZENIT","POLAR");

        System.out.println(codificador1.getCharBase());
        System.out.println(codificador1.getCharCode());

        // codificador1.codificar("ZENIT");
        // System.out.println(codificador1.getTextoBase());



        // System.out.println(codificador1.getTextoCodificado());
        // System.out.println(codificador1.getTextoCodificado().equals("POLAR"));

        codificador1.codificar("OI PEDRO");
        System.out.println(codificador1.getTextoCodificado());

    }
}


/*
    String charBase = "ZENIT"
    String charCodi = "POLAR"
    String textoBase = "";
    String textoCodificado = "";

    verificar se possui mesmo length() = verificarTamanho(charBase, charCodi)
    
    codificar(charBase, charCodi, textoCodificado);
    decodificar(charBase, charCodi, textoCodificado);

*/


/*
    String texto1 = "Oi, eu sou o Domingos.";

    Codificador codificador1 = new Codificador("ZENIT","POLAR");

    codificador1.codificar(texto1);

    System.out.println(codificador1.getBase() == "ZENIT");
    System.out.println(codificador1.getCodi() == "POLAR");
    System.out.println(codificador1.getTextoBase("Oi, eu sou o Domingos"));
    System.out.println(codificador1.getTextoCodificado() == "Ea, ou seu e Demalges.");


*/

