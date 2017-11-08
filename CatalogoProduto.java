/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho;

import java.util.HashMap;

/**
 *
 * @author Neto-PC
 */
public class CatalogoProduto {

    HashMap<Integer, EspecProduto> mapa = new HashMap<>();
   
    public CatalogoProduto() {
         EspecProduto p1;
        EspecProduto p2;
        EspecProduto p3;
        EspecProduto p4;
        p1 = new EspecProduto(6.50f, "Cerveja skol latao", 1);
        p2 = new EspecProduto(7.5f, "Coca-cola 2 litros", 2);
        p3 = new EspecProduto(2.50f, "Dose normal jurubeba", 3);
        p4 = new EspecProduto(2f, "Petiscos de queijo", 4);
        mapa.put(1, p1);
        mapa.put(2, p2);
        mapa.put(3, p3);
        mapa.put(4, p4);

    }
    public EspecProduto acharEspec(Integer i){
        return this.mapa.get(i);
    }
    
    public void adicionarProduto(int id,String nome,float preco){
        EspecProduto pn = new EspecProduto(preco,nome,id);
        mapa.put(id,pn);
    }
}
