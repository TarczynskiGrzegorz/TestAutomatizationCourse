package homework.h20240822.collections;

import homework.h20240822.PackageSize;
import homework.h20240822.Phone;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class PhonesWithPackaging {
    private static final Map<Phone, PackageSize> phonesWithPackage = new HashMap<>();

    public static Map<Phone, PackageSize> getPhonesWithPackage(){
        return phonesWithPackage;
    }

}
