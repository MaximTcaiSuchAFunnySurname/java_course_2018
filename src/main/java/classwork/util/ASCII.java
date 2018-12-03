package classwork.util;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ASCII {
    boolean negative;

    public ASCII(boolean negative) {
        this.negative = negative;
    }

    public String convert(BufferedImage image) {
        StringBuilder sb = new StringBuilder(image.getHeight() * (image.getWidth() + 1));
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color pixel = new Color(image.getRGB(x, y));
                double value = (double) (pixel.getRed() * 0.2989
                        + pixel.getBlue() * 0.587 + pixel.getGreen() * 0.114);
                final char symbol = negative ? strNeg(value) : strPos(value);
                sb.append(symbol);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public char strPos(double value) {
        final char str;
        if (value >= 230) {
            str = ' ';
        } else if (value >= 200) {
            str = '.';
        } else if (value >= 180) {
            str = '*';
        } else if (value >= 160) {
            str = ':';
        } else if (value >= 130) {
            str = 'o';
        } else if (value >= 100) {
            str = '8';
        } else if (value >= 70) {
            str = '#';
        } else if (value >= 50) {
            str = '%';
        } else str = '@';
        return str;
    }

    public char strNeg(double value) {
        final char str;
        if (value >= 230) {
            str = '@';
        } else if (value >= 200) {
            str = '#';
        } else if (value >= 180) {
            str = '8';
        } else if (value >= 160) {
            str = '&';
        } else if (value >= 130) {
            str = 'o';
        } else if (value >= 100) {
            str = ':';
        } else if (value >= 70) {
            str = '*';
        } else if (value >= 50) {
            str = '.';
        } else str = ' ';
        return str;
    }
}
