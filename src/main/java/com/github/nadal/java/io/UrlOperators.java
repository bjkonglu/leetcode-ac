package com.github.nadal.java.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Author: lukong
 * Date: 2019-03-31
 * Description:
 */
public class UrlOperators {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.baidu.com");

        InputStream inputStream = url.openStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
