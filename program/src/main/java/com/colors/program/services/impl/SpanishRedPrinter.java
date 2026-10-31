package com.colors.program.services.impl;

import com.colors.program.services.RedPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "Roho";
    }
}
