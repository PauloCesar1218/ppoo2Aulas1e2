/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import modelo.Venda;

/**
 *
 * @author wolley
 */
public class ProcessaVendaConfirmada implements ProcessaVenda{
    
    @Override
    public void processar(Venda venda){
        System.out.println("Processando venda confirmada.....");
        System.out.println(venda);
    }
    
}
