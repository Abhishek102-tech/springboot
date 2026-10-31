//package com.colors.program.config;
//
//
//import com.colors.program.services.BluePrinter;
//import com.colors.program.services.ColorPrinter;
//import com.colors.program.services.GreenPrinter;
//import com.colors.program.services.RedPrinter;
//import com.colors.program.services.impl.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class PrinterConfig {
//
//    @Bean
//    public BluePrinter bluePrinter() {
//        return new SpanishBluePrinter();
//    }
//
//    @Bean
//    public GreenPrinter greenPrinter() {
//        return new SpanishGreenPrinter();
//    }
//
//    @Bean
//    public RedPrinter redPrinter() {
//        return new SpanishRedPrinter();
//    }
//
//    @Bean
//    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter, RedPrinter redPrinter2) {
//        return new ColorPrinterImpl(redPrinter,greenPrinter,bluePrinter);
//    }
//}
