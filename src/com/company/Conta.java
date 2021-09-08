package com.company;

import com.company.Cliente;

public class Conta {

    private String numeroConta;
    private double saldo;
    private Cliente titular;

    //getters e setters
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    private double getSaldo() {
        return this.saldo;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return this.titular;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    //construtor
    public Conta(String numeroConta, double saldo, Cliente titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    //métodos
    public double depositar(double quantia){
        this.setSaldo(getSaldo() + quantia);
        //System.out.println("Depósito realizado com sucesso!");
        //System.out.println("Seu novo saldo é de " + saldo);
        return saldo;
    }

    public double sacar(double quantia){
        if(quantia > saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            this.setSaldo(getSaldo() - quantia);
            //System.out.println("Saque realizado com sucesso!");
            //System.out.println("Seu novo saldo é de " + saldo);
        }
        return saldo;
    }
}
