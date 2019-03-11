/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4btema2;

import java.util.ArrayList;


/**
 *
 * @author kauil
 */
public class ctrlNewton {
    
    private double x;
    
    private double iteraciones;
    
    private double error;

    public ctrlNewton (double x, double iteraciones, double error) {
        this.x = x;
        this.iteraciones = iteraciones;
        this.error = error;
    }
    
     
    
    private double getEvaluacion1(double x){
        
    
     return Math.pow(Math.E, -x) -x;

    }
    
    private double getEvaluacion2(double x){
        
        return -(Math.pow(Math.E, -x)) -1;
    }
   
    private boolean haySolucione(){
     boolean solucione=false;
     
     if(iteraciones > 0 )
         solucione=true;
     return solucione;
    
    }
    
    
    
   public ArrayList<IteracionNewton>  getNewton(){
    
        int i=1;
        double errorCalculado=1;
          double fxi1;
           double fxid1;
                
       
        
        ArrayList<IteracionNewton> lista = null;
        
         
       if( this.haySolucione() ){
            
            lista = new ArrayList<IteracionNewton>();
        
        
            while( i < this.iteraciones && errorCalculado >this.error ){
                
                fxi1= this.getEvaluacion1(this.x);
                 fxid1 = this.getEvaluacion2(this.x);
                
                
                IteracionNewton fila = new IteracionNewton();
           
                fila.setI(i);
                
                fila.setXi(this.x);
                
                fila.setFxi(fxi1);
                
                fila.setFxi1(fxid1);
                
                fila.setFxidiv(fila.getFxi()/fila.getFxi1());
                
                fila.setRaiz(fila.getXi()- fila.getFxidiv());
                
                if(i == 1){
                    errorCalculado = 1;
                }else{
                    
                    double xActual1 = fila.getXi();
                    
                    double xAnterior1 = fila.getRaiz();
                    
                    errorCalculado = Math.abs((xActual1-xAnterior1)/xActual1);

                }
                
                fila.setError(errorCalculado);
                
                System.out.println( fila.toString());
                
                lista.add(fila);
                
               if( fila.getXi()!= fila.getRaiz()){
               this.x= fila.getRaiz();
              }
 
                i++;
                
  
                
            }
        
        }
   
      return lista;
     }
        
    
   
   public TablaNewton getTablaNewton(){
       
       ArrayList<IteracionNewton> lista = this.getNewton();
       
       TablaNewton tabla = new TablaNewton(lista);
       
       return tabla;
   }
        
  
 
    
   
   
    
    
    
}
