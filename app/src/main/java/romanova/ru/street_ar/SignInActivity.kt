package romanova.ru.street_ar

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class SignInActivity : AppCompatActivity() {

    private var _customFontTextViewLogin: TextView? = null
    private var _customFontTextViewPassword: TextView? = null
    private var _customFontImageButtonGo: Button? = null
    private var _typeFace:           Typeface? = null

    fun transition(view: View){
        val intent = Intent(this,SuccessfullSignIn::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        this._initializeResources()
        this._initializeGUI()
    }

    private fun _initializeResources() {
        this._customFontTextViewLogin = this.findViewById(R.id.loginField)
        this._customFontTextViewPassword = this.findViewById(R.id.passwordField)
        this._customFontImageButtonGo = this.findViewById(R.id.doLoginButton)
        this._typeFace = ResourcesCompat.getFont(this.applicationContext, R.font.geometriaextrablackitalic)
    }

    private fun _initializeGUI() {
        this._customFontTextViewLogin!!.setTypeface(this._typeFace, Typeface.BOLD_ITALIC)
        this._customFontTextViewPassword!!.setTypeface(this._typeFace, Typeface.BOLD_ITALIC)
        this._customFontImageButtonGo!!.setTypeface(this._typeFace, Typeface.BOLD_ITALIC)
    }
}
