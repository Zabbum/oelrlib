package com.github.zabbum.oelremakecomponents.plants.industries.Pumps;

import com.github.zabbum.oelremakecomponents.interfaces.BuyableIndustry;
import com.github.zabbum.oelremakecomponents.plants.industries.AbstractIndustry;

import java.util.Random;

public class PumpsIndustry extends AbstractIndustry implements BuyableIndustry {

    /**
     * Max product price (this should be changed in every class extending AbstractIndustry).
     */
    public static final int maxProductPrice = 50000;

    /**
     * Constructor of a pumps' industry.
     *
     * @param name name of the industry
     */
    public PumpsIndustry(final String name) {
        super(name);

        Random random = new Random();

        this.setPlantPrice(random.nextInt(80000) + 36000);
        this.setProductsAmount((this.getPlantPrice() / 10000) * 7 + 25);
    }
}
