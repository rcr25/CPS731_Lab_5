package com.example.lab5.dummy;

import com.example.lab5.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;
    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static final String desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut sollicitudin porttitor fermentum. Suspendisse id magna finibus, molestie felis aliquet, pellentesque diam. Nullam elit justo, lobortis id lectus nec, dictum iaculis felis.";

    static {
       addItem(new DummyItem("1","Kale/Lemon Sandwiches", R.drawable.klsand, desc));
       addItem(new DummyItem("2","Mango-Lime Bean Salad", R.drawable.mbsalad, desc));
       addItem(new DummyItem("3","Sweet Potato and Lentil Soup with Shiitake Mushrooms", R.drawable.spsoup, desc));
       addItem(new DummyItem("4","Lime Mousse", R.drawable.lmousse, desc));
       addItem(new DummyItem("5","Broiled Tilapia Parmesan", R.drawable.btparm, desc));
   }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String reciName;
        public final Integer reciPic;
        public final String reciDesc;


        public DummyItem(String id, String reciName, Integer reciPic, String reciDesc) {
            this.id = id;
            this.reciName = reciName;
            this.reciPic = reciPic;
            this.reciDesc = reciDesc;
        }

        @Override
        public String toString() {
            return reciName;
        }
    }
}