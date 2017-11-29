package com.bwie.test.utils;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

import com.bwie.test.R;

/**
 * Created by 1 on 2017/11/3.
 */

public class MyBitmapUtils {
    private NetCacheUtils mNetCacheUtils;
    private LocalCacheUtils mLocalCacheUtils;
    private MemoryCacheUtils mMemoryCacheUtils;

    public MyBitmapUtils(){
        mMemoryCacheUtils=new MemoryCacheUtils();
        mLocalCacheUtils=new LocalCacheUtils();
        mNetCacheUtils=new NetCacheUtils(mLocalCacheUtils,mMemoryCacheUtils);
    }
    public void disPlay(ImageView ivPic, String url) {
        ivPic.setImageResource(R.mipmap.ic_launcher);
        Bitmap bitmap;
        //内存缓存
        bitmap=mMemoryCacheUtils.getBitmapFromMemory(url);
        if (bitmap!=null){
            Log.i("xxx","这里是内存");
            ivPic.setImageBitmap(bitmap);
            System.out.println("从内存获取图片啦.....");
            return;
        }
      //  Log.i("xxx","第一个是空的");
        //本地缓存
        bitmap = mLocalCacheUtils.getBitmapFromLocal(url);
       /* if(bitmap !=null){
            ivPic.setImageBitmap(bitmap);
            System.out.println("从本地获取图片啦.....");
            //从本地获取图片后,保存至内存中
            mMemoryCacheUtils.setBitmapToMemory(url,bitmap);
            return;
        }*/
        //网络缓存
        mNetCacheUtils.getBitmapFromNet(ivPic,url);
    }

}
