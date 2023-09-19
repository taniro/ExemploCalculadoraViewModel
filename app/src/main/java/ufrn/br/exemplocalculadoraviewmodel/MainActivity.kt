package ufrn.br.exemplocalculadoraviewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import ufrn.br.exemplocalculadoraviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    val activityLauncherX = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result ->
        if (result.resultCode == RESULT_OK){
            val valor:Int = result.data!!.getIntExtra("valor", 0)
            viewModel.atualizaX(valor)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.buttonSetX.setOnClickListener {
            val i = Intent(this, ActivityEdita::class.java)
            activityLauncherX.launch(i)
        }
    }
}