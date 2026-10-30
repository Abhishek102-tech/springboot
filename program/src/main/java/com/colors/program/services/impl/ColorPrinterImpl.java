package com.colors.program.services.impl;


import com.colors.program.services.BluePrinter;
import com.colors.program.services.ColorPrinter;
import com.colors.program.services.GreenPrinter;
import com.colors.program.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl() {
        this.bluePrinter = new EnglishBluePrinter();
        this.redPrinter = new EnglishRedPrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }

    @Override
    public String print(){
        return String.join(",",redPrinter.print(),bluePrinter.print(),greenPrinter.print());
    }
}
