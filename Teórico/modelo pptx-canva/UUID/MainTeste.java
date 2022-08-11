package UUID;

import java.util.UUID;

public class MainTeste {

    /*
     * @UUID é um número de 128 bits, representado por 36 caractéres hexadecimas.
     * 
     * E`quase impossível existir outro igual no mundo, a chance é em centilhões de vezes.
     * 
     * Existem 5 versões do UUID, no momento que foi feito este código, a lib do java Util 
     * está usando a versão 4, que pode ser gerada por números aleatórios ou
     *  pseudo aleatório (semente)
     * 
     */

    public static void main(String[] args) {

        System.out.println("Este é o UUID gerado: \n"
                + UUID.randomUUID().toString());
    }

}
