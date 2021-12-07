package com.proglab3.place;

import com.proglab3.misc.Hole;
import com.proglab3.misc.Luke;

public class Floor {
    private Luke luke;

    public Floor() {
        luke = new Luke();
    }

    public String isObjExists() {
        return luke.getExistsInfo();
    }
    public String getSourceElementName(){return luke.getSourceElementName();}

    public String getObjName() {
        return luke.getName();
    }

    public Luke getObj() {
        return luke;
    }

    public String getName() {
        return "Пол";
    }

}
