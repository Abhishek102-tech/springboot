package com.colors.program;

import com.colors.program.services.ColorPrinter;
import com.colors.program.services.impl.ColorPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgramApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProgramApplication.class, args);
	}

	@Override
	public void run(String... args){
		final ColorPrinter printer = new ColorPrinterImpl();
		System.out.println(printer.print());
	}

}
