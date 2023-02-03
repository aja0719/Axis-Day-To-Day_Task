package com.axis.Contoller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class WebService {
    @GetMapping("Notify")
	public String getNotify() {
    	return "Your notification is recieved successfully!";
    }
}
