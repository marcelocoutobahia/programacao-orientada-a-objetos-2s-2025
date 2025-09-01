package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.ano = 2004;
        opala.modelo = "C8";
        opala.placa = "XLR8";
        opala.velocidade = 0;

        Radar radar = new Radar();
        radar.localizacao = "Pistão Sul";
        radar.limiteVelocidade = 60;
        
        radar.avaliarVelocidade(opala);

            

        }


}