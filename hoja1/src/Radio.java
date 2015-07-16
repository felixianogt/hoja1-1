/**
 * Carlos Martinez
 * Diego Contreras
 * Diego Felix
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diegofelix
 */
public interface Radio {
    
     public void setESTADO(boolean Estado);
    
    public boolean getEstado();                          
    
    public int getAMFM();
    
    public void setAMFM(int banda);
    
    public void Sintonizar(boolean ud);
    
    public void Guardar(int pos);
    
    public void Memoria(int pos);
    
    public double getEmisora();
    
}
