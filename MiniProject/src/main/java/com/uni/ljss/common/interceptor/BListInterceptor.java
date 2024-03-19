package com.uni.ljss.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.uni.ljss.member.model.dto.Member;

import ch.qos.logback.classic.Logger;

public class BListInterceptor extends HandlerInterceptorAdapter{
	private static final Logger logger=(Logger) LoggerFactory.getLogger(BListInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		Member loginUser = (Member)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			logger.info("비로그인 상태에서 [ "+ request.getRequestURI() + " ] 접근시도 !!");
			
			session.setAttribute("mess", "로그인 후 이용하세요");
			response.sendRedirect("/spring");
			return false;
		}
		
		return true;
	}
	
	
	
	

}
