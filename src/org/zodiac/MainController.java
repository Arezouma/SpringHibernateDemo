package org.zodiac;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value="insert",method=RequestMethod.GET)
	public String insert(HttpServletRequest request) {
		int accno = Integer.parseInt(request.getParameter("t1"));
		String acctype = request.getParameter("t2");
		double balance = Double.parseDouble(request.getParameter("t3"));
		request.setAttribute("id", accno);
		request.setAttribute("type", acctype);
		request.setAttribute("bal", balance);
		return "insert";
	}

	@RequestMapping(value="show",method=RequestMethod.GET)
	public String show() {
		return "show";
	}

	@RequestMapping(value="showBalance",method=RequestMethod.GET)
	public String showBalance(HttpServletRequest request) {
		int accno = Integer.parseInt(request.getParameter("t1"));
		request.setAttribute("id", accno);
		return "showBalance";
	}

}