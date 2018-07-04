package com.itheima.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.pojo.Item;

/**
 * springmvc入门控制器
 * @author XZW
 *
 */
@Controller
public class ItemController {
	@RequestMapping(value="itemList")
	public ModelAndView hello(){
		//创建ModelAndView对象
		ModelAndView view = new ModelAndView();
		//构建商品模型数据
		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item(1, "IpX", 8999.0,new Date(),"装逼神器1。。"));
		itemList.add(new Item(2, "Ip7", 5999.0,new Date(),"装逼神器2。。"));
		itemList.add(new Item(3, "Ip5", 4999.0,new Date(),"装逼神器3。。"));
		itemList.add(new Item(4, "Ip6", 3999.0,new Date(),"装逼神器4。。"));
		itemList.add(new Item(5, "Ip4", 2999.0,new Date(),"装逼神器5。。"));
		//设置视图名字
		view.addObject("itemList", itemList);
		view.setViewName("itemList");
		return view;
	}
}
