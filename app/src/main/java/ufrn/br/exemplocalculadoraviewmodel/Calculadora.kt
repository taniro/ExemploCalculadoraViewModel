package ufrn.br.exemplocalculadoraviewmodel

class Calculadora (var argumentoX:Int, var argumentoY:Int) {

    fun calcular():Int{
        return argumentoX + argumentoY
    }
}