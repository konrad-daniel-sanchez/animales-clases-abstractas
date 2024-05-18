package com.mycompany.clasesabstractas;


public class Principal {    
    /**
     * Primer método que es ejecutado por toda la aplicación.
     * @param args 
     * 
     * Complejidad Temporal: O(N) Tiempo constante
     * N = cantidad de animales en el array.
     */
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato = new Gato();
        
        Animal[] animales = new Animal[10];
        
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[4] = new Marrano();

        for(int i=0; i< animales.length;i++){
            if(animales[i] != null){
                String sonido = animales[i].hacerSonido();
                System.out.println("El animal en la posición " + i + " hace " + sonido);
            }
            else{
                System.out.println("No hay un animal en la posición " + i);
            }
        }
        
    }
}
