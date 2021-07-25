package com.zoey.service;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.*;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author yining.liu@woqutech.com
 * @Date 2021/7/25 4:06 下午
 * @Description:
 */
public class ServiceApplication {
    public static final String SERVER_ADDRESS = "localhost";
    public static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        RPC.Builder builder = new RPC.Builder(new Configuration());

        builder.setBindAddress(SERVER_ADDRESS);
        builder.setPort(SERVER_PORT);

        builder.setProtocol(Student.class);
        builder.setInstance(new StudentImpl());

        try {
            RPC.Server build = builder.build();
            build.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
