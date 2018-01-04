package com.test.snake.customtoastkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.Gravity
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.custom_layout.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showCustom()
    }

    private fun showCustom() {
        val layoutInflater = getSystemService("layout_inflater") as LayoutInflater
        val layout = layoutInflater.inflate(R.layout.custom_layout, null)

        // findViewByid()는 layout 개체에서 호출하여 사용한다.
        // 즉, 해당 View에 포함된 위젯을 사용할 때는 View내의 findVIewById()를 사용한다.
        val toast = Toast(applicationContext)
        toast.setGravity(Gravity.FILL_HORIZONTAL or Gravity.TOP, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
    }


    // 미션 1: showCustom()을 showCustom(출력할메시지)를 입력하여 토스트메시지를 출력하게 한다.
    // 미션 2: 디자인을 둥글게 적용하여 메시지를 출력해본다(background에서 지정함. 커스텀버튼예제 활용)
    // 미션 3: 출력되는 위치를 중앙으로 바꾸어본다.

}
