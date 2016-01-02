package com.hnyer.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.hnyer.filePathSelect.R;

public class MainAcivity extends BaseActivity {

	
	public static final int FILE_RESULT_CODE = 1;
	
	private TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button button = (Button)findViewById(R.id.button) ;
		textView = (TextView)findViewById(R.id.fileText);
		button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(MainAcivity.this,MyFileManager.class);
				startActivityForResult(intent, FILE_RESULT_CODE);
			}
		});
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(FILE_RESULT_CODE == requestCode){
			Bundle bundle = null;
			if(data!=null&&(bundle=data.getExtras())!=null){
				textView.setText("选中的路径= "+bundle.getString("file"));
			}
		}
	}

 
}
