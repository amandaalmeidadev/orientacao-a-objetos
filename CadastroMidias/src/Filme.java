/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amand
 */
public class Filme {
    private String titulo;
    private String diretor;

    public Filme(String titulo, String diretor) {
        this.titulo = titulo;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Diretor: " + diretor;
    }
}