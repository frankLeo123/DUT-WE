package com.bupt.weeat;

//定义常量 有网络id
public class Constant {
    public static final String LOGTAG = "SIMPLE_EXPRESS";//日志TAG
    public static final String MALE_SEX = "male";
    public static final String FEMALE_SEX = "female";
//    public static final String APPLICATION_ID = "fd9ca1b1796c3286884114d0a3782e5f";//bmob需要APP KEY
    public static final String APPLICATION_ID = "3d438d9423ba94fc323eb73c37b6fa21";//bmob需要APP KEY
    public static final int NUM_PER_PAGE = 15;
    //三个主要模块
//        public static final String WEEK_RANK_URL = "http://192.168.0.141:8080/hello/week.php";
//    public static final String NEW_GOOD_URL = "http://192.168.0.141:8080/hello/new.php";
//    public static final String HOT_RECOMMENDATION_URL = "http://192.168.0.141:8080/hello/hot.php";
//    电脑本机ip,哪怕是一个局域网
    public static final String WEEK_RANK_URL = "http://192.168.31.129/week.php";
    public static final String NEW_GOOD_URL = "http://192.168.31.129/new.php";
    public static final String HOT_RECOMMENDATION_URL = "http://192.168.31.129/hot.php";
    //占位符已经不能用了
    public static final  String PLACEHOLDER_URL="http://igcdn-photos-f-a.akamaihd.net/hphotos-ak-xpa1/t51.2885-19/929118_455075441302693_1605108410_a.jpg";

    public static final String ZHIHU_BASIC_URL = "http://news-at.zhihu.com/api/";
    public static final String ZHIHU_LATEST = "4/news/latest";
    public static final String ZHIHU_MORE = "4/news/before/";
}
