package kr.co.job;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jdk.internal.org.jline.utils.Log;
import kr.co.job.domain.LoginVO;

@Controller
public class LoginController {
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	
	// ModelAndView 클래스를 이용한 매핑
	@RequestMapping(value = "login/loginForm", method = RequestMethod.GET)
	public ModelAndView loginForm() {
		log.info("여기는 로그인폼 이동입니다.");
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("str", "Hello"); //모델 데이터
		mav.setViewName("login/loginForm"); // view 이동(*.jsp) : 디스패치
		return mav;
	}
	
	
	//첫번째 - 순수방식..
	@RequestMapping(value = "login/login", method = RequestMethod.POST)
//	public ModelAndView login() { //원형
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception { //초창기 버전 엄청 길다
		log.info("로그인 데이터를 해보자");
		request.setCharacterEncoding("UTF-8");
		ModelAndView mav = new ModelAndView();
		String userID = request.getParameter("userID");
		String userName = request.getParameter("userName");
		
		mav.addObject("userID", userID);
		mav.addObject("userName", userName);
		mav.setViewName("login/result"); // view... 결과값으로 이동(*.jsp) : 디스패치
		return mav;
		
	}
	//rquest전달하는 방법2
	//@RequestParam //나중엔 DO 날리겠지~~
	@RequestMapping(value = "login/login2", method = RequestMethod.POST)
	public ModelAndView login2(@RequestParam("userID") String userID,
			@RequestParam("userName") String userName,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		log.info("로그인 데이터를 해보자");
		ModelAndView mav = new ModelAndView();
//		String userID = request.getParameter("userID");
//		String userName = request.getParameter("userName");
		
		mav.addObject("userID", userID);
		mav.addObject("userName", userName);
		mav.setViewName("login/result");
		return mav;
		
	}
	
	
	//rquest전달하는 방법3
	//requestParam map<>
	@RequestMapping(value = "login/login3", method = RequestMethod.POST)
	public ModelAndView login3(@RequestParam Map<String, String> info, //봉지이름이 info
			HttpServletRequest request,
			HttpServletResponse response) throws Exception { //초창기 버전 엄청 길다
		log.info("로그인 데이터를 해보자");
		request.setCharacterEncoding("UTF-8");
		
		// Map info에 제대로 있는지 확인해보기
		log.info("아이디 : " + info.get("userID"));
		log.info("이름 : " + info.get("userName"));
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("info", info); // model info로 해서 저장
		mav.setViewName("login/result");

		return mav;
	
		
	}
	
	
	//rquest전달하는 방법4
	//@ModelAttribute
	@RequestMapping(value = "login/login4", method = RequestMethod.POST)
	public ModelAndView login4(@ModelAttribute("loginvo")LoginVO loginvo) {
		ModelAndView mav = new ModelAndView();
		
		
		mav.setViewName("login/result");
		return mav;
	}

	
	
}
