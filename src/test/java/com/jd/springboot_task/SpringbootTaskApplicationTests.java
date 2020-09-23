package com.jd.springboot_task;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootTaskApplicationTests {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("adb");
        message.setText("123");
        message.setTo("285860149@qq.com");
        message.setFrom("1140599217@qq.com");
        javaMailSender.send(message);
    }

    @Test
    public void test02() throws  Exception{
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //邮件设置
        helper.setSubject("aaa");
        helper.setText("<b style='color:red'>你好帅 </b>",true);

        helper.setTo("285860149@qq.com");
        helper.setFrom("1140599217@qq.com");

        //上传文件
        helper.addAttachment("1.jpg",new File("C:\\Users\\jd\\Pictures\\1.PNG"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\jd\\Pictures\\2.PNG"));

        javaMailSender.send(mimeMessage);

    }
}
