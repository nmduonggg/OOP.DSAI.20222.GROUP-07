package Virus;
import java.util.List;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;

public abstract class Virus implements infect {
    private String name;
    private String family;
    private String structure;
    private List<String> mechanism;
    private AcidNucleic acidNucleic;
    private Capsid capsid;

    public Virus(String family) {
        super();
    }

    public Virus(String name, String family, AcidNucleic acidNucleic, Capsid capsid) {
        this.name = name;
        this.family = family;
        this.acidNucleic = new AcidNucleic(family);
        this.capsid = new Capsid(name);
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getStructure() {
        return structure;
    }

    public List<String> getMechanism() {
        return mechanism;
    }

    public AcidNucleic getAcidNucleic() {
        return acidNucleic;
    }

    public Capsid getCapsid() {
        return capsid;
    }
    
    public void setStructure(String structure) {
        this.structure = structure;
    }
    
    public void setMechanism(List<String> mechanism) {
        this.mechanism = mechanism;
    }

    @Override
    public void infectHostCell() {   
        // Implementation of infectHostCell() method
    }
}
