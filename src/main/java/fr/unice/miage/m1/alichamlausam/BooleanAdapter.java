package fr.unice.miage.m1.alichamlausam;

public class BooleanAdapter {

    public static Boolean unmarshal(String v) {
        if (v == null) {
            return null;
        }
        return v.toLowerCase().equals("true");
    }

    public static String marshal(Boolean v) {
        if (v == null) {
            return null;
        }
        return v.toString();
    }
}
