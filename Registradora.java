/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho;

/**
 *
 * @author Neto-PC
 */
public class Registradora {
    Venda venda;
    CatalogoProduto catalogo;
    public Registradora(){
        catalogo = new CatalogoProduto();
    }
    public void iniciarVenda(){
        this.venda = new Venda();
    }
    public void incluirItem(Integer id,Integer qtd){
        EspecProduto i = this.catalogo.acharEspec(id);
        venda.incluirItemDeVenda(i,qtd);
        venda.listarItens();
    }
    public Float concluirVenda(){
        float total = venda.getTotal();
        return total;
    }
    public Float getTroco(){
        float troco = venda.getTroco();
        return troco;
    }
    public void finalizarPagamento(Float nastacia){
        venda.efetuarPagamento(nastacia);
    }
    

}
