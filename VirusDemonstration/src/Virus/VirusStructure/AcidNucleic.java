package Virus.VirusStructure;

import java.util.HashMap;
import java.util.Map;

public class AcidNucleic {
    private String typeAcidNucleic;

    private static Map<String, String> familyToTypeMap = new HashMap<>();

    static {
        familyToTypeMap.put("Herpesviruses", "dsDNA");
        familyToTypeMap.put("Coronaviruses", "ssRNA");
        familyToTypeMap.put("Picornaviruses", "ssRNA");
        // Add more mappings for different families of viruses
    }

    public AcidNucleic(String family) {
        this.typeAcidNucleic = getTypeForFamily(family);
    }

    public String getTypeAcidNucleic() {
        return typeAcidNucleic;
    }

    public void setTypeAcidNucleic(String typeAcidNucleic) {
        this.typeAcidNucleic = typeAcidNucleic;
    }

    private String getTypeForFamily(String family) {
        return familyToTypeMap.getOrDefault(family, "Unknown");
    }
}
