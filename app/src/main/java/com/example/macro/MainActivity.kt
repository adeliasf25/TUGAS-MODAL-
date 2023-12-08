package com.example.macro


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    private lateinit var onboardingItemAdapter: AdptOnboarding
    private lateinit var indicatorsContainer : LinearLayout
    private lateinit var sheet : FrameLayout
    private lateinit var registerBtn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnboardingItems()
        setupIndicators()
        setCurrentIndicator(0)

        sheet = findViewById(R.id.sheet)
        registerBtn = findViewById(R.id.regist_btn)
        val username ="admin"
        val pwd ="123456"

        val iduser: EditText = findViewById(R.id.username_et)
        val idpass: EditText = findViewById(R.id.password_et)
        val btlogin: Button = findViewById(R.id.login_btn)

        btlogin.setOnClickListener {
            if (iduser.text.toString() == username && idpass.text.toString() == pwd) {
                startTumpuan()
            } else if (iduser.text.isEmpty() || idpass.text.isEmpty()) {
                Toast.makeText(this, "Harap isi form login", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }

        registerBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegistActivity::class.java))
        }


        BottomSheetBehavior.from(sheet).apply {
            peekHeight = 140
            this.state = BottomSheetBehavior.STATE_COLLAPSED

        }

    }

   private fun startTumpuan() {
        intent = Intent(this,TumpuanActivity::class.java)
        startActivity(intent)
    }
    private fun setOnboardingItems() {
        onboardingItemAdapter = AdptOnboarding(
            listOf(
                OnboardingMacro(
                    image = R.drawable.on1,
                    judul = "WELCOME",
                    desk = "Jelajahi wisata Indonesia\n" +
                            "dan nikmati pengalaman yang \n" +
                            "lebih baik"

                ),
                OnboardingMacro(
                    image = R.drawable.on2,
                    judul = "ALAM",
                    desk = "Banyak keindahan alam yang\n" +
                            "bisa dinikmati dan dieksplorasi \n" +
                            "di seluruh negeri ini\n"

                ),
                OnboardingMacro(
                    image = R.drawable.on3,
                    judul = "KULINER",
                    desk = "Wisata kuliner yang tak terlupakan\n" +
                            "dengan hidangan lezat khas\n" +
                            "daerahnya\n"

                ),
                OnboardingMacro(
                    image = R.drawable.on4,
                    judul = "KEINDAHAN",
                    desk = "Indonesia adalah surga bagi\n" +
                            "pecinta alam dengan pantai\n" +
                            "eksotis, gunung-gunung megah,\n" +
                            "hutan-hutan hujan tropis, dan\n" +
                            "terumbu karang yang\n" +
                            "menakjubkan."

                ),
                OnboardingMacro(
                    image = R.drawable.on5,
                    judul = "Indonesia",
                    desk = "Tempat di mana matahari\n" +
                            "terbenam memukau dan matahari\n" +
                            "terbit mempesona. Datanglah dan \n" +
                            "biarkan alam memukau Anda \n" +
                            "setiap saat"

                )

            )
        )
        val onboardingViewPager = findViewById<ViewPager2>(R.id.PagerPage)
        onboardingViewPager.adapter=onboardingItemAdapter
        onboardingViewPager.registerOnPageChangeCallback(object  :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        (onboardingViewPager.getChildAt(0) as RecyclerView).overScrollMode=RecyclerView.OVER_SCROLL_NEVER





    }
    private fun setupIndicators(){
        indicatorsContainer = findViewById(R.id.indicatorContent)
        val indicators = arrayOfNulls<ImageView>(onboardingItemAdapter.itemCount)
        val layoutParams:LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices){
            indicators[i] = ImageView(applicationContext)
            indicators[i]?.let {
                it.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inative_bg
                    )
                )
                it.layoutParams =layoutParams
                indicatorsContainer.addView(it)
            }
        }
    }
    private fun setCurrentIndicator(position: Int){
        val chilCount = indicatorsContainer.childCount
        for (i in 0 until chilCount){
            val imageView = indicatorsContainer.getChildAt(i) as ImageView
            if (i   == position){
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_active_bg
                    )
                )
            }else{
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_inative_bg
                    )
                )
            }
        }
    }
}