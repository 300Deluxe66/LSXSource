package com.newapp.lsxsource.dummy;

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
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();


    static {
        addItem(new DummyItem("1","LS1","Displacement: 5.7L","Horsepower: 345","Torque: 350","Compression: 10.25:1"));
        addItem(new DummyItem("2","LS2","Displacement: 6.0L","Horsepower: 400","Torque: 400","Compression: 10.9:1"));
        addItem(new DummyItem("3","LS3","Displacement: 6.2L","Horsepower: 430","Torque: 424","Compression: 10.7:1"));
        addItem(new DummyItem("4","LS6","Displacement: 5.7L","Horsepower: 405","Torque: 400","Compression: 10.5:1"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class DummyItem {
        public String id;
        public String content;
        public String displacement;
        public String horsepower;
        public String torque;
        public String compression;

        public DummyItem(String id, String content, String displacement, String horsepower, String torque, String compression) {
            this.id = id;
            this.content = content;
            this.displacement = displacement;
            this.horsepower = horsepower;
            this.torque = torque;
            this.compression = compression;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
