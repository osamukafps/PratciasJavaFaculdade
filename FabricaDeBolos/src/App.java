public class App {
    public static void main(String[] args) throws Exception {
        
        Abacaxi abacaxi = new Abacaxi();
        abacaxi.SetNome("Super Abacaxi");
        abacaxi.SetTipo("Abacaxi");
        abacaxi.SetPreco(35.90f);
        abacaxi.Receita();
        
        System.out.printf("Nome: " + abacaxi.GetNome() + "\n" + 
                          "Tipo: " + abacaxi.GetTipo() + "\n" +
                          "Valor: R$" + abacaxi.GetPreco() + "\n" + "\n");

        Choconinho choconinho = new Choconinho();
        choconinho.SetNome("Choconíssimo");
        choconinho.SetTipo("Choconinho");
        choconinho.SetPreco(39.90f);
        choconinho.Receita();

        System.out.printf("Nome: " + choconinho.GetNome() + "\n" + 
                          "Tipo: " + choconinho.GetTipo() + "\n" +
                          "Valor: R$" + choconinho.GetPreco() + "\n" + "\n");
        
        FlorestaNegra florestaNegra = new FlorestaNegra();
        florestaNegra.SetNome("Dark Forest");
        florestaNegra.SetPreco(49.90f);
        florestaNegra.SetTipo("Floresta Negra");
        florestaNegra.Receita();

        System.out.printf("Nome: " + florestaNegra.GetNome() + "\n" + 
                          "Tipo: " + florestaNegra.GetTipo() + "\n" +
                          "Valor: R$" + florestaNegra.GetPreco() + "\n" + "\n");

        Prestigio prestigio = new Prestigio();
        prestigio.SetNome("Superstígio");
        prestigio.SetTipo("Prestígio");
        prestigio.SetPreco(45.99f);
        prestigio.Receita();
        
        System.out.printf("Nome: " + prestigio.GetNome() + "\n" + 
                          "Tipo: " + prestigio.GetTipo() + "\n" +
                          "Valor: R$" + prestigio.GetPreco() + "\n" + "\n");


    }
}
