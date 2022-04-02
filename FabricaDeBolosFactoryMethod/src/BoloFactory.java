public class BoloFactory {

    public enum Tipo
    {
        Abacaxi, Choconinho, FlorestaNegra, Prestigio
    };

    public Bolo getBolo(Tipo tipo)
    {
        Bolo bolo = null;

        if(tipo == Tipo.Abacaxi)
            bolo = new Abacaxi();

        if(tipo == Tipo.Choconinho)
            bolo = new Choconinho();
            
        if(tipo == Tipo.FlorestaNegra)
            bolo = new FlorestaNegra();

        if(tipo == Tipo.Prestigio)
            bolo = new Prestigio();

        return bolo;
    }
    
}
