package com.zlj.zl.user.patentTypeStatistics.service;

import com.zlj.zl.util.resultJson.ResponseResult;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public interface PatentTypeStatisticsService {

    ResponseResult<String> exp(String basePath, String outPath, String a, String b, String c) throws Exception;
}
