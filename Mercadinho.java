/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho;
import java.util.*;
/**
 *
 * @author Neto-PC
 */
public class Mercadinho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        int esc;
        Registradora regis = new Registradora();
        while(true){
            System.out.println("1. Nova Venda");
            System.out.println("0. Encerrar Programa");
            switch(ent.nextInt()){
                case 1:
                    regis.iniciarVenda();
                    do{
                        ent.reset();
                        System.out.println("2. Incluir item");
                        System.out.println("3. Encerrar Venda");
                        esc = ent.nextInt();
                        if(esc == 2){
                            System.out.println("Digite o ID e a quantidade respectivamente");
                            regis.incluirItem(ent.nextInt(), ent.nextInt());
                        }else if(esc ==3){
                            System.out.println("Total: " + regis.concluirVenda());
                            System.out.println("Insira o valor pago: ");
                            regis.finalizarPagamento(ent.nextFloat());
                            System.out.println("Troco: " + regis.getTroco());
                            break;
                        }else{
                            System.out.println("Insira uma opção válida.");
                        }
                    }while(true);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Insira uma opção válida");
                    break;
            }
        }
        
    }
    
    
}
