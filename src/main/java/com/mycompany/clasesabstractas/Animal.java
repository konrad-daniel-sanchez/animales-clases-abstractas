package com.mycompany.clasesabstractas;

public abstract class Animal {
    /**
     * 
     * @return String
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public String comer(){
        return "Estoy comiendo";
    }
    
    public abstract String hacerSonido();
}
