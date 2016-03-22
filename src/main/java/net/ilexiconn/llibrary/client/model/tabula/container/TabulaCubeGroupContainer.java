package net.ilexiconn.llibrary.client.model.tabula.container;

import java.util.List;

/**
 * @author gegy1000
 * @since 1.0.0
 */
public class TabulaCubeGroupContainer {
    private String name;
    private String identifier;

    private List<TabulaCubeContainer> cubes;
    private List<TabulaCubeGroupContainer> cubeGroups;

    private boolean txMirror;
    private boolean hidden;

    public String getName() {
        return this.name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public List<TabulaCubeContainer> getCubes() {
        return this.cubes;
    }

    public List<TabulaCubeGroupContainer> getCubeGroups() {
        return this.cubeGroups;
    }

    public boolean isTextureMirrorEnabled() {
        return this.txMirror;
    }

    public boolean isHidden() {
        return this.hidden;
    }
}
