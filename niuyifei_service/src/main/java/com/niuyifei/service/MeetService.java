package com.niuyifei.service;

import java.util.List;

import com.niuyifei.bean.Meet;
import com.niuyifei.bean.Type;

public interface MeetService {
	public List<Meet> selMeet();
	//����-������
	public List<Type> selType();
	//+
	public void addMeet(Meet meet);
	
	public void update(Meet meet);
}
