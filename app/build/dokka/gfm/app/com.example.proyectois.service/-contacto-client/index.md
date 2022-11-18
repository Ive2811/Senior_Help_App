//[app](../../../index.md)/[com.example.proyectois.service](../index.md)/[ContactoClient](index.md)

# ContactoClient

[androidJvm]\
class [ContactoClient](index.md)

## Constructors

| | |
|---|---|
| [ContactoClient](-contacto-client.md) | [androidJvm]<br>fun [ContactoClient](-contacto-client.md)() |

## Types

| Name | Summary |
|---|---|
| [Contacto](-contacto/index.md) | [androidJvm]<br>data class [Contacto](-contacto/index.md)(var name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, var phone: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, var id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |

## Functions

| Name | Summary |
|---|---|
| [delete](delete.md) | [androidJvm]<br>fun [delete](delete.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Task&lt;[Void](https://developer.android.com/reference/kotlin/java/lang/Void.html)&gt;<br>Deletes a product from the Database |
| [getAll](get-all.md) | [androidJvm]<br>fun [getAll](get-all.md)(): Task&lt;QuerySnapshot&gt;<br>Returns all Products currently saved in the database |
| [getByID](get-by-i-d.md) | [androidJvm]<br>fun [getByID](get-by-i-d.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): Task&lt;DocumentSnapshot&gt;<br>Returns a single Product, by its id. Fails with a message on error |
| [new](new.md) | [androidJvm]<br>fun [new](new.md)(contacto: [ContactoClient.Contacto](-contacto/index.md)): Task&lt;DocumentReference&gt;<br>Creates a new Product in the database |
| [update](update.md) | [androidJvm]<br>fun [update](update.md)(contacto: [ContactoClient.Contacto](-contacto/index.md)): Task&lt;[Void](https://developer.android.com/reference/kotlin/java/lang/Void.html)&gt;<br>Updates an existing Product in the database |
