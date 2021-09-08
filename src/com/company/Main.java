package com.company;

public class Main {

    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("Hugo", "Quadros");
    Cliente cliente2 = new Cliente("Andressa", "Oliveira");

    Conta conta1 = new Conta("01", 0, cliente1);
    Conta conta2 = new Conta("02", 100, cliente2);

    System.out.println("O saldo do cliente " + conta1.getTitular().getNome() + " " + conta1.getTitular().getSobrenome() + " é " + conta1.getSaldo());
    conta1.depositar(100);
    System.out.println("O saldo após o depósito é de " + conta1.getSaldo());
    conta1.sacar(50);
    System.out.println("O saldo após o saque é de " + conta1.getSaldo());

    System.out.println("O saldo do cliente " + conta2.getTitular().getNome() + " " + conta2.getTitular().getSobrenome() + " é " + conta2.getSaldo());
    conta2.depositar(200);
    System.out.println("O saldo após o depósito é de " + conta2.getSaldo());
    conta2.sacar(150);
    System.out.println("O saldo após o saque é de " + conta2.getSaldo());
    }
}
