package com.aluracursos.radioazul.principal;

import com.aluracursos.radioazul.modelos.Cancion;
import com.aluracursos.radioazul.modelos.MisFavoritos;
import com.aluracursos.radioazul.modelos.Podcast;

public class Principal {
    public static void main(String[] args){

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Corazón");
        miCancion.setCantante("Los Auténticos Decadentes");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Lucho Mellera");
        miPodcast.setTitulo("Aislados");

        for(int i = 0; i < 3200;i++){
            miCancion.meGusta();
        }
        for(int i = 0; i < 5000; i++){
            miCancion.reproduce();
        }

        System.out.println("\nCancion: " + miCancion.getTitulo() + "\nGrupo/Cantante: " + miCancion.getCantante());
        System.out.println("Total de Reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gustas: " + miCancion.getTotalDeMeGusta());

        for(int i = 0; i < 1200;i++){
            miPodcast.meGusta();
        }
        for(int i = 0; i < 4300; i++){
            miPodcast.reproduce();
        }

        System.out.println("\nNombre del Podcast: " + miPodcast.getTitulo() + "\nPresentador: " + miPodcast.getPresentador());
        System.out.println("Total de Reproducciones: " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de Me Gustas: " + miPodcast.getTotalDeMeGusta());
        System.out.println("\n");
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiccione(miCancion);
        favoritos.adiccione(miPodcast);
    }
}
