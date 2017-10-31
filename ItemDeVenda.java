package mercadinho;
public class ItemDeVenda {
    Integer quantidade;
    EspecProduto espec;
    
    public ItemDeVenda(EspecProduto i,Integer qtd){

        this.espec = i;
        this.quantidade = qtd;
    }

    @Override
    public String toString() {
        return "ItemDeVenda{" + "quantidade=" + quantidade + "," + espec.toString() + '}';
    }
    public Float subTotal(){
        return (this.espec.preco * this.quantidade);
    }
}
