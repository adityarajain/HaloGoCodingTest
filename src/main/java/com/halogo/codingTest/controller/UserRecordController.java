/**
 * 
 */
package com.halogo.codingTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.halogo.codingTest.dto.UserRecordDTO;
import com.halogo.codingTest.entity.UserRecord;
import com.halogo.codingTest.service.UserRecordService;
import com.halogo.codingTest.utils.APIUtilConstants;

/**
 * @author Aditya
 *
 */
@RequestMapping(APIUtilConstants.URI_USERRECORD)
@RestController
public class UserRecordController {

	@Autowired
	UserRecordService userRecordService;
	
	@RequestMapping(APIUtilConstants.URI_GET_USERRECORD_DETAIL)
	public UserRecordDTO getUserRecordByName(@RequestParam("id") Integer id){
		return userRecordService.getUserRecordDTO(id);
	}
	
	@RequestMapping(APIUtilConstants.URI_USERRECORD_SAVE_USER)
	public Integer saveUser(@RequestBody UserRecord userRecord){
		return userRecordService.saveUser(userRecord);
	}
}
