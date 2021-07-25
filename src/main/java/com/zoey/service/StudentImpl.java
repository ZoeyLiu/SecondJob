package com.zoey.service;

import org.apache.hadoop.ipc.ProtocolSignature;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author yining.liu@woqutech.com
 * @Date 2021/7/25 4:01 下午
 * @Description:
 */
public class StudentImpl implements Student {
    final String STUDENT_ID = "G20210735010332";
    final String STUDENT_NAME = "刘易宁";


    @Override
    public String findName(String studentId) {
        if (STUDENT_ID.equals(studentId)) {
            return STUDENT_NAME;
        }
        return null;
    }

    @Override
    public long getProtocolVersion(String s, long l) throws IOException {
        return versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return null;
    }
}
