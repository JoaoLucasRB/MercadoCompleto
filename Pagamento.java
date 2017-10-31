/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho;

/**
 *
 * @author 171051224
 */
public class Pagamento {
    Float valorPago;
    
    public Pagamento(float valorRecebido){
        this.valorPago = valorRecebido;
    }

    public Float getValorPago() {
        return valorPago;
    }
    
}
