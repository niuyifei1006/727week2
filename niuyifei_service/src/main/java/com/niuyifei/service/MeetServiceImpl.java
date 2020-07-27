package com.niuyifei.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.niuyifei.bean.Meet;
import com.niuyifei.bean.Type;
import com.niuyifei.mapper.MeetMapper;
@Service
public class MeetServiceImpl implements MeetService {

	@Resource
	private MeetMapper meetMapper;
	
	public List<Meet> selMeet() {
		// TODO Auto-generated method stub
		return meetMapper.selMeet();
	}

	public List<Type> selType() {
		// TODO Auto-generated method stub
		return meetMapper.selType();
	}

	public void addMeet(Meet meet) {
		// TODO Auto-generated method stub
		meetMapper.addMeet(meet);
	}

	public void update(Meet meet) {
		// TODO Auto-generated method stub
		meetMapper.update(meet);
	}

}
