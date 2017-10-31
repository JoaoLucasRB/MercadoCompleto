package mercadinho;
import java.util.*;
/**
 *
 * @author Neto-PC
 */
public class Venda {
    Pagamento pagamento;
    ArrayList listaItens;
    public Venda(){
        this.listaItens = new ArrayList();
    }
    public void incluirItemDeVenda(EspecProduto i,int qtd){
        ItemDeVenda item = new ItemDeVenda(i,qtd);
        listaItens.add(item);       
    }
    public void listarItens(){
        Iterator i = listaItens.iterator();
        while(i.hasNext()){
            ItemDeVenda proximo = (ItemDeVenda) i.next();
            System.out.println(proximo.toString());
        }
    }
    public Float getTotal(){
        float total=0;
        Iterator i = listaItens.iterator();
        while(i.hasNext()){
            ItemDeVenda proximo = (ItemDeVenda) i.next();
            total = total + proximo.subTotal();
        }
        return total;
    }
    public Float getTroco(){
        float tot = this.getTotal();
        float val = pagamento.getValorPago();
        return (val-tot);
        
    }
    public void efetuarPagamento(Float pago){
        this.pagamento = new Pagamento(pago);
    }
    
}
