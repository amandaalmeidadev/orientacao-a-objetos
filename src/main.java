import java.util.HashMap;

public class main {

    public static void main(String[] args) {

       
        String[] palavras = {"java", "python", "java", "c", "python", "java"};

        
        HashMap<String, Integer> mapa = new HashMap<>();

        
        for (int i = 0; i < palavras.length; i++) {

            String palavra = palavras[i];

            int quantidade = mapa.getOrDefault(palavra, 0);

          
            mapa.put(palavra, quantidade + 1);
        }

        
        for (String chave : mapa.keySet()) {
            System.out.println(chave + " = " + mapa.get(chave));
        }
    }
}
