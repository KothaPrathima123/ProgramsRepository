package com.pk.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class SeasonOperationsController {
	@Autowired
	private ServletContext context;
	@Autowired
	private ServletConfig config;
	/*
	 * @Autowired private ISeasonFinderService service;
	 * 
	 * @RequestMapping("/") public String showHome() { return "welcome"; }
	 * 
	 * @RequestMapping("/season") public String showSeason(Map<String,Object> map) {
	 * String msg=service.findSeason(); map.put("resultMsg", msg); return "display";
	 * }
	 */
	/*
	 * @RequestMapping("/process") public String process(Map<String,Object> map)
	 * {//best way of representing sharedmemory becoz it makes the code non-invasive
	 * System.out.println("SeasonOperationsController.process()"); map.put("attr1",
	 * "val1"); map.put("sysDt", LocalDateTime.now()); //return lvn return
	 * "show_data"; }
	 */
	/*
	 * @RequestMapping("/process") public String process(Model model) {//bad
	 * practice becoz Model(i) is spring api specific interface ie, it makes the
	 * code invasive System.out.println("SeasonOperationsController.process()");
	 * model.addAttribute("attr1","val1");
	 * model.addAttribute("sysDt",LocalDateTime.now()); //return lvn return
	 * "show_data"; }
	 */
	/*
	 * @RequestMapping("/process") public String process(ModelMap map) {//bad way
	 * becoz it makes the code invasive
	 * System.out.println("SeasonOperationsController.process()"); map.put("attr1",
	 * "val1"); map.put("sysDt", LocalDateTime.now()); //return lvn return
	 * "show_data"; }
	 */
	/*
	 * @RequestMapping("/process") public Model process() {//here lvn is request
	 * path System.out.println("SeasonOperationsController.process()"); Model
	 * model=new BindingAwareModelMap();//manually created shred mememory
	 * model.addAttribute("attr1", "val1"); model.addAttribute("sysDt",
	 * LocalDateTime.now()); //return lvn return model; }
	 */
	
	/*
	 * @RequestMapping("/process") public Map<String,Object> process() {
	 * Map<String,Object> map=new HashMap();
	 * System.out.println("SeasonOperationsController.process()"); map.put("attr1",
	 * "val1"); map.put("sysDt", LocalDateTime.now()); //return lvn return map; }
	 */
	/*
	 * @RequestMapping("/process") public ModelAndView process() {//best way of
	 * representing sharedmemory becoz it makes the code non-invasive
	 * System.out.println("SeasonOperationsController.process()"); ModelAndView
	 * mav=new ModelAndView(); mav.addObject("attr1","val1"); mav.addObject("sysDt",
	 * LocalDateTime.now()); //return lvn return mav; }
	 */
	//if handler method return type is other than string then it takes request path as rLVN
	/*
	 * @RequestMapping("/process") public String process(HttpServletRequest req) {
	 * System.out.println("SeasonOperationsController.process()"+req.hashCode());
	 * req.setAttribute("attr1", "val1"); return "redirect:report";//source handler
	 * method redirect the request to dest handler method after having network
	 * roundtrip with browser dest handler method }
	 * 
	 * @RequestMapping("/report") public String showReport(HttpServletRequest req) {
	 * System.out.println("req attribute: "+req.getAttribute("attr1"));//gives null
	 * System.out.println("SeasonOperationsController.showReport()");
	 * System.out.println("web app context path: "+context.getContextPath());
	 * System.out.println("DS logical name: "+config.getServletName()); return
	 * "show_data"; }
	 *///if any parameters are not there in the list of allowed parametrs of handler method and the obj is avaliable in DS then go for autowired otherwise take them as param type of the handler methods
	//ex: request,response,HttpSession,SharedMemory(BindingAwareModelMap) and etc. as param types
	//generally the objects that are spe cific to each req directly or indirectly take them as handler method args simillarly the objs that are 
	//visible accross multiple requests take them as @Autowired based injections
	
	@RequestMapping("/process")
	public void process(HttpServletResponse res) throws Exception {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");//since pw is used to write msg to browser directky so the option of taking req path name as LVN is gone
		pw.println("<b>dircetly from handler method without using view resolver and view comps");
		//res.setHeader("Content-Disposition","attachment;fileName=abc.html");
	}
	
	
	
	
	
	
	
	
}
