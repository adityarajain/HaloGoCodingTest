/**
 * 
 */
package com.halogo.codingTest.service;

import com.halogo.codingTest.dto.UserRecordDTO;
import com.halogo.codingTest.entity.UserRecord;


/**
 * @author Aditya
 *
 */
public interface UserRecordService {

	public UserRecordDTO getUserRecordDTO(Integer id);

	public Integer saveUser(UserRecord userRecord);

}
