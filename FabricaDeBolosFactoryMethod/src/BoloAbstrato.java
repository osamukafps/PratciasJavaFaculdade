abstract class BoloAbstrato {

    private String Nome;
    private String Tipo;
    private Float Preco;
    
    //#region Getters e Setters

    public String GetNome()
    {
        return this.Nome;
    }

    public void SetNome(String nome)
    {
        this.Nome = nome;
    }

    public String GetTipo()
    {
        return this.Tipo;
    }

    public void SetTipo(String tipo)
    {
        this.Tipo = tipo;
    }

    public float GetPreco()
    {
        return this.Preco;
    }

    public void SetPreco(float preco)
    {
        this.Preco = preco;
    }
    
    //#endregion
    
    public void SobreOBolo()
    {
        System.out.printf("Os ingredientes para esse bolo são {0}, Java e VS Code!" ,Tipo);
    }

    public abstract void Receita();
    
}
