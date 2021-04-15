package com.range.demo.utils;


import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.buf.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;


public class ConvertsUtils {
    //https://www.cnblogs.com/javajetty/p/10684957.html
    public static String InputStreamToString(InputStream in) throws IOException {
        StringWriter writer = new StringWriter();
        IOUtils.copy(in, writer, "utf-8");
        String theString = writer.toString();
        return theString;
    }

    public static String ArrayToString(String[] arraystr) {
        return StringUtils.join(arraystr);
    }
}
