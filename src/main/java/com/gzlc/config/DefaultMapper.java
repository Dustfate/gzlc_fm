package com.gzlc.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public class DefaultMapper<T> extends Mapper<T>, MySqlMapper<T>{

}
