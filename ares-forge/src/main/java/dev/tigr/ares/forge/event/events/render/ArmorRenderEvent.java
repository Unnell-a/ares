package dev.tigr.ares.forge.event.events.render;

import dev.tigr.simpleevents.event.Event;

public class ArmorRenderEvent extends Event {
    private boolean hat = false;
    private boolean shirt = false;
    private boolean pants = false;
    private boolean shoes = false;

    public boolean shouldRenderHat() {
        return hat;
    }

    public void setHat(boolean hat) {
        this.hat = hat;
    }

    public boolean shouldRenderShirt() {
        return shirt;
    }

    public void setShirt(boolean shirt) {
        this.shirt = shirt;
    }

    public boolean shouldRenderPants() {
        return pants;
    }

    public void setPants(boolean pants) {
        this.pants = pants;
    }

    public boolean shouldRenderShoes() {
        return shoes;
    }

    public void setShoes(boolean shoes) {
        this.shoes = shoes;
    }
}
