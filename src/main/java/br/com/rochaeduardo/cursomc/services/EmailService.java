package br.com.rochaeduardo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.rochaeduardo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
