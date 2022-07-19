package com.xworkz.onlineshopping.service;

import com.xworkz.onlineshopping.dto.OnlineShoppingDTO;
import com.xworkz.onlineshopping.excepetion.InvalidDataException;

public interface OnlineShoppingService {

	boolean validateAndSave(OnlineShoppingDTO shoppingDTO)throws InvalidDataException;
}
