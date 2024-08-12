package homework.h20240812;

public class Model {
    private int memoryGb;
    private String operatingSystem;
    private Display display;
    private Camera camera;

    public Model() {

    }

    public Model(int memoryGb, String operatingSystem, Display display, Camera camera) {
        this.memoryGb = memoryGb;
        this.operatingSystem = operatingSystem;
        this.display = display;
        this.camera = camera;
    }

    public int getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(int memoryGb) {
        this.memoryGb = memoryGb;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "{" +
                "\n \tmemoryGb=" + memoryGb +
                ",\n \toperatingSystem='" + operatingSystem + '\'' +
                ",\n \tdisplay=" + display.toString() +
                ",\n \tcamera=" + camera.toString() +
                "\n \t}";
    }
}
