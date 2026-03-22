/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amand
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFilmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Filme> listaDeFilmes = new ArrayList<>();

        while (true) {
            System.out.println("\n1 - Adicionar filme");
            System.out.println("2 - Remover filme");
            System.out.println("3 - Pesquisar filme");
            System.out.println("4 - Listar todos os filmes");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o título do filme: ");
                String titulo = scanner.nextLine();
                System.out.print("Digite o nome do diretor: ");
                String diretor = scanner.nextLine();
                listaDeFilmes.add(new Filme(titulo, diretor));
                System.out.println("Filme adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Digite o título do filme para remover: ");
                String titulo = scanner.nextLine();
                listaDeFilmes.removeIf(f -> f.getTitulo().equalsIgnoreCase(titulo));
                System.out.println("Se existia, o filme foi removido.");
            } else if (opcao == 3) {
                System.out.print("Digite o título ou diretor para buscar: ");
                String busca = scanner.nextLine();
                boolean encontrado = false;
                for (Filme f : listaDeFilmes) {
                    if (f.getTitulo().equalsIgnoreCase(busca) || f.getDiretor().equalsIgnoreCase(busca)) {
                        System.out.println(f);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Nenhum filme encontrado.");
                }
            } else if (opcao == 4) {
                System.out.println("Lista de filmes:");
                for (Filme f : listaDeFilmes) {
                    System.out.println(f);
                }
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
