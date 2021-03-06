package kr.co.job.domain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class Exam {
	
	private static Logger log = LoggerFactory.getLogger(Exam.class);
	
	//요청
	@RequestMapping(value = "login/login5", method = RequestMethod.POST)
	public ModelAndView login5(@RequestParam("userID") String userID,
			@RequestParam ("userName") String userName,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
			request.setCharacterEncoding("UTF-8");
			log.info("로그인 데이터 처리");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("userID", userID);
			mav.addObject("userName", userName);
			
			
	//디스패치
			mav.setViewName("login/result");
			
			return mav;
	}
	
	
	
	
	

}
