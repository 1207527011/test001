package com.itheima.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * springmvc入门控制器
 * @author XZW
 *
 */
@Controller
public class HelloController {
	@RequestMapping(value="hello")
	public ModelAndView hello(){
		//创建ModelAndView对象
		ModelAndView view = new ModelAndView();
		//设置模型数据
		view.addObject("msg","hello springmvc......");
		//设置视图名字
		view.setViewName("hello");
		return view;
	}
}
