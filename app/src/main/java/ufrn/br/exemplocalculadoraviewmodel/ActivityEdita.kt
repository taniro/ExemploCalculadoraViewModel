package ufrn.br.exemplocalculadoraviewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ufrn.br.exemplocalculadoraviewmodel.databinding.ActivityEditaBinding

class ActivityEdita : AppCompatActivity() {

    lateinit var binding:ActivityEditaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edita)


        binding.buttonOk.setOnClickListener {
            var intent = Intent()
            intent.putExtra("valor", 10)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}