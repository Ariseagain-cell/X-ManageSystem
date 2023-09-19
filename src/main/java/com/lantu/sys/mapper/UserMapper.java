package com.lantu.sys.mapper;

import com.lantu.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.awt.print.PrinterGraphics;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhangweihao
 * @since 2023-07-23
 */
public interface UserMapper extends BaseMapper<User> {

    public List<String> getRoleNameByUserId(Integer userId);
}
