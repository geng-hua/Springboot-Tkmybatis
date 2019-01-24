package com.ttwb.mobile.OfficialWebsite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ttwb.mobile.OfficialWebsite.entity.User;
import com.ttwb.mobile.OfficialWebsite.mapper.UserMapper;

import tk.mybatis.spring.annotation.MapperScan;


@RestController
@ComponentScan(basePackages = "com.ttwb.mobile.OfficialWebsite")
@SpringBootApplication
@MapperScan(basePackages = "com.ttwb.mobile.OfficialWebsite.mapper")
public class TtwbOfficialWebsiteApplication {


	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("")
	public String hello() {
		List<User> users = userMapper.selectAll();
		return "hello";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(TtwbOfficialWebsiteApplication.class, args);
	}

}

