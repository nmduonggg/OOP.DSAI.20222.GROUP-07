package Virus.VirusWithEnvelope;

import java.util.HashMap;
import java.util.Map;

public class Glycoprotein {
    private String typeGlycoprotein;

    private static Map<String, String> familyToTypeMap = new HashMap<>();

    static {
        familyToTypeMap.put("Herpesviruses", "Spikes");
        familyToTypeMap.put("Coronaviruses", "Spikes");
        familyToTypeMap.put("Retroviruses", "Viral envelope");
        // Add more mappings for different families of viruses
    }

    public Glycoprotein(String family) {
        this.typeGlycoprotein = getTypeForFamily(family);
    }

    public String getTypeAcidNucleic() {
        return typeGlycoprotein;
    }

    public void setTypeAcidNucleic(String typeAcidNucleic) {
        this.typeGlycoprotein = typeAcidNucleic;
    }

    private String getTypeForFamily(String family) {
        return familyToTypeMap.getOrDefault(family, "Unknown");
    }
}
