package br.com.rochaeduardo.cursomc.services;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService{

	private static final org.jboss.logging.Logger LOG = LoggerFactory.logger(MockEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOG.info("Simulando envio de email...");
		LOG.info(msg.toString());
		LOG.info("Email enviado!");
		
	}

}
