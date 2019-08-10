package com.miyako.subject.service.user.api;

import com.github.pagehelper.PageInfo;
import com.miyako.subject.commons.domain.TbStudent;

import java.util.List;

public interface TbUserService{

    public List<TbStudent> selectAll();

    public TbStudent selectById(Integer id);

    public TbStudent selectOne(TbStudent tbStudent);

    public Integer insert(TbStudent tbStudent);

    public PageInfo<TbStudent> page(int pageNum, int pageSize);


    public TbStudent getByToken(String token);
}
