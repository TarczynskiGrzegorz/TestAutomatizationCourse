package homework.h20240912.enums;

import java.util.ArrayList;
import java.util.Arrays;

public enum OSSystem {
    WINDOWS(new ArrayList<>(Arrays.asList("XP","2000"))),
    LINUX(new ArrayList<>(Arrays.asList("Ubuntu"))),
    MAC(new ArrayList<>(Arrays.asList("Macintosh")));

    private ArrayList<String> types = new ArrayList<>();

    static {
        OSSystem[] values = OSSystem.values();
        Arrays.stream(values).forEach(v-> System.out.println("types " + v.getTypes()+", "+v));
    }
    OSSystem(ArrayList<String> type){
        this.types =type;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> type) {
        this.types = type;
    }

    public void addToList(String type){
        this.types.add(type);
    }
}
