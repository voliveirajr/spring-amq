package com.voliveirajr.spring.amq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import lombok.extern.log4j.Log4j;

import org.springframework.stereotype.Component;

@Log4j
@Component
public class SpringAMQListener implements MessageListener {

	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			try {
				log.debug("Received " + ((TextMessage) message).getText());
				// Just to simulate some work
				Thread.sleep(5000);
			} catch (JMSException | InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			log.debug("not expected type of message");
		}
	}
}