package gtmo.item;

import gregtech.api.items.metaitem.MetaItem;

import java.util.List;

public class GTMOMetaItems {
    public static List<MetaItem<?>> ITEMS = MetaItem.getMetaItems();
    public static GTMOMetaItem META_ITEM;
    public static GTMOOredictItem SHAPED_ITEM = new GTMOOredictItem((short) 0);


    public static void init() {
        META_ITEM = new GTMOMetaItem();
        META_ITEM.setRegistryName("gtmo_meta_item");
        SHAPED_ITEM.setRegistryName("gtmo_oredict_item");
    }
}
