package com.wangfan.baseapplication.util;


public class Config {
    public static final String[] ECHO_TEXT_ARRAY = {
            "在呢",
            "我在",
            "在"
    };
    public static final String[] SMIULATEKEY_REPLY = {
            "好的",
            "好",
            "OK"
    };
    public static final String[] MODE_NAME_ARRAY = {
            "哔湾应用接口模式",
            "哔湾智慧家居模式",
            "哔湾人工智能模式",
            "养老中心模式",
            "按键模拟模式"
    };

    public static final String SHAREDPREFRENCES_NAME = "com.jinxin.beoneaid";

    public static class ModeSetting{
        public static final String API_MODE = "api_mode";
        public static final String SMARTHOMR_MODE = "smarthome_mode";
        public static final String AIUI_MODE = "aiui_mode";

        public static final String API_MODE_DEFULT_ORDER = "中国中国";
        public static final String SMARTHOMR_MODE_DEFULT_ORDER = "中国";
        public static final String AIUI_MODE_DEFULT_ORDER = "美国";
    }

}