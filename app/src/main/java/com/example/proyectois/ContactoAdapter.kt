package com.example.proyectois

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectois.service.ContactoClient

class ContactoAdapter: RecyclerView.Adapter<ContactoAdapter.PAVH>() {


    var clickListener:PACL? = null
    lateinit var contactos:List<ContactoClient.Contacto>

    class PAVH:RecyclerView.ViewHolder { //ProductAdapterViewHolder

        var txtvName: TextView
        var txtvID: TextView
        var txtvPhone: TextView

        constructor( v: View):super(v) {

            txtvName = v.findViewById(R.id.itemLabel_Name)
            txtvID = v.findViewById(R.id.itemLabel_id)
            txtvPhone = v.findViewById(R.id.itemLabel_Phone)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):PAVH {

        val view = LayoutInflater.from(parent.context).inflate( R.layout.activity_contacto_adapter, parent, false )
        return PAVH(view)

    }

    override fun onBindViewHolder( holder:PAVH, position:Int) {

        var contacto = contactos[position]

        holder.txtvName.text = contacto.name
        holder.txtvID.text = contacto.id
        holder.txtvPhone.text = contacto.phone
        holder.itemView.setOnClickListener {
            clickListener?.onItemClicked(holder.itemView, contacto.id!!)
        }

    }

    override fun getItemCount(): Int = contactos.size

    interface PACL { // ContactAdapterClickListener
        fun onItemClicked( v:View, documentID:String )
    }

}
