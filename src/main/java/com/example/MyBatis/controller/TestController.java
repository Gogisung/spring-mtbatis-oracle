package com.example.MyBatis.controller;

import com.example.MyBatis.service.LoginService;
import com.example.MyBatis.vo.EnterpriseMemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/member")
    public @ResponseBody
    List<EnterpriseMemberVo> selectListEnterpriseMember(@ModelAttribute("searchVO") EnterpriseMemberVo enterpriseMemberVo, ModelMap model) throws Exception {
        List<EnterpriseMemberVo> eList = loginService.selectListEnterpriseMember(enterpriseMemberVo);
        System.out.println("eList = " + eList);
        return eList;
    }
}
