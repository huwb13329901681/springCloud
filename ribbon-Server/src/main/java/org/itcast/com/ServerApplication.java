package org.itcast.com;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ServerApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// �ֶ�����˿ں�
		Scanner sca = new Scanner(System.in);
		String port = sca.nextLine();
		new SpringApplicationBuilder(ServerApplication.class).properties("server.port=" + port).run(args);

	}

}
