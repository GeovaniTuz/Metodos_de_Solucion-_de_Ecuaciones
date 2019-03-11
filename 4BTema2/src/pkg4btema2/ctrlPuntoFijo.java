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
public class ctrlPuntoFijo {
    
    private double x;
    
    private double iteraciones;
    
    private double error;

    public ctrlPuntoFijo (double x, double iteraciones, double error) {
        this.x = x;
        this.iteraciones = iteraciones;
        this.error = error;
    }
    
     
    
    private double getEvaluacion(double x){
        
    
     return Math.pow(Math.E, -x);

    }

     private boolean haySolucione(){
     boolean solucione=false;
     
     if(iteraciones > 0 )
         solucione=true;
     return solucione;
    
    }
    
    
    
   public ArrayList<IteracionPuntoFijo>  getPuntoFijo(){
    
        int i=1;
        double errorCalculado=1;
        double xc;
        
        ArrayList<IteracionPuntoFijo> lista = null;
        
         
       if( haySolucione() ){
            
            lista = new ArrayList<IteracionPuntoFijo>();
        
        
            while( i < this.iteraciones && errorCalculado >this.error ){
                
                IteracionPuntoFijo fila = new IteracionPuntoFijo();
                
                
                
                fila.setI(i);
                
                fila.setX(this.x);
                
                fila.setFxr(this.getEvaluacion(x));
                  
           

                
                if(i == 1){
                    errorCalculado = 1;
                }else{
                    
                    double xActual1 = fila.getFxr();
                    
                    double xAnterior1 = lista.get(lista.size()-1).getFxr();
                    
                    errorCalculado = Math.abs((xActual1-xAnterior1)/xActual1);
                }
                
                fila.setError(errorCalculado);
                
                System.out.println( fila.toString());
                
                lista.add(fila);
                
               this.x = this.getEvaluacion(x);
               
              
                
                i++;
                
  
                
            }
        
        }
   
      return lista;
     }
        
    
   
   public TablaPuntoFijo getTablap(){
       
       ArrayList<IteracionPuntoFijo> lista = this.getPuntoFijo();
       
       TablaPuntoFijo tabla = new TablaPuntoFijo(lista);
       
       return tabla;
   }
        
  
 
    
   
   
    
    
    
}
