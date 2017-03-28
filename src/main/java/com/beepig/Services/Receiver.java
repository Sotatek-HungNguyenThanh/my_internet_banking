package com.beepig.Services;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hungnguyen on 21/03/2017.
 */
public class Receiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message) {
        LOGGER.info("###############Received : Received <" + message + ">");
        LOGGER.info("###############Received : latch before <" + this.latch + ">");
        latch.countDown();
        LOGGER.info("###############Received : latch end <" + this.latch + ">");
    }
}
