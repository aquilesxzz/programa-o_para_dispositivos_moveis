package com.example.bytebankevolution

fun main() {
    println("====================================")
    println("BANCO BYTEBANK EVOLUTION")
    println("====================================")

    val contaMaria = ContaCorrente(titular = "Maria Silva", numero = 1001, saldoInicial = 2200.0)
    val contaJoao = ContaPoupanca(titular = "João Souza", numero = 2002, saldoInicial = 500.0)

    contaMaria.exibirExtrato()

    contaMaria.depositar(500.0)
    contaMaria.sacar(200.0)
    contaMaria.sacar(5000.0)

    contaMaria.aplicarTaxaMensal()

    contaMaria.transferir(100.0, contaJoao)

    contaMaria.exibirHistorico()
}