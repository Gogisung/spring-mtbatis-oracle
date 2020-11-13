package com.example.MyBatis.dao;

import com.example.MyBatis.vo.EnterpriseMemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginDao {
    public List<EnterpriseMemberVo> selectListEnterpriseMember(EnterpriseMemberVo enterpriseMemberVo);
}
