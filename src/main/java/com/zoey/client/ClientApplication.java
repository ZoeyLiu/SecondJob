package com.zoey.client;

import com.zoey.service.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author yining.liu@woqutech.com
 * @Date 2021/7/25 4:12 下午
 * @Description:
 */
public class ClientApplication {


    public static void main(String[] args) throws IOException {
        Student proxy = RPC.getProxy(Student.class, 1L,
                new InetSocketAddress(ServiceApplication.SERVER_ADDRESS, ServiceApplication.SERVER_PORT),
                new Configuration());
        String result = proxy.findName("98586");
        System.out.println(result);
        result = proxy.findName("G20210735010332");
        System.out.println(result);
        RPC.stopProxy(proxy);
    }
}
