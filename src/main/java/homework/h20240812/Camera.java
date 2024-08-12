package homework.h20240812;

public class Camera {
    private int resolutionPx;
    private int camerasAmount;
    private boolean hasFlashlight;
    public Camera(){}

    public Camera(int resolutionPx, int camerasAmount, boolean hasFlashlight) {
        this.resolutionPx = resolutionPx;
        this.camerasAmount = camerasAmount;
        this.hasFlashlight = hasFlashlight;
    }

    public int getResolutionPx() {
        return resolutionPx;
    }

    public void setResolutionPx(int resolutionPx) {
        this.resolutionPx = resolutionPx;
    }

    public int getCamerasAmount() {
        return camerasAmount;
    }

    public void setCamerasAmount(int camerasAmount) {
        this.camerasAmount = camerasAmount;
    }

    public boolean isHasFlashlight() {
        return hasFlashlight;
    }

    public void setHasFlashlight(boolean hasFlashlight) {
        this.hasFlashlight = hasFlashlight;
    }

    @Override
    public String toString() {
        return "{" +
                "resolutionPx=" + resolutionPx +
                ", camerasAmount=" + camerasAmount +
                ", hasFlashlight=" + hasFlashlight +
                '}';
    }
}
