package com.atguigu.azkaban;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author pati_xw
 * @create 2021-03-26 13:53
 */
public class AzkabanTest {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/opt/module/datas/output.txt");
            fos.write("this is a java progress".getBytes());
            fos.write("this is a java progress".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
