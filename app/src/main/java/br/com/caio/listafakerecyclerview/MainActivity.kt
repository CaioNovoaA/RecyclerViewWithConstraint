package br.com.caio.listafakerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = ContactAdapter(getContacts())
        recyclerView.adapter = adapter
    }

    private fun getContacts(): List<Contact>{
        return arrayListOf(
            Contact("adão", "+55 11 9789878987"),
            Contact("Adão", "+55 11 9342423422"),
            Contact("Adão", "+55 11 9854547898"),
            Contact("Adão", "+55 11 8755458954"),
            Contact("Adão", "+55 11 7458745848")

        ).toList()



    }
}
data class Contact(val name: String, val number: String){}