
package com.company;

public class GucciFactory implements IBoutiqueFactory{
    @Override
    public IJewelry makeJewelry() {
        return new GucciJewelry();
    }

    @Override
    public IBags makeBags() {
        return new GucciBags();
    }
}
