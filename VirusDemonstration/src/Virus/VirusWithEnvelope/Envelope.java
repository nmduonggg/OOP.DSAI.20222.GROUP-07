package Virus.VirusWithEnvelope;

import java.util.HashMap;
import java.util.Map;

public class Envelope {
    private String typeEnvelope;
    
    private static Map<String, String> nameToTypeMap = new HashMap<>();

    static {
        nameToTypeMap.put("HIV", "Lipid bilayer");
        nameToTypeMap.put("SARS_CoV_2", "Lipid bilayer");
        nameToTypeMap.put("HSV_1", "Lipid bilayer");
        // Add more virus name -> envelope mappings as needed
    }

    public Envelope(String name) {
        this.typeEnvelope = getTypeForName(name);
    }

    public String getTypeEnvelope() {
        return typeEnvelope;
    }

    public void setTypeEnvelope(String typeAcidNucleic) {
        this.typeEnvelope = typeAcidNucleic;
    }

    public String getTypeForName(String name) {
        return nameToTypeMap.getOrDefault(name, "Unknown");
    }
}
