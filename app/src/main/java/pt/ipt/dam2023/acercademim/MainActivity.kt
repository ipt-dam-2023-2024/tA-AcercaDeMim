package pt.ipt.dam2023.acercademim

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // <=> à função MAIN
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_adiciona_diminutivo).setOnClickListener {
            addicionaDiminutivo(it)
        }
    }

    /**
     * adiciona o 'diminutivo' do utilizador à respetiva TextView
     */
    private fun addicionaDiminutivo(bt: View) {
        // ponteiros para os objetos da interface
        val txtNome = findViewById<TextView>(R.id.diminutivo_textView)
        val editDiminutivo = findViewById<EditText>(R.id.diminutivo_editText)

        // associar o texrto da 'Text Box' à 'TextView
        txtNome.text = editDiminutivo.text

        // esconder os objetos q não devem estar no ecrã
        editDiminutivo.visibility = View.GONE
        bt.visibility = View.GONE
        // e mostrar a TextView
        txtNome.visibility = View.VISIBLE

// hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(bt.windowToken, 0)
    }


}