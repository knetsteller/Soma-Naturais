/**
 * Pequeno método que calcula a soma dos n inteiros fornecidos como argumento.
 */
package br.ufg.inf.es.construcao.somanaturais;

/**
 * @param n é o inteiro a cuja soma dos seus anteriores ate ele deve ser 
 * calculada
 */
public class SomaNaturais {
    public int calculaSomaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O numero deve ser maior ou igual 1");
        }
        
        int i = 2;
        int s = 1;
        
        while (i <= n) {
            s += i;
            i += 1;
        }
        
        return s;
    }
}
