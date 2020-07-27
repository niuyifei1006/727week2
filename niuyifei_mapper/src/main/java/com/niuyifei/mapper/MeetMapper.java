package com.niuyifei.mapper;

import java.util.List;

import com.niuyifei.bean.Meet;
import com.niuyifei.bean.Type;

public interface MeetMapper {
	//列表
	public List<Meet> selMeet();
	//分类-下拉框
	public List<Type> selType();
	//+
	public void addMeet(Meet meet);
	
	public void update(Meet meet);
}
