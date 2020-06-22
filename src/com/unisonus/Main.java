package com.unisonus;

import com.unisonus.stringsimilarity.Cosine;

public class Main {

    public static void main(String[] args) {
        Cosine c = new Cosine();
        System.out.printf("%.1f%%\n", c.getSimilatiry("GRUPA CSV", "GRUPA CSV SP Z O.O."));
    }
}