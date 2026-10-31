package com.colors.program.services.impl;


import com.colors.program.services.BluePrinter;
import com.colors.program.services.ColorPrinter;
import com.colors.program.services.GreenPrinter;
import com.colors.program.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.bluePrinter = bluePrinter;
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print(){
        return String.join(",",redPrinter.print(),bluePrinter.print(),greenPrinter.print());
    }
}
