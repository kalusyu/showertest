package com.example.test;


import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;

public class MainActivity extends Activity{
	
	PopupWindow mColorPop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initColorPop();
	}

	private void initColorPop() {
		View dateView = getLayoutInflater().inflate(R.layout.color_main_ui_layout, null);
//		initEditModelUI(dateView);
		mColorPop = new PopupWindow(dateView,
				android.app.ActionBar.LayoutParams.WRAP_CONTENT,
				android.app.ActionBar.LayoutParams.WRAP_CONTENT);
		mColorPop.setBackgroundDrawable(getResources().getDrawable(
				R.drawable.dengbiaoyanse_bai_normal)); 
		mColorPop.getBackground().setAlpha(0);
		mColorPop.setOutsideTouchable(false); // set false

		// use system animation
		mColorPop.setAnimationStyle(android.R.style.Animation_Dialog);
		mColorPop.update();
		mColorPop.setTouchable(true);
		mColorPop.setFocusable(true);
	}
	
	public void show(View v){
		mColorPop.showAtLocation(v, Gravity.BOTTOM, 100, 100);
	}
}
