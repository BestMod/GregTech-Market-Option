package gtmo;

import gregtech.api.util.BaseCreativeTab;
import gtmo.item.GTMOMetaItem;

import java.util.Random;

public class GTMOValues {
    public static final String MODID = "gtmo";
    public static final BaseCreativeTab TAB_GTMO = new BaseCreativeTab("gregtechmarketoption.main", () -> GTMOMetaItem.CREDIT.getStackForm(), true);
    public static final Random rand = new Random();
}
