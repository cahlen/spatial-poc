package com.corelogic.scdf.spactialpoc;

import com.corelogic.scdf.spactialpoc.service.ShapefileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import sun.security.provider.SHA;
//
//import javax.swing.*;

@SpringBootApplication
public class SpactialPocApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpactialPocApplication.class, args);

		ShapefileService shapefileService = ctx.getBean(ShapefileService.class);

		shapefileService.runTransfer();
	}
}
