/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processador.vendas;

import compras.BoletoCompra;
import compras.CreditoCompra;
import compras.ProcessadorCompras;
import exceptions.StatusVendaInvalidaException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import modelo.Compras;
import modelo.MetodoCompras;
import modelo.StatusVenda;
import modelo.Venda;
import servico.ProcessadorDeArquivos;
import servico.ProcessadorDeVendas;

/**
 *
 * @author wolley
 *
 * Programa para processamento de vendas diarias De acordo com os status abaixo:
 * CONFIRMADO -> retirar produtos do estoque 
 * PENDENTE -> valida pagamento nas
 * operadoras de cartão 
 * CANCELADA -> repor produto no estoque
 *
 *
 */
public class Main {

    /**
     * Este arquivo esta em uma pasta chamada files deste projeto
     */
    private static final String PATH = "files/vendas.csv";

    /**
     * @param args the command line arguments
     * @throws java.lang.IllegalArgumentException
     */
    public static void main(String[] args) throws IllegalArgumentException, Exception {
        try {
            ProcessadorDeArquivos processador = new ProcessadorDeArquivos();
            List<Venda> vendas = processador.processar(PATH);

//            ProcessadorDeVendas processadorVendas = new ProcessadorDeVendas();
//            processadorVendas.processar(vendas);

            List<Compras> comprasItens = new ArrayList<>();
            // mock
            Compras boleto = new Compras();
            boleto.setMetodoCompras(MetodoCompras.BOLETO);
            boleto.setValor(200);
            boleto.setData("19/08/2020");
            comprasItens.add(boleto);
            Compras compra = new Compras();
            compra.setMetodoCompras(MetodoCompras.CREDITO);
            compra.setValor(50);
            compra.setData("05/02/2020");
            comprasItens.add(compra);
            // O que professor quer
            ProcessadorCompras processadorCompras = new ProcessadorCompras();
            processadorCompras.processar(comprasItens);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

}
