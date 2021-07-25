package com.zoey.service;

import org.apache.hadoop.ipc.VersionedProtocol;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author yining.liu@woqutech.com
 * @Date 2021/7/25 3:54 下午
 * @Description:
 */
public interface Student extends VersionedProtocol {
    long versionID = 1L;

    String findName(String studentId);
}
