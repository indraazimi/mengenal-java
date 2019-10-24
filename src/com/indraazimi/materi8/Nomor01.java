package com.indraazimi.materi8;

/**
 * Bayangkan kita ingin mengacak sebuah nama secara random,
 * misalkan: Dira dkk ingin arisan, dan siapa yang menang?
 * Dengan ilmu yang kita miliki sekarang, codingnya begini.
 *
 * Bagaimana jika peserta arisannya bertambah jadi 10 orang?
 * Tentu coding ini akan menjadi sangat panjang dan ribet.
 */
public class Nomor01 {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 4) + 1;
        switch (random) {
            case 1:
                System.out.println("Dira");
                break;
            case 2:
                System.out.println("Irad");
                break;
            case 3:
                System.out.println("Radi");
                break;
            case 4:
                System.out.println("Arid");
                break;
        }
    }
}
