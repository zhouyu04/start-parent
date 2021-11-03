package com.zzyy.start.mapper;

import com.zzyy.start.entity.SysLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AopLogMapper {

    void saveSysLog(SysLog syslog);
}
