package com.bwie.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bwie.test.bean.UserBean;
import com.bwie.test.utils.MyBitmapUtils;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* imageView = (ImageView)findViewById(R.id.image);
        String path = "http://www.quanjing.com/image/2017index/lx1.png";
        MyBitmapUtils myBitmapUtils = new MyBitmapUtils();
        myBitmapUtils.disPlay(imageView,path);*/

        UserBean<String> userBean = new UserBean<>("asdf");
        Log.i("xxx",userBean.getVar());
        UserBean<Integer> userBean1 = new UserBean<>(1233);
        Log.i("xxx",userBean1.getVar()+"");

    }
}
