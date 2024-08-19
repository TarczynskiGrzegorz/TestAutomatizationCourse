package homework.h20240815.mobilePhone;

import java.util.Objects;

public class Display {
    private int sizeInch;
    private int resolutionHeight;
    private int resolutionWidth;


    public Display(int sizeInch, int resolutionHeight, int resolutionWidth) {
        this.sizeInch = sizeInch;
        this.resolutionHeight = resolutionHeight;
        this.resolutionWidth = resolutionWidth;
    }

    public int getSizeInch() {
        return sizeInch;
    }

    public void setSizeInch(int sizeInch) {
        this.sizeInch = sizeInch;
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }

    public void setResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    @Override
    public String toString() {
        return "Display: " +
                sizeInch +
                "\"/" + resolutionHeight +
                " x " + resolutionWidth +
                "px";
    }

}
