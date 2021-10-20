
package com.company;

public class ChanelFactory implements IBoutiqueFactory {

    @Override
    public IJewelry makeJewelry() {
        return new ChanelJewelry();
    }

    @Override
    public IBags makeBags() {
        return new ChanelBags();
    }
}


