package com.smart.melo.hotrepaire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //文档地址https://bugly.qq.com/docs/user-guide/instruction-manual-android-hotfix/?v=20170517185032

    String str;
    Button mButton;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton= (Button) findViewById(R.id.btn_click);
        mTextView= (TextView) findViewById(R.id.tv_content);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(TestClass.getString());
            }
        });


    }
}
