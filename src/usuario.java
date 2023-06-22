public class usuario {

    public static void main(String[] args) {

        smartTv smartTv = new smartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? "  + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status - TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(11);
        System.out.println("canal atual: " + smartTv.canal);
    }
}
