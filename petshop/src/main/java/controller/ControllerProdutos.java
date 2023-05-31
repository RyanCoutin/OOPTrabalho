/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author 17M RFT29
 */
public class ControllerProdutos {
    
    private final DaoProdutos daoProdutos = new DaoProdutos();
    
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutoDAO(pModelProdutos);
    }   
        
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
        
    }
    
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
}
