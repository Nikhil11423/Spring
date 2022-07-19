package com.xworkz.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.onlineshopping.dao.OnlineShoppingDAO;
import com.xworkz.onlineshopping.dto.OnlineShoppingDTO;
import com.xworkz.onlineshopping.excepetion.InvalidDataException;

import lombok.ToString;

@Component
@ToString
public  class OnlineShoppingServiceImpl implements OnlineShoppingService {

	@Autowired
	private OnlineShoppingDAO dao;

	@Override
	public boolean validateAndSave(OnlineShoppingDTO shoppingDTO) throws InvalidDataException {
		if (shoppingDTO != null) {

			String product = shoppingDTO.getProduct();
			if (product != null && product.length() > 3 && product.length() < 30) {
				System.out.println("product is valid");
			} else {
				System.out.println("product is invalid");
				throw new InvalidDataException("Enter the valid data");
			}

			String type = shoppingDTO.getType();
			if (type != null && type.length() > 3 && type.length() < 30) {
				System.out.println("type is valid");
			} else {
				System.out.println("type is invalid");
				throw new InvalidDataException("Enter the valid data");
			}

			double price = shoppingDTO.getPrice();
			if (price != 0 && price >= 1000 && price <= 30000) {
				System.out.println("price is valid");
			} else {
				System.out.println("price is invalid");
				throw new InvalidDataException("Enter the valid data");
			}

			int quantity = shoppingDTO.getQuantity();
			if (quantity != 0 && quantity >= 1 && quantity <= 4) {
				System.out.println("quantity is valid");
			} else {
				System.out.println("quantity is invalid");
				throw new InvalidDataException("Enter the valid data");
			}

			String payment = shoppingDTO.getPaymentMode();
			if (payment != null && payment.length() > 3 && payment.length() < 30) {
				System.out.println("payment is valid");
			} else {
				System.out.println("payment is invalid");
				throw new InvalidDataException("Enter the valid data");
			}

			String discount = shoppingDTO.getDiscount();
			if (discount != null && discount.length() > 3 && discount.length() < 50) {
				System.out.println("discount is valid");
			} else {
				System.out.println("discount is invalid");
				throw new InvalidDataException("Enter the valid data");
			}

			int gst = shoppingDTO.getGstPercent();
			if (gst == 5) {
				System.out.println("food gst is valid");
				throw new InvalidDataException("Enter the valid data");
			}
			if (gst == 12) {
				System.out.println("medicine gst is valid");
				throw new InvalidDataException("Enter the valid data");
			}
			if (gst == 18) {
				System.out.println("electronics gst is valid");
				throw new InvalidDataException("Enter the valid data");
			}
			if (gst == 8) {
				System.out.println("furniture gst is valid");
			} else {
				System.out.println("gst is invalid");
				throw new InvalidDataException("Enter the valid data");
			}

			boolean saved = dao.save(shoppingDTO);
			return saved;

		}
		return false;
	}

}
