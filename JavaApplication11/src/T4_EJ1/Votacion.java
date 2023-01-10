/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T4_EJ1;

/**
 *
 * @author gargarju
 */
public class Votacion {
    
    private String nombre;
    private Integer votos;
    
    public Votacion(){
        
    }

    public Votacion(String nombre, Integer votos) {
        super();
        this.nombre = nombre;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Votacion{" + "nombre=" + nombre + ", votos=" + votos + '}';
    }
}
