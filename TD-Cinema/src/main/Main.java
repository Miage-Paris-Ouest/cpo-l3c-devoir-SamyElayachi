package main;

import modele.SalleCinema;


public class Main {

    public static void main(String[] args) {
        SalleCinema s=new SalleCinema("Java",100,7.5);
        s.vendrePlace();
        s.vendrePlace();
        s.vendrePlace();
        System.out.println(s);
    }
}
