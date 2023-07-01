package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }

}
