package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ControllerImpl {
	
	@RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("request",new RevealRequest());
        return "index";
    }
     
    @RequestMapping("/next")
    public String next(@ModelAttribute("request") RevealRequest request,Model model) {
    	model.addAttribute("message", "You are in new page !!");
        return "next";
    }
    
//    @RequestMapping(value={"/gc/reveal","/gc/reveal/{claimcode}","/gc/reveal/{claimcode}/{asin}"})
    @RequestMapping(value={"/gc/reveal","/gc/reveal/{claimcode}","/gc/reveal/{claimcode}/{asin}","/gc/reveal/**"})
    public String reveal(@ModelAttribute("request") RevealRequest request,
			    		Model model) {
    	System.out.println("ClaimCode: "+request.getClaimcode());
    	System.out.println("asin: "+request.getAsin());
    	model.addAttribute("message", "You are in new page !! "+request.getClaimcode()+", "+request.getAsin());
        return "next";
    }
    
//    @RequestMapping(value={"/gc/reveal/{claimcode}/{asin}"})
//    public String revealgc(@ModelAttribute("request") RevealRequest request,@PathVariable("claimcode")String claimcode,@PathVariable("asin")String asin, Model model) {
//        request.setClaimcode(claimcode);
//        request.setAsin(asin);
//        System.out.println("ClaimCode: "+request.getClaimcode());
//    	System.out.println("asin: "+request.getAsin());
//    	return "redirect:/gc/reveal";
//    }
    
    
}
