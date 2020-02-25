package challenge;

import java.util.Objects;

public class Carro {

    private final Motorista motorista;

    private final String placa;

    private final Cor cor;

    private Carro(Motorista motorista, String placa, Cor cor) {
        this.motorista = motorista;
        this.placa = placa;
        this.cor = cor;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public Cor getCor() {
        return cor;
    }

    public boolean temMotorista(){
        if(this.getMotorista() != null){
            return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Carro carro = (Carro) o;
        return Objects.equals(motorista, carro.motorista) &&
                Objects.equals(placa, carro.placa) &&
                cor == carro.cor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(motorista, placa, cor);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motorista=" + motorista +
                ", placa='" + placa + '\'' +
                ", cor=" + cor +
                '}';
    }

    public static CarroBuilder builder() {
        return new CarroBuilder();
    }


    public static class CarroBuilder {

        private Motorista motorista;

        private String placa;

        private Cor cor;

        private CarroBuilder() {
        }

        public CarroBuilder withMotorista(Motorista motorista) {
            this.motorista = motorista;
            return this;
        }

        public CarroBuilder withPlaca(String placa) {
            if(this.validaPlaca(placa)){
                throw new NullPointerException("Voc� deve informar uma placa para o carro");
            }

            this.placa = placa;
            return this;
        }

        public CarroBuilder withCor(Cor cor) {
            if(this.validaCor(cor)){
                throw new NullPointerException("Voc� deve informar um cor para o carro");
            }

            this.cor = cor;
            return this;
        }


        private boolean validaPlaca(String placa){
            return placa.trim().isEmpty();
        }

        private boolean validaCor(Cor cor){
            return cor.toString().trim().isEmpty();
        }


        public Carro build() {

            this.validaPlaca(placa);
            this.validaCor(cor);

            return new Carro(motorista, placa, cor);
        }

        Object withCor(String[] corVetor) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        Object withCor(String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}