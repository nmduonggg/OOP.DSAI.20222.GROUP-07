package Virus;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Virus.VirusWithEnvelope.Herpesviruses;
import Virus.VirusWithEnvelope.Retroviruses;
import Virus.VirusWithoutEnvelope.Adenoviruses;
import Virus.VirusWithoutEnvelope.Papillomaviruses;

public class VirusManager {
    private Herpesviruses herpesviruses;
    private Retroviruses retroviruses;
    private Papillomaviruses papillomaviruses;
    private Adenoviruses adenoviruses;

    private List<Virus> viruses = new ArrayList<>();

    public static void main(String[] args) {
        String virusesFolderPath = "/path/to/SpecificViruses/";

    }

    public static String getStructure(String virusesFolderPath, String virusFolderName) {
        String structureFilePath = virusesFolderPath + virusFolderName + File.separator + "Structure.png";
        return structureFilePath;
    }

    public static List<String> getMechanism(String virusesFolderPath, String virusFolderName) {
        String mechanismFolderPath = virusesFolderPath + virusFolderName + File.separator + "Mechanism";
        File mechanismDirectory = new File(mechanismFolderPath);
        File[] mechanismFiles = mechanismDirectory.listFiles();

        List<String> mechanismFileNames = new ArrayList<>();
        if (mechanismFiles != null) {
            for (File file : mechanismFiles) {
                if (file.isFile()) {
                    mechanismFileNames.add(file.getName());
                }
            }
            Collections.sort(mechanismFileNames);
        }
        return mechanismFileNames;
    }

    public List<Virus> getViruses() {
        return viruses;
    }
}
