package com.example.MyBatis.service;

import com.example.MyBatis.dao.LoginDao;
import com.example.MyBatis.vo.EnterpriseMemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    LoginDao loginDao;

    @Override
    public List<EnterpriseMemberVo> selectListEnterpriseMember(EnterpriseMemberVo vo){
        System.out.println("getEntrprsSeCode = " + vo.getEntrprsSeCode());
        return loginDao.selectListEnterpriseMember(vo);
    }
}
