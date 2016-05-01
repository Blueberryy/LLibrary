package net.ilexiconn.llibrary.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

@SideOnly(Side.CLIENT)
public class ColorMode {
    public static final ColorMode DARK = ColorMode.create("dark", 0xFF212121, 0xFF363636, 0xFF464646, 0xFF212121, 0xFF1F1F1F, 0xFFFFFFFF);
    public static final ColorMode LIGHT = ColorMode.create("light", 0xFFCDCDCD, 0xFFACACAC, 0xFFECECEC, 0xFFCDCDCD, 0xFFC2C2C2, 0xFF000000);

    private static final List<ColorMode> COLOR_MODE_LIST = new ArrayList<>();

    private final String name;
    private final int primaryColor;
    private final int secondaryColor;
    private final int tertiaryColor;
    private final int primarySubcolor;
    private final int secondarySubcolor;
    private final int textColor;

    private ColorMode(String name, int primaryColor, int secondaryColor, int tertiaryColor, int primarySubcolor, int secondarySubcolor, int textColor) {
        this.name = name;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.tertiaryColor = tertiaryColor;
        this.primarySubcolor = primarySubcolor;
        this.secondarySubcolor = secondarySubcolor;
        this.textColor = textColor;
        ColorMode.COLOR_MODE_LIST.add(this);
    }

    public static ColorMode create(String name, int primaryColor, int secondaryColor, int tertiaryColor, int primarySubcolor, int secondarySubcolor, int textColor) {
        return new ColorMode(name, primaryColor, secondaryColor, tertiaryColor, primarySubcolor, secondarySubcolor, textColor);
    }

    public static ColorMode getColorMode(String name) {
        for (ColorMode colorMode : ColorMode.COLOR_MODE_LIST) {
            if (colorMode.getName().equals(name)) {
                return colorMode;
            }
        }
        return ColorMode.LIGHT;
    }

    public String getName() {
        return name;
    }

    public int getPrimaryColor() {
        return primaryColor;
    }

    public int getSecondaryColor() {
        return secondaryColor;
    }

    public int getTertiaryColor() {
        return tertiaryColor;
    }

    public int getPrimarySubcolor() {
        return primarySubcolor;
    }

    public int getSecondarySubcolor() {
        return secondarySubcolor;
    }

    public int getTextColor() {
        return textColor;
    }
}

