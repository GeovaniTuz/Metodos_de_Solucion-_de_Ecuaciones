
package pkg4btema2;

public class IteracionSecante {
    
    private int i;
    private double x1;
    private double xo;
    private double fx1;
    private double fxo;
    private double x2;
    private double error;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getXo() {
        return xo;
    }

    public void setXo(double xo) {
        this.xo = xo;
    }

    public double getFx1() {
        return fx1;
    }

    public void setFx1(double fx1) {
        this.fx1 = fx1;
    }

    public double getFxo() {
        return fxo;
    }

    public void setFxo(double fxo) {
        this.fxo = fxo;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "IteracionSecante{" + "i=" + i + ", x1=" + x1 + ", xo=" + xo + ", fx1=" + fx1 + ", fxo=" + fxo + ", x2=" + x2 + ", error=" + error + '}';
    }
   
    


}