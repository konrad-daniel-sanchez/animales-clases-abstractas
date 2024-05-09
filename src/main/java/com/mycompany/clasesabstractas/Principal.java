package com.mycompany.clasesabstractas;


public class Principal {
    public static void main(String[] args) {
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
