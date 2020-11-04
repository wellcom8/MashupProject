package com.map.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.map.service.MainService;

@Controller
public class MainController {
	Logger logger = (Logger) LogManager.getLogger(this.getClass());
	
	@Resource(name="mainService")
	private MainService mainService;
	
	@RequestMapping(value="/map/openMapMain.do")
	public ModelAndView openSampleList() throws Exception {
		ModelAndView mv = new ModelAndView("/openMapMain");

		return mv;
	}
	
	@RequestMapping(value="/map/getDataList.do")
	public @ResponseBody List<String> getDataList() throws Exception {
		return mainService.getDataList();
    }
}
