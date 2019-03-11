package pkg4btema2;

import java.util.ArrayList;

public class ctrlBiseccion {

    private double xi;

    private double xs;

    private double iteraciones;

    private double error;

    public ctrlBiseccion(double xi, double xs, double iteraciones, double error) {
        this.xi = xi;
        this.xs = xs;
        this.iteraciones = iteraciones;
        this.error = error;
    }

    private double getEvaluacion(double x) {
        return Math.pow(x, 3) + 4 * Math.pow(x, 2) - 10;
    }

    private boolean haySolucion() {
        boolean solucion = false;

        if (this.getEvaluacion(this.xi) * this.getEvaluacion(this.xs) < 0) {
            solucion = true;
        }
        return solucion;

    }

    public ArrayList<IteracionBiseccion> getBiseccion() {

        int i = 1;
        double errorCalculado = 1;

        ArrayList<IteracionBiseccion> lista = null;

        if (this.haySolucion()) {

            lista = new ArrayList<IteracionBiseccion>();

            while (i < this.iteraciones && errorCalculado > this.error) {

                double xr = (this.xi + this.xs) / 2;

                IteracionBiseccion fila = new IteracionBiseccion();

                fila.setI(i);

                fila.setXi(this.xi);

                fila.setXs(this.xs);

                fila.setXr(xr);

                fila.setFxi(this.getEvaluacion(fila.getXi()));

                fila.setFxs(this.getEvaluacion(fila.getXs()));

                fila.setFxr(this.getEvaluacion(fila.getXr()));

                if (i == 1) {
                    errorCalculado = 1;
                } else {

                    double xActual = fila.getXr();

                    double xAnterior = lista.get(lista.size() - 1).getXr();

                    errorCalculado = Math.abs((xActual - xAnterior) / xActual);

                }

                fila.setError(errorCalculado);

                System.out.println(fila.toString());

                lista.add(fila);

                if (fila.getFxi() * fila.getFxr() < 0) {
                    this.xs = xr;
                } else {
                    this.xi = xr;
                }
                i++;

            }
        }
        return lista;

    }

    public TablaBiseccion getTabla() {

        ArrayList<IteracionBiseccion> lista = this.getBiseccion();

        TablaBiseccion tabla = new TablaBiseccion(lista);

        return tabla;
    }

}
