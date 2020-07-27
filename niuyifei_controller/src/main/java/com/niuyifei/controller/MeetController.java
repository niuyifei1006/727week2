package com.niuyifei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.niuyifei.bean.Meet;
import com.niuyifei.bean.Type;
import com.niuyifei.service.MeetService;

@Controller
public class MeetController {
	
	@Resource
	private MeetService meetService;
	
	@RequestMapping("selMeet")
	public String selmeet(Model model,@RequestParam(defaultValue="1")Integer pageNum){
		PageHelper.startPage(pageNum, 3);
		List<Meet> list = meetService.selMeet();
		PageInfo<Meet> page = new PageInfo<Meet>(list);
		model.addAttribute("page", page);
		return "list";
	}
	
	//xÏÂÀ­¿ò
	@RequestMapping("findType")
	@ResponseBody
	public List<Type> findtype(Model model){
		List<Type> meet = meetService.selType();
		model.addAttribute("meet", meet);
		return meet;
	}
	
	@RequestMapping("addMeet")
	public boolean addmeet(Meet meet){
		try {
			meetService.addMeet(meet);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	@RequestMapping("updateMeet")
	public boolean updatemeet(Meet meet){
		try {
			meetService.update(meet);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
