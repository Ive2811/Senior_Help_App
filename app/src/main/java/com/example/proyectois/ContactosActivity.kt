package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectois.databinding.ActivityContactoFormBinding
import com.example.proyectois.databinding.ActivityContactosBinding
import com.example.proyectois.service.ContactoClient
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

private lateinit var binding: ActivityContactosBinding
class ContactosActivity : AppCompatActivity(), ContactoAdapter.PACL {

    private lateinit var pc: ContactoClient

    companion object {

        const val REQ_NEW = 1
        const val REQ_EDIT = 2

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)
        binding = ActivityContactosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnConHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
        pc = ContactoClient()

        pc.getAll()
            .addOnSuccessListener {

                val manager = LinearLayoutManager(this)
                val contactoAdapter = ContactoAdapter()

                contactoAdapter.clickListener = this
                contactoAdapter.contactos = it.toObjects(ContactoClient.Contacto::class.java)

                findViewById<RecyclerView>(R.id.contactoList).apply {
                    setHasFixedSize(true)
                    layoutManager = manager
                    adapter = contactoAdapter
                }
            }
            .addOnFailureListener {
                showSnackbar(R.string.prodList_msg_unknownError)
            }

        findViewById<FloatingActionButton>(R.id.fabNewContacto).setOnClickListener{
            newProduct()
        }

    }

    private fun reloadItems(){

        Log.i("Contact API", "loadItems()")

        pc.getAll()
            .addOnSuccessListener {
                (findViewById<RecyclerView>(R.id.contactoList).adapter as ContactoAdapter).apply {
                    contactos = it.toObjects(ContactoClient.Contacto::class.java)
                    notifyDataSetChanged()
                }
            }
            .addOnFailureListener {
                showSnackbar(R.string.prodList_msg_unknownError)
            }

    }

    private fun newProduct() = startActivityForResult( Intent(this, ContactoForm::class.java).apply { action = "new" }, REQ_NEW )

    // Edit a product
    override fun onItemClicked(v: View, documentID:String) = startActivityForResult( Intent(this, ContactoForm::class.java).apply { action = "edit" }.putExtra("contactoID", documentID), REQ_EDIT )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == -1 ) {

            showSnackbar(R.string.prodList_msg_canceled)

        } else {

            when (requestCode) {

                REQ_NEW -> {

                    when (resultCode) {

                        0 -> showSnackbar(data?.getIntExtra("message", 0)!!)
                        1 -> showSnackbar(R.string.prodList_msg_saved)

                    }

                }
                REQ_EDIT -> {

                    when (resultCode) {

                        0 -> showSnackbar(data?.getIntExtra("message", 0)!!)
                        1 -> showSnackbar(R.string.prodList_msg_modified)
                        2 -> showSnackbar(R.string.prodList_msg_deleted)

                    }

                }

            }

            reloadItems()
    }
}

    private fun showSnackbar( msg:Int ) = Snackbar.make(findViewById(R.id.layoutFABContainer), msg, Snackbar.LENGTH_SHORT ).setAnimationMode(
        Snackbar.ANIMATION_MODE_SLIDE).show()

}