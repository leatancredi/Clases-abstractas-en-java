package test;

import domain.*;

public class TestDeClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica();
        //aplicando polimorfismo
        FiguraGeometrica figura = new Rectangulo("rectangulo");
        figura.dibujar();
        
    }
}
