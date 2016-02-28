package com.blanke.solebook.constants;

import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

/**
 * Created by blanke on 16-2-21.
 */
public class Constants {

    public static final String APPID_AVOS = "l8eot9jDXBhCt40q1BPJqH9a-gzGzoHsz";
    public static final String APPKEY_AVOS = "fAYpLpd3IBwlaiixg0bM20Rm";
    public static final String APPID_SINA = "1550326405";
    public static final String APPID_QQ = "1105114711";
    public static final String APPSEC_QQ = "uI7mVrh73fpKMuua";
    public static final String APPSEC_SINA = "8d766414552a564a15bc4db2bbacc437";
    public static final String REDIRECTURL_SINA = "https://leancloud.cn/1.1/sns/callback/1k4u78lawq2pvrjr";
    public static final String REDIRECTURL_QQ = "https://leancloud.cn/1.1/sns/callback/lljmk2jy0vqme5vh";
    public static final String CLOUD_MOTHOD_SEARCH_KEY="cloud_search_key";
    public static final String CLOUD_MOTHOD_SEARCH_ISBN="cloud_search_isbn";
    public static final long DAY_AGE = 24 * 60 * 60 * 1000;
    public static final int PAGE_COUNT = 20;
    private static DisplayImageOptions options;
    public static final int TYPE_COLUMN_BOOK=1;
    public static final long LAZY_DELAY_TIME=500;
    public static String getSinaIconUrl(String uid) {
        return "http://tp1.sinaimg.cn/" + uid + "/180/0/1";
    }

    public static DisplayImageOptions getImageOptions() {
        if (options != null) {
            return options;
        }
        options = new DisplayImageOptions.Builder()
//                .showImageOnLoading(R.drawable.load) //设置图片在下载期间显示的图片
//                .showImageForEmptyUri(R.drawable.load)//设置图片Uri为空或是错误的时候显示的图片
//                .showImageOnFail(R.drawable.load)  //设置图片加载/解码过程中错误时候显示的图片
                .cacheInMemory(true)//设置下载的图片是否缓存在内存中
                .cacheOnDisk(true)
                .considerExifParams(true)  //是否考虑JPEG图像EXIF参数（旋转，翻转）
                .imageScaleType(ImageScaleType.NONE)//设置图片以如何的编码方式显示
                .bitmapConfig(Bitmap.Config.RGB_565)//设置图片的解码类型//
                .resetViewBeforeLoading(true)//设置图片在下载前是否重置，复位
                .displayer(new RoundedBitmapDisplayer(20))//是否设置为圆角，弧度为多少
                .displayer(new FadeInBitmapDisplayer(1000))//是否图片加载好后渐入的动画时间
                .build();//构建完成
        return options;
    }
}