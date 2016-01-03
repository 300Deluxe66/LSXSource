package com.newapp.lsxsource.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class EngineContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<Engine> ITEMS = new ArrayList<Engine>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, Engine> ITEM_MAP = new HashMap<String, Engine>();


    static {
        addItem(new Engine("1","LS1","III","5.7L","346CI","345","350","10.25:1","3.90","3.62","98-02 Camaro\n98-05 Corvette"));
        addItem(new Engine("2","LS2","III","6.0L","364CI","400","400","10.9:1","4.00","3.62","05-06 Corvette"));
        addItem(new Engine("3","LS3","IV","6.2L","376CI","430","424","10.7:1","4.06","3.62","06-14 Corvette"));
        addItem(new Engine("4","LS4","III","5.3L","325CI","310","338","9.9:1","3.78","3.62","04-06 Impala SS"));
        addItem(new Engine("5","LS6","III","5.7L","346CI","405","400","10.5:1","3.90","3.62","02-04 Corvette Z06"));
        addItem(new Engine("6","LS7","IV","7.0L","427CI","505","470","11.0:1","4.125","4.00","06-14 Corvette Z06"));
        addItem(new Engine("7","LS9","IV","6.2L","376CI","638","604","9.0:1","4.06","3.62","08-14 Corvette ZR1"));
        addItem(new Engine("8","LSA","IV","6.2L","376CI","580","556","9.1:1","4.06","3.62","08-14 Camaro ZL1"));
    }

    private static void addItem(Engine item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class Engine {
        public String id;
        public String content;
        public String gen;
        public String volume;
        public String displacement;
        public String horsepower;
        public String torque;
        public String compression;
        public String bore;
        public String stroke;
        public String intakePortType;
        public String tbSize;
        public String tbBolts;
        public String injectorFlow;
        public String injectorConnector;
        public String injectorLength;
        public String headPortType;
        public String headMaterial;
        public String cam;
        public String camReluctorRing;
        public String blockMaterial;
        public String applications;
        public String destination;



        public Engine(String id, String content,String gen, String volume, String displacement, String horsepower,
                      String torque, String compression, String bore, String stroke, String applications) {
            this.id = id;
            this.content = content;
            this.gen = gen;
            this.volume = volume;
            this.displacement = displacement;
            this.horsepower = horsepower;
            this.torque = torque;
            this.compression = compression;
            this.bore = bore;
            this.stroke = stroke;
            this.applications = applications;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
