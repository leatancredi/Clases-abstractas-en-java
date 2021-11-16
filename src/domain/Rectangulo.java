package domain;

public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }

    
    //no sobre escribimos implementamos el metodo 
    // cuando se implementa no marcamos abst
    @Override
    public void dibujar(){
        //estamos implementado el metodo de la clase padre, por eso el icono de la izquieda
        System.out.println("se imprime el : " + this.getClass().getSimpleName());
    }
    
}
