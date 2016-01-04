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
        addItem(new Engine("1","LS1","III","5.7L","346CI","345","350","10.25:1","3.90","3.62","Cathedral","78MM","3 Bolt",
                "1997-2004 Corvette\n1998-2002 Camaro\n1998-2002 Firebird\n2004 GTO","car"));
        addItem(new Engine("2","LS2","IV","6.0L","364CI","400","400","10.9:1","4.00","3.62","Cathedral","90MM","4 Bolt",
                "2005-2007 Corvette\n2005-2006 SSR\n2006-2009 TrailBlazer SS\n2006-2007 CTS-V\n2005-2006 GTO\n9-7X Aero","car"));
        addItem(new Engine("3","LS3","IV","6.2L","376CI","430","424","10.7:1","4.06","3.62","Rectangle","90MM","4 Bolt",
                "2008-2013 Corvette\n2010-2015 Camaro SS\n2014-2015 SS\n2009 G8 GXP","car"));
        addItem(new Engine("4","LS4","IV","5.3L","325CI","310","338","9.9:1","3.78","3.62","Cathedral","78MM","3 Bolt",
                "2005-2008 Grand Prix GXP\n2006-2009 Impala SS\n2006-2007 Monte Carlo SS\n2008-2009 LaCrosse Super","car"));
        addItem(new Engine("5","LS6","III","5.7L","346CI","405","400","10.5:1","3.90","3.62","Cathedral","78MM","3 Bolt",
                "2001-2004 Corvette Z06\n2004-2005 CTS-V","car"));
        addItem(new Engine("6","LS7","IV","7.0L","427CI","505","470","11.0:1","4.125","4.00","Rectangle","90MM","4 Bolt",
                "2006-2013 Corvette Z06\n2013 Corvette 427 Convertible\n2014-2015 Camaro Z/28","car"));
        addItem(new Engine("7","LS9","IV","6.2L","376CI","638","604","9.0:1","4.06","3.62","Rectangle","90MM","4 Bolt",
                "2009-2013 Corvette ZR1","car"));
        addItem(new Engine("8","LSA","IV","6.2L","376CI","580","556","9.1:1","4.06","3.62","Rectangle","90MM","4 Bolt",
                "2009-2015 Camaro ZL1\n2009-2013 CTS-V","car"));
    }

    private static void addItem(Engine item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class Engine {
        public String id;
        public String code;
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



        public Engine(String id, String code,String gen, String volume, String displacement, String horsepower,
                      String torque, String compression, String bore, String stroke,String intakePortType,String tbSize, String tbBolts, String applications,
                      String destination) {
            this.id = id;
            this.code = code;
            this.gen = gen;
            this.volume = volume;
            this.displacement = displacement;
            this.horsepower = horsepower;
            this.torque = torque;
            this.compression = compression;
            this.bore = bore;
            this.stroke = stroke;
            this.intakePortType = intakePortType;
            this.tbSize = tbSize;
            this.tbBolts = tbBolts;
            this.applications = applications;
            this.destination = destination;
        }

        @Override
        public String toString() {
            return code;
        }
    }
}
