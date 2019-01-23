package com.aitravelba.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class WeiXinValidationUtil
{
    private static final String token = "simuquanyi";

    /**
     * 
     * @param signature 微信加密验证
     * @param timestamp 时间戳
     * @param nonce 随机数
     * @return 验证成功则返回true
     */
    public static boolean checkSignature(String signature, String timestamp,
        String nonce)
    {
        // 构建字符串数组
        String[] str = new String[] { token, timestamp, nonce };

        Arrays.sort(str);

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length; i++)
        {
            sb.append(str[i]);
        }

        MessageDigest md = null;

        String result = null;

        try
        {

            md = MessageDigest.getInstance("SHA-1");

            byte[] by = md.digest(sb.toString().getBytes());

            result = byteToStr(by);

        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }

        sb = null;

        return result != null ? result.equals(signature.toUpperCase()) : false;
    }

    /**
     * 将字节数组转换成十六进制字符串
     * 
     * @param by
     * @return 返回十六进制字符串
     */
    private static String byteToStr(byte[] by)
    {

        String temp = "";

        for (int i = 0; i < by.length; i++)
        {
            temp += byteToHex(by[i]);
        }
        return temp;
    }

    /**
     * 将字节转换成十六进制字符串
     * 
     * @param b
     * @return
     */
    private static String byteToHex(byte b)
    {
        char[] digit = new char[] { '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char[] temp = new char[2];
        temp[0] = digit[(b >>> 4) & 0X0F];
        temp[1] = digit[b & 0X0F];
        return new String(temp);
    }
}
