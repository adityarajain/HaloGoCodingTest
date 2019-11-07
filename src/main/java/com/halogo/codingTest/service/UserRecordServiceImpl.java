/**
 * 
 */
package com.halogo.codingTest.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.halogo.codingTest.dto.UserRecordDTO;
import com.halogo.codingTest.entity.UserRecord;
import com.halogo.codingTest.repository.UserRecordRepository;
import com.halogo.codingTest.utils.NumberTranslationUtil;

/**
 * @author Aditya
 *
 */
@Service
public class UserRecordServiceImpl implements UserRecordService {

	@Autowired
	UserRecordRepository userRecordRepository;
	
	@Override
	public UserRecordDTO getUserRecordDTO(Integer id) {
		UserRecord userRecord = userRecordRepository.findById(id);
		return convertToEngRepresentation(userRecord);
	}

	private UserRecordDTO convertToEngRepresentation(UserRecord userRecord) {
		UserRecordDTO userRecordDTO = new UserRecordDTO();
		
		userRecordDTO.setName(userRecord.getName());
		userRecordDTO.setEngRepresentation(NumberTranslationUtil.convert(userRecord.getNumberValue()));
		return userRecordDTO;
	}

	@Override
	public Integer saveUser(UserRecord userRecord) {
		UserRecord userRec = userRecordRepository.save(userRecord);
		return userRec.getId();
	}
	
}
