package org.spring.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.loyalty.crm.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)// 指定spring-boot的启动类
public class AppTest {
    @Autowired
    private JavaMailSender mailSender;

    /**
     * 修改application.properties的用户，才能发送。
     */
    @Test
    public void sendSimpleEmail(){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("445020593@qq.com");//发送者.
        message.setTo("445020593@qq.com");//接收者.
        message.setSubject("测试邮件（邮件主题）");//邮件主题.
        message.setText("这是邮件内容");//邮件内容.

        mailSender.send(message);//发送邮件
    }
}
