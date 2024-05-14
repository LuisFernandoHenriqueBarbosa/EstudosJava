public class TesteVeiculo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", 2022);
        Veiculo v = new Veiculo("Ranger");
        meuCarro.acelerar();
        meuCarro.acelerar(80);
        v.acelerar(80);
        meuCarro.acelerar(true);
    }
}
