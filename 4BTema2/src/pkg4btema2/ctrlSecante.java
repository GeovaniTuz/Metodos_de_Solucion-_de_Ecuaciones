
package pkg4btema2;

import java.util.ArrayList;

public class ctrlSecante {
    private int ite;
    private double X1,Xo,error;
    
    public ctrlSecante(double X1,int ite,double Xo,double error){
        this.X1 = X1;
        this.Xo = Xo;
        this.ite = ite;
        this.error = error;
    }
    
    private double getEvaluacion(double x){
        return Math.pow(x,2)-(3*x)-4;
        // la formula usada fue sacada del siguiente video https://www.youtube.com/watch?v=YOHtIzPmfzE
    }
    
   
    
    public ArrayList<IteracionSecante> getSecante(){
         int i=1;
       
        
        ArrayList<IteracionSecante> lista = null;
        
        
            
            lista = new ArrayList<IteracionSecante>();
            
          while(i < this.ite){
              double fx1 = this.getEvaluacion(this.X1);
              double fxo = this.getEvaluacion(this.Xo);
              
              IteracionSecante fila = new IteracionSecante();
              
              fila.setI(i);
              
              fila.setX1(this.X1);
              
              fila.setXo(this.Xo);
              
              
              fila.setFx1(fx1);

              fila.setFxo(fxo);
              
              fila.setX2(fila.getX1()-(fila.getFx1()*(fila.getXo()-fila.getX1()))/(fila.getFxo()-fila.getFx1()));
              fila.setError((fila.getX2()-fila.getX1())/fila.getX2());
                           
            
              System.out.println( fila.toString());
              
              lista.add(fila);
              
              if( fila.getX1()!= fila.getX2()){
               this.X1= fila.getX2();
               this.Xo = fila.getX1();
              }
              
             
             
              i++;
              
          }
          
        
        return lista;
        
    }
    
    
    
    public TablaSecante getTabla(){
     
        ArrayList<IteracionSecante> lista = this.getSecante();
     
        TablaSecante tabla= new TablaSecante(lista);
        
        return tabla;
    }
}