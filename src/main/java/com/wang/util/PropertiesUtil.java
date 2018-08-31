package com.wang.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * TODO：PropertiesUtil获取配置信息
 * @author Wang926454
 * @date 2018/8/31 17:29
 */
public class PropertiesUtil {

    /**
     * PROP
     */
    private static final Properties PROP = new Properties();

    /**
     * TODO：读取配置文件
     * @param fileName
     * @return void
     * @author Wang926454
     * @date 2018/8/31 17:29
     */
    public static void readProperties(String fileName){
        try {
            InputStream in = PropertiesUtil.class.getResourceAsStream("/" + fileName);
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            PROP.load(bf);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * TODO：根据key读取对应的value
     * @param key
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/8/31 17:29
     */
    public static String getProperty(String key){
        return PROP.getProperty(key);
    }
}
