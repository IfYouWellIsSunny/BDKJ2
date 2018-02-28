package com.example.dell.bdkj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.bugly.Bugly;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText index_edit_tel;
    private EditText index_edit_pass;
    private TextView index_forget;
    private TextView index_login;
    private Button index_enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题栏
        getSupportActionBar().hide();
        //加载布局
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();

    }

    private void initView() {
        index_edit_tel = (EditText) findViewById(R.id.index_edit_tel);
        index_edit_pass = (EditText) findViewById(R.id.index_edit_pass);
        index_forget = (TextView) findViewById(R.id.index_forget);
        index_login = (TextView) findViewById(R.id.index_login);
        index_enter = (Button) findViewById(R.id.index_enter);
        //点击事件
        index_forget.setOnClickListener(this);
        index_login.setOnClickListener(this);
        index_enter.setOnClickListener(this);
    }

    //点击事件
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.index_enter:
                submit();//判断输入框是否为空
                break;
            case R.id.index_forget:
                Toast.makeText(this, "忘记密码", Toast.LENGTH_SHORT).show();
                break;
            case R.id.index_login:
                Toast.makeText(this, "注册账号", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //判定输入框是否为空
    private void submit() {
        String tel = index_edit_tel.getText().toString().trim();
        if (TextUtils.isEmpty(tel)) {
            Toast.makeText(this, "请输入手机号/QQ邮箱", Toast.LENGTH_SHORT).show();
            return;
        }
        String pass = index_edit_pass.getText().toString().trim();
        if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
