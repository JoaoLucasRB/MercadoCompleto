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
public class EspecProduto {

    Float preco;
    String descricao;
    Integer id;
    CatalogoProduto produtos;

    public EspecProduto(Float i, String s, Integer id) {
        this.preco = i;
        this.descricao = s;
        this.id = id;
    }
    public EspecProduto(){
    }

    @Override
    public String toString() {
        return "EspecProduto{" + "preco=" + preco + ", descricao=" + descricao + ", id=" + id + '}';
    }

    public EspecProduto acharInCatalogo(Integer id) {
        produtos = new CatalogoProduto();
        while (true) {
            if (produtos.mapa.containsKey(id)) {
                EspecProduto i =(EspecProduto) produtos.mapa.get(id);
                return i;
            } else {
                System.out.println("Produto nao existe");

            }
        }
    }
}
