package com.proglab3.entity;

import com.proglab3.impl.actionsMisa;
import com.proglab3.misc.CryVolume;
import com.proglab3.misc.Wears;

public class Misa extends Entity implements actionsMisa {
    private Wears wear = Wears.HAPPY;
    private CryVolume cryVolume = CryVolume.QUITE;

    public void getDressed() {
        setWear(Wears.SAD);
        System.out.println(getName() + " оделась в " + getWear());
    }

    public void cornerCry() {
        setCryVolume(CryVolume.LOUD);
        System.out.println(getName() + " уселась в " + getPlace().toString() + " " + getCryVolume() + " плачет");
    }


    public Wears getWear() {
        return wear;
    }

    public void setWear(Wears wear) {
        this.wear = wear;
    }

    public CryVolume getCryVolume() {
        return cryVolume;
    }

    public void setCryVolume(CryVolume cryVolume) {
        this.cryVolume = cryVolume;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String getName() {
        return "Миса";
    }
}
