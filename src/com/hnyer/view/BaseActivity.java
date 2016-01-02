package com.hnyer.view;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


/**
 * @类名: BaseActivity.java
 * @描述: 全部activity的基类，用来 自定义一些基本的特性 。
 * @开发人员： Administrator
 * @创建时间： 2014-7-21 上午11:12:01
 * @版本： V1.0
 * @版权信息： 
 */

public class BaseActivity extends Activity  {
//	TipWindow tipWindow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 要在setContentView之前设置，否则会异常。
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		/* 全屏显示 */
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// 指定使用竖屏模式， 在xml配置 失效了（可能是因为屏幕适配重新加载计算的原因），只能代码指定了.
				setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//		tipWindow = new TipWindow( this);
	}

	 
 
	

	
//	
//	┏┛┻━━━┛┻┓
//	┃｜｜｜｜｜｜｜┃
//	┃　　　━　　　┃
//	┃　┳┛ 　┗┳ 　┃
//	┃　　　　　　　┃
//	┃　　　┻　　　┃
//	┃　　　　　　　┃
//	┗━┓　　　┏━┛
//	　　┃　 　┃　
//	　　┃　 　┃　　神兽镇压 ，代码无 BUG !
//	　　┃　 　┃　　 
//	　　┃　 　┃ 
//	　　┃　　　┗━━━┓
//	　　┃                            ┣┓
//	　　┃                                ┃
//	　　┗┓┓┏━┳┓┏┛
//	　　　┃┫┫　┃┫┫
//	　　　┗┻┛　┗┻┛


}
