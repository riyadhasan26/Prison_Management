package com.example.prision_management;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DummyClass {

    public static void createMedicalStaff() {
        MedicalStaff m1 = new MedicalStaff("medic1", "pw", "Test Medic", "01700000000", "S1", "Doctor", "Medical", "None");

        File f = new File("MedicalStaff.bin");

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m1);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createLegalRepresentitive() {
        LegalRepresentitive l1 = new LegalRepresentitive("lawyer1", "pw", "Test Lawyer", "01800000000");

        File f = new File("LegalRepresentitive.bin");

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(l1);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}