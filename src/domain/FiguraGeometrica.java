package domain;

public abstract class FiguraGeometrica {
//    una clase abstracta tiene almenos un metodo abstracto.
    protected String tipoFigura;
    
    //hacemos el constructor de la clase
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    //los metodos abstractos se cierran con punto y coma.
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
        
    
}
