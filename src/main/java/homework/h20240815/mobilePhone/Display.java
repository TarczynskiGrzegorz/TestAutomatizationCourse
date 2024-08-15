package homework.h20240815.mobilePhone;

import java.util.Objects;

public class Display {
    private int sizeInch;
    private int resolutionHeight;
    private int resolutionWidth;
    private int serialNumber;

    public Display(int sizeInch, int resolutionHeight, int resolutionWidth,int serialNumber) {
        this.sizeInch = sizeInch;
        this.resolutionHeight = resolutionHeight;
        this.resolutionWidth = resolutionWidth;
        this.serialNumber = serialNumber;
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

    @Override
    public int hashCode() {
        return Objects.hash(sizeInch,resolutionHeight,resolutionWidth,serialNumber);
    }
}
