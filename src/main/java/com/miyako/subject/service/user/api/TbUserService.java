package com.miyako.subject.service.user.api;

import com.github.pagehelper.PageInfo;
import com.miyako.subject.commons.domain.TbStudent;

import java.util.List;

public interface TbUserService{

    public List<TbStudent> selectAll();

    public TbStudent selectById(Integer id);

    public Integer insert(TbStudent tbStudent);

    public PageInfo<TbStudent> page(int pageNum, int pageSize);
}
