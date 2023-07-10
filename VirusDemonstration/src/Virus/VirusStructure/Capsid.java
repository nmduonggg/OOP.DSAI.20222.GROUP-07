package Virus.VirusStructure;

import java.util.HashMap;
import java.util.Map;

public class Capsid {
    private String typeCapsid;
    
    private static Map<String, String> nameToTypeMap = new HashMap<>();
    static {
        nameToTypeMap.put("Herpesviruses", "Icosahedral");
        // Add more virus name -> capsid mappings as needed
    }

    public Capsid(String family) {
        this.typeCapsid = getTypeForFamily(family);
    }

    private String getTypeForFamily(String family) {
        return nameToTypeMap.getOrDefault(family, "Unknown");
    }

    public String getTypeCapsid() {
        return typeCapsid;
    }
}
