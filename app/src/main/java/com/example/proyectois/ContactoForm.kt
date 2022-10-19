package com.example.proyectois

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.proyectois.databinding.ActivityContactoFormBinding
import com.example.proyectois.service.ContactoClient

private lateinit var binding: ActivityContactoFormBinding
class ContactoForm : AppCompatActivity() {

    var currentContacto: ContactoClient.Contacto? = null
    lateinit var pc: ContactoClient

    lateinit var btnDelete: Button
    lateinit var lblContactoID: TextView
    lateinit var txtvContactoID: TextView
    lateinit var txteContactoName: EditText
    lateinit var txteContactoPhone: EditText
    lateinit var txtFormTitle: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto_form)
        binding = ActivityContactoFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgbtnFormHome.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        pc = ContactoClient()

        initScreen()
    }
    private fun initScreen() {

        btnDelete = findViewById(R.id.btnDelete)
        lblContactoID = findViewById(R.id.lblContactoID)
        txtvContactoID = findViewById(R.id.txtvContactoID)
        txteContactoName = findViewById(R.id.txteContactoName)
        txteContactoPhone = findViewById(R.id.txteContactoPhone)
        txtFormTitle = findViewById(R.id.txt_form_title)

        when( intent.action ){

            "new" -> {
                btnDelete.visibility = Button.GONE
                lblContactoID.visibility = TextView.GONE
                txtvContactoID.visibility = TextView.GONE
            }
            "edit" -> {

                pc.getByID(intent.getStringExtra("contactoID")!!)
                    .addOnSuccessListener { product ->
                        currentContacto = product.toObject(ContactoClient.Contacto::class.java)
                        txtvContactoID.text = currentContacto?.id
                        txteContactoName.setText(currentContacto?.name)
                        txteContactoPhone.setText(currentContacto?.phone.toString())
                    }
                    .addOnFailureListener {
                        result(0, Intent().putExtra("message", it.toString()))
                    }

            }

        }

        var titlePieceID = if(intent.action == "new") R.string.prodForm_titlePiece_new else R.string.prodForm_titlePiece_edit

        txtFormTitle.text = getString(R.string.prodForm_title, getString(titlePieceID), getString(R.string.prodForm_titlePiece_product)  )

    }

    fun cancel( v: View){

        this.result(-1)

    }

    fun save( v: View){

        when( intent.action ){

            "new" -> {

                pc.new(
                    ContactoClient.Contacto(
                        txteContactoName.text.toString(),
                        txteContactoPhone.text.toString()
                    )
                )
                    .addOnSuccessListener { result(1) }
                    .addOnFailureListener { result(0, Intent().putExtra("message", R.string.prodList_msg_unknownError)) }

            }
            "edit" -> {

                currentContacto?.apply {
                    name = txteContactoName.text.toString()
                    phone = txteContactoPhone.text.toString()
                }

                pc.update(currentContacto!!)
                    .addOnSuccessListener { result(1) }
                    .addOnFailureListener { result(0, Intent().putExtra("message", R.string.prodList_msg_unknownError)) }


            }

        }
    }

    fun delete( v: View){

        pc.delete(currentContacto!!.id!!)
            .addOnSuccessListener { result(2) }
            .addOnFailureListener { result(0, Intent().putExtra("message", R.string.prodList_msg_unknownError)) }

    }

    private fun result( code:Int, data: Intent? = null ){

        if(data is Intent) setResult(code, data)
        else setResult(code)

        finish()

    }

}