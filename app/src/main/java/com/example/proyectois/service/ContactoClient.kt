package com.example.proyectois.service

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class ContactoClient {

    data class Contacto( var name:String? = null, var phone:String? = null, @DocumentId var id:String? = null )

    private val db = Firebase.firestore
    private val contactos = db.collection("contactos")

    /**
     * Returns all Products currently saved in the database
     */
    fun getAll() = contactos.get()

    /**
     * Returns a single Product, by its id. Fails with a message on error
     */
    fun getByID( id:String ) = contactos.document(id).get()

    /**
     * Creates a new Product in the database
     */
    fun new( contacto: Contacto) = contactos.add(hashMapOf("name" to contacto.name, "phone" to contacto.phone))

    /**
     * Updates an existing Product in the database
     */
    fun update( contacto: Contacto) = contactos.document(contacto.id!!).update(mapOf("name" to contacto.name, "price" to contacto.phone))

    /**
     * Deletes a product from the Database
     */
    fun delete( id:String ): Task<Void> = contactos.document(id).delete()

}