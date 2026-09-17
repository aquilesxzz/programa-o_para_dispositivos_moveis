package com.example.bytebankevolution

abstract class Conta(
    val titular: String,
    val numero: Int,
    saldoInicial: Double = 0.0
) {
    var saldo: Double = saldoInicial
        protected set

    protected val historico = mutableListOf<String>()

    open fun depositar(valor: Double): Boolean {
        if (valor <= 0) {
            println("Valor de depósito inválido!")
            return false
        }
        saldo += valor
        historico.add("Depósito de R$$valor realizado.")
        println("Depósito realizado com sucesso!")
        return true
    }

    open fun sacar(valor: Double): Boolean {
        if (valor <= 0) {
            println("Valor de saque inválido!")
            return false
        }
        if (valor > saldo) {
            println("Saldo insuficiente para realizar esta operação!")
            return false
        }
        saldo -= valor
        historico.add("Saque de R$$valor realizado.")
        println("Saque realizado com sucesso!")
        return true
    }

    fun transferir(valor: Double, contaDestino: Conta): Boolean {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor)
            historico.removeAt(historico.lastIndex)
            historico.add("Transferência de R$$valor enviada.")
            println("Transferência realizada com sucesso!")
            return true
        }
        return false
    }

    fun exibirExtrato() {
        println("Cliente: $titular")
        println("Conta: $numero")
        println("Saldo Atual: R$ $saldo")
    }

    fun exibirHistorico() {
        println("====================================")
        println("HISTÓRICO DE OPERAÇÕES")
        println("====================================")
        if (historico.isEmpty()) {
            println("Nenhuma operação realizada.")
        } else {
            historico.forEach { println(it) }
        }
    }
}