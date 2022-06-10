package com.example.proyectois

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectois.databinding.ActivityMainBinding
import com.example.proyectois.databinding.ActivityResetPasswordBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {

    val RC_SIGN_IN = 123
    lateinit var mGoogleSignInClient: GoogleSignInClient
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding
    private lateinit var dialog: Dialog
    private lateinit var dialog1: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        binding.btnInGoogle.setOnClickListener{
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

            binding.btnInLogin.setOnClickListener{

            val Email = binding.edtInCorreo1.text.toString()
            val Password = binding.edtInContra.text.toString()

            when {
               Email.isEmpty() || Password.isEmpty() -> {
                   // If sign in fails, display a message to the user.
                   Toast.makeText(baseContext, "Autenticación fallida.",
                       Toast.LENGTH_SHORT).show()
               } else -> {
                SignIn(Email,Password)

               }
            }
        }
        binding.txtInRegistro.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        binding.txtInOlvid.setOnClickListener {
            startActivity(Intent(this,ActivityResetPassword::class.java))
        }
    }

    private fun SignIn (email: String, password : String){
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->

                if (task.isSuccessful) {
                    success()

                } else {
                    error()
                }
            }
        }

    private fun reaload() {
        val intent = Intent( this, MainActivity3::class.java)
        this.startActivity(intent)
        finish()
    }
    private fun success(){
        dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_view)
        dialog.window!!.setBackgroundDrawable(getDrawable(R.drawable.background_alert))
        dialog.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog.setCancelable(false)
        dialog.window!!.attributes.windowAnimations = R.style.DialogAnimation

        val okay = dialog.findViewById<Button>(R.id.btn_ok1)

        okay.setOnClickListener {
            reaload()
            dialog.dismiss()
        }

        binding.btnInLogin.setOnClickListener {
            dialog.show()
        }
    }

    private fun error(){
        dialog1 = Dialog(this)
        dialog1.setContentView(R.layout.dialog_view_error)
        dialog1.window!!.setBackgroundDrawable(getDrawable(R.drawable.background_alert_error))
        dialog1.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog1.setCancelable(false)
        dialog1.window!!.attributes.windowAnimations = R.style.DialogAnimation

        val okay1 = dialog1.findViewById<Button>(R.id.btn_ok)

        okay1.setOnClickListener {
            dialog1.dismiss()
        }

        binding.btnInLogin.setOnClickListener {
            dialog1.show()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account: GoogleSignInAccount = completedTask.getResult(ApiException::class.java)

            // Signed in successfully, show authenticated UI.
            updateUI(account)
        } catch (e: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            //Log.w(TAG, "signInResult:failed code=" + e.statusCode)
            updateUI( null)
        }
    }

    private fun updateUI(account: GoogleSignInAccount?) {
        if (account != null) {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("name", account.displayName)
            intent.putExtra("email", account.email)
            startActivity(intent)
        }
    }
}

