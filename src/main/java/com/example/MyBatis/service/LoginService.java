package com.example.MyBatis.service;

import com.example.MyBatis.vo.EnterpriseMemberVo;

import java.util.List;

public interface LoginService {
    List<EnterpriseMemberVo> selectListEnterpriseMember(EnterpriseMemberVo vo);
}
