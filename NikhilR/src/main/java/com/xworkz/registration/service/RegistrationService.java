package com.xworkz.registration.service;

import com.xworkz.exception.InvalidDataException;
import com.xworkz.registration.dto.RegistrationDTO;

public interface RegistrationService {

	public boolean validateAndSave(RegistrationDTO registration) throws InvalidDataException;
}
