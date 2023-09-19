package ufrn.br.exemplocalculadoraviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var calculadora = MutableLiveData<Calculadora>()

    init {
        calculadora.value = Calculadora(0, 0)
    }

    fun atualizaX(valor:Int){
        val c = Calculadora(valor, this.calculadora.value!!.argumentoY)
        calculadora.postValue(c)
    }
}