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

public class CadastroMusica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Musica> listaDeMusicas = new ArrayList<>();

        while (true) {
            System.out.println("\n1 - Adicionar música");
            System.out.println("2 - Remover música");
            System.out.println("3 - Pesquisar música");
            System.out.println("4 - Listar todas as músicas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o título da música: ");
                String titulo = scanner.nextLine();
                System.out.print("Digite o nome do artista: ");
                String artista = scanner.nextLine();
                listaDeMusicas.add(new Musica(titulo, artista));
                System.out.println("Música adicionada com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Digite o título da música para remover: ");
                String titulo = scanner.nextLine();
                listaDeMusicas.removeIf(m -> m.getTitulo().equalsIgnoreCase(titulo));
                System.out.println("Se existia, a música foi removida.");
            } else if (opcao == 3) {
                System.out.print("Digite o título ou artista para buscar: ");
                String busca = scanner.nextLine();
                boolean encontrado = false;
                for (Musica m : listaDeMusicas) {
                    if (m.getTitulo().equalsIgnoreCase(busca) || m.getArtista().equalsIgnoreCase(busca)) {
                        System.out.println(m);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Nenhuma música encontrada.");
                }
            } else if (opcao == 4) {
                System.out.println("Lista de músicas:");
                for (Musica m : listaDeMusicas) {
                    System.out.println(m);
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
