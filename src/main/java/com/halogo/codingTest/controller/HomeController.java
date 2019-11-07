/**
 * 
 */
package com.halogo.codingTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.halogo.codingTest.utils.APIUtilConstants;
/**
 * @author Aditya
 *
 */

@Controller
public class HomeController {

	@RequestMapping(APIUtilConstants.URI_HOME)
	public String home() {
		return "index";
	}
}



