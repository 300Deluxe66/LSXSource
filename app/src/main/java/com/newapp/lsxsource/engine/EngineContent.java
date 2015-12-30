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
        addItem(new Engine("1","LS1","5.7L","345","350","10.25:1","3.90","3.62"));
        addItem(new Engine("2","LS2","6.0L","400","400","10.9:1","4.00","3.62"));
        addItem(new Engine("3","LS3","6.2L","430","424","10.7:1","4.06","3.62"));
        addItem(new Engine("3","LS4","5.3L","310","338","9.9:1","3.78","3.62"));
        addItem(new Engine("4","LS6","5.7L","405","400","10.5:1","3.90","3.62"));
        addItem(new Engine("3","LS7","7.0L","505","470","11.0:1","4.125","4.00"));
        addItem(new Engine("3","LS9","6.2L","638","604","9.0:1","4.06","3.62"));
        addItem(new Engine("3","LSA","6.2L","580","556","9.1:1","4.06","3.62"));
    }

    private static void addItem(Engine item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class Engine {
        public String id;
        public String content;
        public String displacement;
        public String horsepower;
        public String torque;
        public String compression;
        public String bore;
        public String stroke;

        public Engine(String id, String content, String displacement, String horsepower,
                      String torque, String compression, String bore, String stroke) {
            this.id = id;
            this.content = content;
            this.displacement = displacement;
            this.horsepower = horsepower;
            this.torque = torque;
            this.compression = compression;
            this.bore = bore;
            this.stroke = stroke;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
