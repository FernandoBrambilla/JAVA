/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;

import javax.swing.JOptionPane;




/**
 *
 * @author COPEL
 */
public class ContaBanco {
    private String numConta;
    private String tipoConta;
    private String nomeTitular;
    private float saldoConta;
    private boolean statusConta;

    public ContaBanco(String numConta, String tipoConta, String nomeTitular, float saldoConta, boolean statusConta) {
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
        this.statusConta = statusConta;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    

    
    public void abrirConta(){
        this.setStatusConta(true);
        if(this.getTipoConta().equals("Conta Corrente")){
            this.setSaldoConta(50.00f);
        }
            else{
                    this.setSaldoConta(100.00f);
                    }    
            
        }
                
    
    
    public void encerrarConta(){
        if (this.getSaldoConta()!=0||this.statusConta==true){
            JOptionPane.showMessageDialog(null, "Impossível encerrar a conta, o Sado precisa ser Zero\n"+
                    "Seu saldo atual é R$ "+ this.getSaldoConta());
        }
        else{
            this.statusConta=false;
            JOptionPane.showMessageDialog(null, "Conta encerrada com Sucesso");
        }
    }
    
    public void sacar(){
        float valorSaque=Float.parseFloat(JOptionPane.showInputDialog(null,"Qual valor você quer sacar?"));
           if(this.getSaldoConta()>=valorSaque ){
               this.setSaldoConta(saldoConta-valorSaque);
                JOptionPane.showMessageDialog(null, "Valor R$ "+valorSaque+ " sacado com Sucesso!\n"+"Seu saldo atual é R$ "+
                        this.getSaldoConta());
            }
            else{
               JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar este saque!");
            }
           }
    
    public void depositar(){
      
       
        if(this.statusConta==true){
            float valorDeposito=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o Valor a ser depositado: "));
            this.setSaldoConta(saldoConta+valorDeposito);
            JOptionPane.showMessageDialog(null, "Valor R$ "+valorDeposito+ " depositado com Sucesso!\n"+"Seu saldo atual é R$ "+
                        this.getSaldoConta());                
        }
         
       else{
        JOptionPane.showMessageDialog(null, "Não é possível depositar, Sua conta foi ecnerrada");
    }
    }
    
    public void pagarMensalidade(){
        String pagarMensalidade=JOptionPane.showInputDialog(null, "Quer pagar sua mensalidade? [S]SIM [N]NAO");
            if("s".equals(pagarMensalidade)||"S".equals(pagarMensalidade)){
               if("Conta Corrente".equals(this.getTipoConta())){
                    this.setSaldoConta(saldoConta-12);
                    JOptionPane.showMessageDialog(null, "Você pagou sua mensalidade.\n"+
                        "Foi descontado R$ 12,00 do seu saldo\n"+
                        "Seu saldo atual é de R$ "+this.getSaldoConta());
                }else{
                   this.setSaldoConta(saldoConta-6);
                    JOptionPane.showMessageDialog(null, "Você pagou sua mensalidade.\n"+
                        "Foi descontado R$ 6,00 do seu saldo\n"+
                        "Seu saldo atual é de R$ "+this.getSaldoConta());
               }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Você Não pagou sua mensalidade.");
                        
                
            }
    }
    
    public void extratoConta(){
        JOptionPane.showMessageDialog(null,"Titular: "+ getNomeTitular()+
                            "\nConta Nº: "+ getNumConta()+
                            "\nTipo de Conta: "+getTipoConta()+
                            "\nSaldo em Conta: "+getSaldoConta());
                                    
    }
}



