package com.range.demo.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ShellExcute {
   static Process p = null;
    public static String Exec(String cmdStr) throws IOException {
        try {
            //执行系统命令
            p= Runtime.getRuntime().exec(cmdStr);
            p.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ConvertsUtils.InputStreamToString(p.getInputStream());
    }


    public static String Exec(String[] cmdStr) throws IOException {

        try {
            //执行系统命令
             p= Runtime.getRuntime().exec(cmdStr);
            p.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ConvertsUtils.InputStreamToString(p.getInputStream());
    }

    public static String Start(List<String> cmdStr) throws IOException {
        try {
            ProcessBuilder processBuilder=new ProcessBuilder(cmdStr);
            p=processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ConvertsUtils.InputStreamToString(p.getInputStream());
    }

}
