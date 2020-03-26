package de;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class IndependentMessageRenderer {
    @Autowired
    private MessageRenderer renderer;

    public void print() {
        renderer.printMessage();
    }
}
