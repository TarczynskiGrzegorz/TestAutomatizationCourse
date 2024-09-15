package homework.h20240822_20240916.collections;

import homework.h20240822_20240916.PackageSize;
import homework.h20240822_20240916.Phone;

import java.util.HashMap;
import java.util.Map;

public class PhonesWithPackaging {
    private static final Map<Phone, PackageSize> phonesWithPackage = new HashMap<>();

    public static Map<Phone, PackageSize> getPhonesWithPackage(){
        return phonesWithPackage;
    }

}
