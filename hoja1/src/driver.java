/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosmartinez
 */
public class driver implements radio{
private int banda, pos, emisora=540;
private boolean Estado, ud;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Stack<Integer> miStack = new StackArrayList<Integer>();
         
         
    }

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
        
    
    }

    @Override
    public void guardar(int pos) {
       
    
    }

    @Override
    public void memoria(int pos) {
    
    
    }

    @Override
    public double getEmisora() {
    return emisora;   
    
    }
    
}
