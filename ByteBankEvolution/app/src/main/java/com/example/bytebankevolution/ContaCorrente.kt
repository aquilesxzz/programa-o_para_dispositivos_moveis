package com.example.bytebankevolution

class ContaCorrente(
    titular: String,
    numero: Int,
    saldoInicial: Double = 0.0,
    val taxaMensal: Double = 30.0
) : Conta(titular, numero, saldoInicial) {

    fun aplicarTaxaMensal() {
        if (saldo >= taxaMensal) {
            saldo -= taxaMensal
            historico.add("Taxa mensal de R$$taxaMensal aplicada.")
            println("Aplicando taxa mensal...")
            println("Novo saldo: R$ $saldo")
        } else {
            println("Saldo insuficiente para aplicar taxa mensal!")
        }
    }
}

class ContaPoupanca(
    titular: String,
    numero: Int,
    saldoInicial: Double = 0.0
) : Conta(titular, numero, saldoInicial) {

    fun render(taxaRendimento: Double) {
        val rendimento = saldo * taxaRendimento
        saldo += rendimento
        historico.add("Rendimento de R$$rendimento aplicado.")
        println("Rendimento de R$$rendimento aplicado com sucesso!")
    }
}