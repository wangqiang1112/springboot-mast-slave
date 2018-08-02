package com.antsoft.database;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Administrator on 2018/8/1.
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
