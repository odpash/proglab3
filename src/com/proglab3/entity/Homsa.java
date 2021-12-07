package com.proglab3.entity;

import com.proglab3.impl.actionsHomsa;
import com.proglab3.misc.EmoutionalStates;
import com.proglab3.misc.Luke;
import com.proglab3.place.Floor;
import com.proglab3.place.Lumber;

import java.util.Objects;

public class Homsa extends Entity implements actionsHomsa {

    @Override
    public String getName() {
        return "Homsa";
    }

    @Override
    public String toString() {
        return getName();
    }

    public void tryPerfomance() {
        System.out.println(getName() + " попытался представить " + "");
        searchLumber();
        searchFloor();
        isIntrigued();
    }

    public void searchLumber() {
        Lumber l = new Lumber();
        System.out.println(getName() + " осмотрел " + l.getName() + " и увидел, что " + l.getObjName() + " " + l.isObjExists());
    }

    public void searchFloor() {
        Floor f = new Floor();
        System.out.println(getName() + " решил проверить " + f.getName() + " и заметил, что " + f.getObjName() + " " + f.isObjExists());
        if (Objects.equals(f.isObjExists(), "существует")) {
            Luke luke = f.getObj();
            if (Objects.equals(luke.getOpennedInfo(), "закрыто")) {
                luke.open();
                System.out.println(getName() + " открыл " + f.getObjName());
            }
            System.out.println(getName() + " заметил " + luke.getSourceElementName());

        }
    }

    public void isIntrigued() {
        System.out.println(getName() + " был " + EmoutionalStates.Intrigued);
    }


}
