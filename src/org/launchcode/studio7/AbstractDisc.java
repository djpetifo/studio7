package org.launchcode.studio7;

public abstract class AbstractDisc {

    private final String name;
    private final String contents;
    private final String discType;

    public AbstractDisc(String name, String contents, String discType) {
        this.name = name;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }
}
