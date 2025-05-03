package com.aluracursos.radioazul.modelos;

public class MisFavoritos {

    public void adiccione(Audio audio){
        if(audio.getClasificacion() >= 8 ){
            System.out.println(audio.getTitulo() + ". Es uno de los Favoritos  del Momento") ;
        }else if(audio.getClasificacion() >= 5){
            System.out.println(audio.getTitulo() + ". Es uno de los Recomendados");
        }else{
            System.out.println(audio.getTitulo() + ". Tal vez te pueda interesar!");
        }
    }
}

