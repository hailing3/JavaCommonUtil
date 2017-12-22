package com.mtx.javacommon.test;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by lishaoming on 17-12-8.
 */
public class TestJson {
    public static void main(String[] args) {

        JSONObject clientInfo = new JSONObject();

        JSONObject deviceInfo = new JSONObject();
        deviceInfo.put("os", "android");
        deviceInfo.put("model", "PersonalAssistant");
        deviceInfo.put("make", "xiaomi");
        clientInfo.put("deviceInfo", deviceInfo);

        JSONObject userInfo = new JSONObject();
        userInfo.put("androidId", "213123123123");
        userInfo.put("imei", "2341312313213");
        userInfo.put("connectionType", "wifi");
        userInfo.put("ip", "1.21.223.34");
        clientInfo.put("userInfo", userInfo);

        JSONObject appInfo = new JSONObject();
        appInfo.put("packageName", "com.miui.personalassistant");
        clientInfo.put("appInfo", appInfo);

        JSONObject impRequests = new JSONObject();
        impRequests.put("adsCount", "1");
        impRequests.put("width", "1000");
        impRequests.put("height", "500");
        clientInfo.put("impRequests", impRequests);

        System.out.println(clientInfo.toString());
    }

}
