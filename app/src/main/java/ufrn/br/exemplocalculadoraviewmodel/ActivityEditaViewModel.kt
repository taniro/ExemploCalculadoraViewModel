package ufrn.br.exemplocalculadoraviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityEditaViewModel : ViewModel() {

    var _numero = MutableLiveData<Int>(0)
    var _texto = MutableLiveData<String>("")
}