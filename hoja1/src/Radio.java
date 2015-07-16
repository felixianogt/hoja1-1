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
    
    //se definen los metodos a implementarse en la interfaz principal
    //verifica si el radio esta encendido u apagado
    public void setESTADO(boolean Estado);
    
    //recibe el estado actual
    public boolean getEstado();                          
    
    //recibe a banda seleccionada
    public int getAMFM();
    
    //se instancia la banda deseada
    public void setAMFM(int banda);
    
    //sintonizara una emisora en especifica dentro de un rango de valores
    public void Sintonizar(boolean ud);
    
    //guardara la estacion deseada en memoria
    public void Guardar(int pos);
    
    //espacios disponibles para el almacenamiento de estaciones
    public void Memoria(int pos);
    
    //muestra la emisora sintonizada
    public double getEmisora();
    
}
