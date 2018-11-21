package com.gp6.springboot14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot14ApplicationTests {

    // 日志记录器
    private static final Logger LOGGER = LoggerFactory.getLogger(Springboot14ApplicationTests.class);

    @Test
    public void contextLoads() {
        /*
            日志的级别:
                trace<debug<info<warn<error

                日志只会输入指定级别和比指定级别高的日志

            SpringBoot默认info级别
         */
        LOGGER.trace("trace----跟踪日志...");
        LOGGER.debug("debug----调试日志...");
        LOGGER.info("info----普通日志...");
        LOGGER.warn("warn----警告日志...");
        LOGGER.error("error----错误日志...");
    }
}
