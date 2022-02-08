package br.com.caio.listafakerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val contacts: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_contact, parent, false)
    return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

    override fun getItemCount(): Int {
        return contacts.size
    }


    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: Contact) {
            with(itemView) {
                val txtInicial = findViewById<TextView>(R.id.txtInicial)
                val txtContactNumber = findViewById<TextView>(R.id.txtContactNumber)
                val txtContactName = findViewById<TextView>(R.id.txtContactName)

                txtInicial.text = data.name.first().toString()
               txtContactNumber.text = data.number
                txtContactName.text = data.name


            }
        }

    }
}