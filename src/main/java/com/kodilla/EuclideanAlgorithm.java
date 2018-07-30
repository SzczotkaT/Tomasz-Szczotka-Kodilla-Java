package com.kodilla;

public class EuclideanAlgorithm {
    public static void main(String[] args){
        int figureA = 12642;
        int figureB = 594;

        while(figureA != figureB){
            if(figureA > figureB)
                figureA -= figureB;
            else
                figureB -= figureA;
        }
        System.out.println(figureA);
    }
}
