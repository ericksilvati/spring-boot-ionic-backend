package com.erick.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.erick.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
