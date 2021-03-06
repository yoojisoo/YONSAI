package kr.co.job;

import java.io.UnsupportedEncodingException;
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

import kr.co.job.domain.GoodsVO;

@Controller
public class GoodsController {
	
	
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	
	//입력폼 매핑
	@RequestMapping(value="goods/goodForm", method=RequestMethod.GET) //매핑하는거야
		public ModelAndView goodForm() { //메소드~ 어디서든 쓸꺼니까 public인거지!
		log.info("상품입력폼"); //메소드 썻다고 log로 알려줘
		ModelAndView mav = new ModelAndView();	//이걸해야 데이터를 보여줄수 있대
		
		mav.addObject("str", "그냥넣어봐");
		mav.setViewName("goods/goodForm"); //데이터 보여주는거래
		return mav; //리턴은 왜하지??
	}
	
	
	
	//입력받은 데이터 저장
	//겟파라미터를 쓰기위해서 겁나 긴거를 적었다... 그것은 바로 HTTP 어쩌구.. 리퀘스터 리스폰즈를 했다.
	//그럼 이 리퀘리폰을 써서 겟 파라미터를 쓰는데 쓰는 이유는??? 바로!!! input으로 입력받은 데이터를 가지고오기위해서!!!!
	//그래서!!! 변수 선언후!!! 대입해줌!!!
	//근데! 우리는 리턴을 mav로 하기떄문에! mav에도 넣어조야함!!!!
	//넣어줌!!!!!!!!!!!! 그럼? result에서 처리 마저해조야겠지~~~~!!!!!!!!
	//은모언니 티칭★★★★★ 무한급수
	@RequestMapping(value="goods/good", method = RequestMethod.POST)
		public ModelAndView goods1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String makeDate = request.getParameter("makeDate");
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("name", name);
		mav.addObject("price", price);
		mav.addObject("makeDate", makeDate);
		
		mav.setViewName("goods/result"); //여기로 보낼거야
		return mav;
		
	}
	
	
	
	
	@RequestMapping(value="goods/good2", method = RequestMethod.POST)
		public ModelAndView goods2(
				@RequestParam("name") String name,
				@RequestParam("price") String price,
				@RequestParam("makeDate") String makeDate
				) {
		log.info("여기찍ㄷ히나?");
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("name", name);
		mav.addObject("price", price);
		mav.addObject("makeDate", makeDate);		
		
		mav.setViewName("goods/result");
		return mav;
	}
	
	

	@RequestMapping(value="goods/good3", method=RequestMethod.POST)
	public ModelAndView goods3(
			@RequestParam Map<String, String> map) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("product", map);
		
		log.info(map.get("name"));
		mav.setViewName("goods/result");
		return mav;
	}
	
	
	
	@RequestMapping(value="goods/good4", method = RequestMethod.POST)
	
		public ModelAndView goods4(
			@ModelAttribute("mgoods") GoodsVO gvo) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("goods/result");
		return mav;
	}
	
	
	

}
