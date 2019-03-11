
package pkg4btema2;


public class IteracionNewton {
    
    private int i;
    
    private double xi;
    
    private double fxi;
    
    private double fxi1;
    
    private double fxidiv;
    
    private double raiz;
 
    private double error;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxi1() {
        return fxi1;
    }

    public void setFxi1(double fxi1) {
        this.fxi1 = fxi1;
    }

    public double getFxidiv() {
        return fxidiv;
    }

    public void setFxidiv(double fxidiv) {
        this.fxidiv = fxidiv;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "IteracionNewton{" + "i=" + i + ", xi=" + xi + ", fxi=" + fxi + ", fxi1=" + fxi1 + ", fxidiv=" + fxidiv + ", raiz=" + raiz + ", error=" + error + '}';
    }
    
 
    
}
