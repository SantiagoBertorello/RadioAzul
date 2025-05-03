package com.aluracursos.radioazul.principal;

import com.aluracursos.radioazul.modelos.Cancion;
import com.aluracursos.radioazul.modelos.Podcast;

public class Principal {
    public static void main(String[] args){

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Corazón");
        miCancion.setCantante("Los Auténticos Decadentes");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Lucho Mellera");
        miPodcast.setTitulo("Aislados");

        for(int i = 0; i < 100;i++){
            miCancion.meGusta();
        }
        for(int i = 0; i < 5000; i++){
            miCancion.reproduce();
        }

        System.out.println("Cancion: " + miCancion.getTitulo() + "\nGrupo/Cantante: " + miCancion.getCantante());
        System.out.println("Total de Reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gustas: " + miCancion.getTotalDeMeGusta());

        for(int i = 0; i < 200;i++){
            miPodcast.meGusta();
        }
        for(int i = 0; i < 3300; i++){
            miPodcast.reproduce();
        }

        System.out.println("Nombre del Podcast: " + miPodcast.getTitulo() + "\nPresentador: " + miPodcast.getPresentador());
        System.out.println("Total de Reproducciones: " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de Me Gustas: " + miPodcast.getTotalDeMeGusta());

    }
}
