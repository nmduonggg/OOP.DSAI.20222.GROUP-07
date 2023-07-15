package Virus;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Virus.VirusStructure.AcidNucleic;
import Virus.VirusStructure.Capsid;
import Virus.VirusWithEnvelope.Coronaviruses;
import Virus.VirusWithEnvelope.Envelope;
import Virus.VirusWithEnvelope.Glycoprotein;
import Virus.VirusWithEnvelope.Herpesviruses;
import Virus.VirusWithEnvelope.Retroviruses;
import Virus.VirusWithEnvelope.VirusWithEnvelope;
import Virus.VirusWithoutEnvelope.Adenoviruses;
import Virus.VirusWithoutEnvelope.Papillomaviruses;

public class VirusManager {
    private Herpesviruses hsv1;
    private Retroviruses hiv;
    private Papillomaviruses hpv;
    private Adenoviruses adeno;
    private Coronaviruses cov2;

    private static List<Virus> viruses = new ArrayList<>();
    
    private static String virusesFolderPath = "/Virus/Viruses/";

    // public static void main(String[] args) {
        
    //     Virus HIV = new Retroviruses("HIV", "Retroviruses", null,null, new AcidNucleic("Retroviruses"), new Capsid("HIV"), new Envelope("HIV"), new Glycoprotein("Retroviruses"));
    //     HIV.setStructure(getStructure(virusesFolderPath, "HIV"));
    //     HIV.setMechanism(getMechanism(virusesFolderPath, "HIV"));
        
    //     Virus SARS_CoV_2 = new Coronaviruses("SARS_CoV_2", "Coronaviruses", null, null, new AcidNucleic("Coronaviruses"), new Capsid("SARS_CoV_2"), new Envelope("SARS_CoV_2"), new Glycoprotein("Coronaviruses"));
    //     SARS_CoV_2.setStructure(getStructure(virusesFolderPath, "SARS_CoV_2"));
    //     SARS_CoV_2.setMechanism(getMechanism(virusesFolderPath, "SARS_CoV_2"));

    //     Virus HSV_1 = new Herpesviruses("HSV_1", "Herpesviruses", null, null, new AcidNucleic("Herpesviruses"), new Capsid("HSV_1"), new Envelope("HSV_1"), new Glycoprotein("Herpesviruses"));
    //     HSV_1.setStructure(getStructure(virusesFolderPath, "HSV_1"));
    //     HSV_1.setMechanism(getMechanism(virusesFolderPath, "HSV_1"));

    //     Virus Adenovirus = new Adenoviruses("Adenovirus", "Adenoviruses", null, null, new AcidNucleic("Adenoviruses"), new Capsid("Adenovirus"), "12", "5", "240");
    //     Adenovirus.setStructure(getStructure(virusesFolderPath, "Adenovirus"));
    //     Adenovirus.setMechanism(getMechanism(virusesFolderPath, "Adenovirus"));

    //     Virus HPV = new Papillomaviruses("HPV", "Papillomaviruses", null, null, new AcidNucleic("Papillomaviruses"), new Capsid("HPV"));
    //     HPV.setStructure(getStructure(virusesFolderPath, "HPV"));
    //     HPV.setMechanism(getMechanism(virusesFolderPath, "HPV"));

    //     System.out.println("Virus name: " + SARS_CoV_2.getName());
    //     System.out.println("Virus family: " + SARS_CoV_2.getFamily());
    //     System.out.println("Virus structure: " + SARS_CoV_2.getStructure());
    //     System.out.println("Virus mechanism: " + SARS_CoV_2.getMechanism());
    //     System.out.println("Virus acid nucleic: " + SARS_CoV_2.getAcidNucleic().getTypeAcidNucleic());
    //     System.out.println("Virus capsid: " + SARS_CoV_2.getCapsid().getTypeCapsid());
    //     System.out.println("Virus envelope: " + ((VirusWithEnvelope) SARS_CoV_2).getEnvelope().getTypeEnvelope());
        
    //     viruses.add(HIV);
    //     viruses.add(SARS_CoV_2);
    //     viruses.add(HSV_1);
    //     viruses.add(Adenovirus);
    //     viruses.add(HPV);
    //     System.out.println(getViruses());
    // }

    public static String getStructure(String virusesFolderPath, String virusFolderName) {
        String structureFilePath = virusesFolderPath + virusFolderName + "/Structure.png";
        return structureFilePath;
    }      
    
    public static List<String> getMechanism(String virusesFolderPath, String virusFolderName) {
        String mechanismFolderPath = new File(virusesFolderPath, virusFolderName + File.separator + "Mechanism").getAbsolutePath();
            
        File mechanismDirectory = new File(mechanismFolderPath);
        File[] mechanismFiles = mechanismDirectory.listFiles();

        List<String> mechanismFileNames = new ArrayList<>();
        if (mechanismFiles != null) {
            for (File file : mechanismFiles) {
                if (file.isFile()) {
                    mechanismFileNames.add(file.getName());
                }
            }
        }
        // Sort the mechanism file names using the custom comparator
        Collections.sort(mechanismFileNames, new MechanismFileNameComparator());
        return mechanismFileNames;
    }

    // Custom comparator to sort mechanism file names
    public static class MechanismFileNameComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String number1 = o1.substring(0, o1.lastIndexOf("."));
            String number2 = o2.substring(0, o2.lastIndexOf("."));
            return Integer.compare(Integer.parseInt(number1), Integer.parseInt(number2));
        }
    }
    
    public static List<Virus> getViruses() {
        return viruses;
    }

    public void initialize() {
        hiv = new Retroviruses("HIV", "Retroviruses", null,null, new AcidNucleic("Retroviruses"), new Capsid("HIV"), new Envelope("HIV"), new Glycoprotein("Retroviruses"));
        hiv.setStructure(getStructure(virusesFolderPath, "HIV"));
        hiv.setMechanism(getMechanism(virusesFolderPath, "HIV"));
        
        cov2 = new Coronaviruses("SARS_CoV_2", "Coronaviruses", null, null, new AcidNucleic("Coronaviruses"), new Capsid("SARS_CoV_2"), new Envelope("SARS_CoV_2"), new Glycoprotein("Coronaviruses"));
        cov2.setStructure(getStructure(virusesFolderPath, "SARS_CoV_2"));
        cov2.setMechanism(getMechanism(virusesFolderPath, "SARS_CoV_2"));

        hsv1 = new Herpesviruses("HSV_1", "Herpesviruses", null, null, new AcidNucleic("Herpesviruses"), new Capsid("HSV_1"), new Envelope("HSV_1"), new Glycoprotein("Herpesviruses"));
        hsv1.setStructure(getStructure(virusesFolderPath, "HSV_1"));
        hsv1.setMechanism(getMechanism(virusesFolderPath, "HSV_1"));

        adeno = new Adenoviruses("Adenovirus", "Adenoviruses", null, null, new AcidNucleic("Adenoviruses"), new Capsid("Adenovirus"), "12", "5", "240");
        adeno.setStructure(getStructure(virusesFolderPath, "Adenovirus"));
        adeno.setMechanism(getMechanism(virusesFolderPath, "Adenovirus"));

        hpv = new Papillomaviruses("HPV", "Papillomaviruses", null, null, new AcidNucleic("Papillomaviruses"), new Capsid("HPV"));
        hpv.setStructure(getStructure(virusesFolderPath, "HPV"));
        hpv.setMechanism(getMechanism(virusesFolderPath, "HPV"));

        viruses.add(hiv);
        viruses.add(cov2);
        viruses.add(hsv1);
        viruses.add(adeno);
        viruses.add(hpv);
    }

    public Herpesviruses getHerpesvirus() {
        return hsv1;
    }

    public Retroviruses getRetrovirus() {
        return hiv;
    }

    public Papillomaviruses getPapilomavirus() {
        return hpv;
    }

    public Adenoviruses getAdenovirus() {
        return adeno;
    }

    public Coronaviruses getCoronavirus() {
        return cov2;
    }

}
