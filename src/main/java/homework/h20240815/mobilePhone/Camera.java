package homework.h20240815.mobilePhone;

import homework.h20240812.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Camera {
    private List<Integer> resolutions = new ArrayList<>();
    private int serialNumber;

    public Camera(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public List<Integer> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Integer> resolutions) {
        this.resolutions = resolutions;
    }

    public void addResolution(Integer resolution) {
        this.resolutions.add(resolution);
    }

    public void removeResolution(int resolution) {
        if (resolutions.contains(resolution)) {
            resolutions.remove(resolution);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("resolutions: ");
        for (Integer p : resolutions) {
            sb.append(p.toString() + " mPix/");
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutions,serialNumber);
    }
}
