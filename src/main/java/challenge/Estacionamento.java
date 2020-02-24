package challenge;

import java.util.*;

public class Estacionamento {

    List<Carro> estacionamento = new ArrayList<>();

    public void estacionar(Carro carro) {

        if(!carro.temMotorista()){
            throw new EstacionamentoException("Carro sem motorista informado");
        }

        if(carro.getMotorista().motoristaMenorDeIdade()){
            throw new EstacionamentoException("Motorista menor de idade");
        }

        if(carro.getMotorista().motoristaComPontuacaoAcimaDoMaximoPermitido()){
            throw  new EstacionamentoException("Motorista com pontuação acima do maximo permitido para dirigir");
        }

        this.estacionarCarro(carro);
    }

    public int carrosEstacionados() {
        return estacionamento.size();
    }

    public boolean carroEstacionado(Carro carro) {

        return estacionamento.stream().filter(c -> c.equals(carro)).findFirst().isPresent();

    }

    private boolean temVagaEstacionamento(){

        if( this.carrosEstacionados() < 10){
            return true;
        }
        return false;
    }


    private void estacionarCarro(Carro carro){
        if(!temVagaEstacionamento()){
            Optional<Carro> hascarro = this.estacionamento.stream().filter(c -> c.getMotorista().getIdade() < 55).findFirst();
            if (hascarro.isPresent()) {
                estacionamento.remove(hascarro.get());
            }else{
                throw new EstacionamentoException("Estacionamento cheio!");
            }
        }
        estacionamento.add(carro);

    }





}