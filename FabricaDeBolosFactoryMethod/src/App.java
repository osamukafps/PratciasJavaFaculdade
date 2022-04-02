public class App {
    public static void main(String[] args) throws Exception {
        
        BoloFactory boloFactory = new BoloFactory();

        Bolo boloAbacaxi = boloFactory.getBolo(BoloFactory.Tipo.Abacaxi);
        boloAbacaxi.fazerBolo();
        System.out.println("Bolo de Abacaxi finalizado! \n");

        Bolo boloChoconinho = boloFactory.getBolo(BoloFactory.Tipo.Choconinho);
        boloChoconinho.fazerBolo();
        System.out.println("Bolo de Choconinho finalizado! \n");

        Bolo boloFlorestaNegra = boloFactory.getBolo(BoloFactory.Tipo.FlorestaNegra);
        boloFlorestaNegra.fazerBolo();
        System.out.println("Bolo de Floresta Negra finalizado! \n");

        Bolo boloPrestigio = boloFactory.getBolo(BoloFactory.Tipo.Prestigio);
        boloPrestigio.fazerBolo();
        System.out.println("Bolo de Prestigio finalizado! \n");            

    }
}
