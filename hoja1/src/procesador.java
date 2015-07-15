
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosmartinez
 */
public class procesador implements radio{
private int banda=0, pos;
private double emisora=530;
private boolean Estado, ud;
    

@Override
    public void setEstado(boolean Estado) { 
    this.Estado=Estado;
    }

@Override
    public boolean getEstado() { 
    return Estado;
    }

@Override
    public int getAMFM() {
    return banda;  
    
    }

@Override
    public void setAMFM(int banda) {
    this.banda=banda;
    
    }

@Override
    public void sintonizar(boolean ud) {
    if (ud==false){
        
        if(emisora<=1610){
        emisora=emisora+10;
        System.out.println(emisora);
        }
        else{
        emisora=530;
        System.out.println(emisora);
        
        }
        }
    else if (ud==true){
        emisora=87.9;
       System.out.println(emisora);
        if(emisora<=107.9){
        emisora=emisora+0.2;
        System.out.println(emisora);
        
        }
        else{
        emisora=87.9;
        System.out.println(emisora);
        
        }
    }
    
    }

@Override
    
    public void guardar(int pos) {
        if(pos<=0 && pos>=11){
            System.out.println("El nuemro ingresado se encuentra fuera del rango o existencia de botones memoria del radio   ");
        }
        else{
            
        }
    }

@Override
    public void memoria(int pos) {
        
    
    }

@Override
    public double getEmisora() {
    return emisora;   
    
    }
    
    
}
