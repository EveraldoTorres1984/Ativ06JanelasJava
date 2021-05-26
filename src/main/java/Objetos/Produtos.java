/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author torre
 */
public class Produtos {
    private String nomeProduto;
    private String descricaoProduto;
    private double valorUnidade;
    private int qtdeProduto;
    private double valorTotalProduto;
    private String fornecedorProduto;

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * @return the valorUnidade
     */
    public double getValorUnidade() {
        return valorUnidade;
    }

    /**
     * @param valorUnidade the valorUnidade to set
     */
    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    /**
     * @return the qtdeProduto
     */
    public int getQtdeProduto() {
        return qtdeProduto;
    }

    /**
     * @param qtdeProduto the qtdeProduto to set
     */
    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    /**
     * @return the valorTotalProduto
     */
    public double getValorTotalProduto() {
        return valorTotalProduto = qtdeProduto*valorUnidade;
    }

    /**
     * @param valorTotalProduto the valorTotalProduto to set
     */
    public void setValorTotalProduto(double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }

    /**
     * @return the fornecedorProduto
     */
    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    /**
     * @param fornecedorProduto the fornecedorProduto to set
     */
    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }
    
    
}
