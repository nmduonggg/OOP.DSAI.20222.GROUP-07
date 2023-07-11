package Virus.VirusStructure;

import java.util.HashMap;
import java.util.Map;

public class Capsid {
    private String typeCapsid;
    
    private static Map<String, String> nameToTypeMap = new HashMap<>();
    
    static {
        nameToTypeMap.put("HIV", "The HIV capsid is composed of repeating units of a protein called p24, which is encoded by the gag gene of the virus. These p24 proteins self-assemble to form a conical-shaped capsid structure. The capsid is approximately icosahedral in shape, meaning it has 20 triangular faces and 12 vertices.");
        nameToTypeMap.put("SARS_CoV_2", "The capsid itself refers to the protein shell that encloses the viral genome. In the case of SARS-CoV-2, the capsid is not typically referred to as a separate structure, as it is not a prominent feature of the virus. Instead, the viral genome (composed of RNA) is enclosed within the nucleocapsid, which is a ribonucleoprotein complex formed by the association of RNA with nucleocapsid proteins.");
        nameToTypeMap.put("HSV_1", "The capsid of HSV-1 is composed of multiple copies of three main proteins: VP5 (major capsid protein), VP19C (minor capsid protein), and VP26 (triplex protein).");
        nameToTypeMap.put("Adenovirus", "The capsid of adenovirus is composed of multiple protein subunits called capsomeres, which assemble to form a stable, geometrically regular structure.");
        nameToTypeMap.put("HPV", "The capsid is composed of two structural proteins called L1 and L2.");
        // Add more virus name -> capsid mappings as needed
    }

    public Capsid(String name) {
        this.typeCapsid = getTypeForName(name);
    }

    public String getTypeCapsid() {
        return typeCapsid;
    }

    public void setTypeCapsid(String typeAcidNucleic) {
        this.typeCapsid = typeAcidNucleic;
    }

    public String getTypeForName(String name) {
        return nameToTypeMap.getOrDefault(name, "Unknown");
    }
}
