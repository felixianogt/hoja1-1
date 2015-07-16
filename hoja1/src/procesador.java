/**
 * Carlos Martinez
 * Diego Contreras
 * Diego Felix
 */
 
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
public class procesador implements Radio{
private int banda=0, pos;
private double emisoraAM=530;
private double emisoraFM=87.9;
private boolean Estado, ud;
private double []memory=new double[12];
    

@Override
    public void setESTADO(boolean Estado) { 
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
    public void Sintonizar(boolean ud) {
    if (ud==false){
        
        if(banda==0){
        emisoraAM=emisoraAM-10;
        if(emisoraAM<530){
            emisoraAM=1610;
        }
        System.out.println(emisoraAM);
        }
        else{
        emisoraFM=emisoraFM-0.2;
        if(emisoraFM<87.9){
            emisoraFM=107.9;
        }
        System.out.println(emisoraFM);
        }
        }
    else if (ud==true){
       if(banda==0){
        emisoraAM=emisoraAM+10;
        if(emisoraAM>1610){
            emisoraAM=530;
        }
        System.out.println(emisoraAM);
        }
        else{
        emisoraFM=emisoraFM+0.2;
        if(emisoraFM>107.9){
            emisoraFM=87.9;
        }
        System.out.println(emisoraFM);
        }
        
        }
    }
    
    

@Override
    
    public void Guardar(int pos) {
        if(pos<=1 && pos>=12){
            System.out.println("El numero ingresado se encuentra fuera del rango o existencia de botones memoria del radio   ");
        }
        else{
            pos--;
            if(banda==0){
                memory[pos]=emisoraAM;
            }else{
                memory[pos]=emisoraFM;
            }
        }
    }

@Override
    public void Memoria(int pos) {
        if(pos<=1 && pos>=12){
            System.out.println("El numero ingresado se encuentra fuera del rango o existencia de botones memoria del radio   ");
        }else{
            pos--;
            System.out.println(memory[pos]);
        }
    
    }

@Override
    public double getEmisora() {
        if(banda==0){
            return emisoraAM;
        }else{
            return emisoraFM;
        }
     
    
    }
    
    
}
