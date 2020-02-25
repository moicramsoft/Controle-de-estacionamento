/*Codigo que serviu como exemplo
https://www.codenation.dev/code-review/#/java-7/-NBZofwZR by Jorge da Silva Guimarães
*/
package challenge;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Cadastro {

    public static void main(String[] args) {
        /*lista de inicializadores especifica o valor de cada elemento
        
        Da Forma seguinte levamos vetor com valores populados enviando repetição de código*/
        String[] nomesVetor = new String[]{"Maria", "João", "Pedro", "Joaquim", "Aparecida", "Marcio", "Elaine", "Sabrina", "Karine", "Fabiana"};
        int[] idadeVetor = new int[]{20, 35, 23, 42, 55, 21, 64, 59, 19, 50};
        int[] pontosVetor = new int[]{19, 7, 5, 9, 17, 4, 15, 7, 3, 10};
        String[] habilitacaoVetor = new String[]{"A", "AB", "B", "AB", "B", "A", "A", "AB", "B", "B"};
        String[] placaVetor = new String[]{"JVO1234", "AAA1234", "NTB8215", "NTB8215", "NTB8215", "NTB8215", "NTB8215", "NTB8215", "NTB8215", "NTB8215"};
        //Instanciamos um arraylist para capturar os calores de enem
        List<Cor> list = new ArrayList<>(EnumSet.allOf(Cor.class));
        /* passamos o valor de list para a arraylist listCor de cada carro
        Obs: Acredito que seria possivel um random no add sentando o get entre 0 e 2*/
        List<Cor> listaCor = new ArrayList<>(9);
        listaCor.add(list.get(0));
        listaCor.add(list.get(2));
        listaCor.add(list.get(1));
        listaCor.add(list.get(0));
        listaCor.add(list.get(2));
        listaCor.add(list.get(1));
        listaCor.add(list.get(0));
        listaCor.add(list.get(2));
        listaCor.add(list.get(1));
        listaCor.add(list.get(2));
        //Laço para popular informações que estão vindo dos vetores e arraylist
        for (int i = 0; i < 10; i++) {

            Estacionamento estacionamento = new Estacionamento();
            estacionamento.estacionar(
                    Carro.builder()
                            .withMotorista(
                                    Motorista
                                            .builder()
                                            .withNome(nomesVetor[i])
                                            .withIdade(idadeVetor[i])
                                            .withPontos(pontosVetor[i])
                                            .withHabilitacao(habilitacaoVetor[i])
                                            .build())
                            .withPlaca(placaVetor[i])
                            .withCor(listaCor.get(i))
                            .build()
            );

            System.out.println(estacionamento.carrosEstacionados());
        }
    }
}
