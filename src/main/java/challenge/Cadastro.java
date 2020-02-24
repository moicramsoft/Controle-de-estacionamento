package challenge;

public class Cadastro {

    public static void main(String[] args){
        //lista de inicializadores especifica o valor de cada elemento
	String[] nomesVetor = new String[] {"Maria","João","Pedro","Joaquim","Aparecida","Marcio","Elaine","Sabrina","Karine","Fabiana"};
	int [] idadeVetor = new int []{20,35,23,42,55,21,64,59,19,50};
        int[] pontosVetor= new int []{19,7,5,9,17,4,15,7,3,10};
        String [] habilitacaoVetor = new String [] {"A","AB","B","AB","B","A","A","AB","B","B"};
     String [] placaVetor= new String []{"JVO1234","AAA1234","NTB8215","NTB8215","NTB8215","NTB8215","NTB8215","NTB8215","NTB8215","NTB8215"};
        //instância um objeto da classe Random usando o construtor básico

           
        for(int i = 0; i < 10; i++) {
            
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
                        .withCor( Cor.BRANCO)
                        .build()
                
        );
        
 System.out.println(estacionamento.carrosEstacionados());
}}}