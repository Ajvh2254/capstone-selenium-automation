package capstonefactory.pages.NodeMenuEnums;

public enum NodeMenuEnums {

    EDIT("Edit"),
    CLICK("Click"),
    SELECT("Drop-Down"),
    ALERT("Dialog"),
    RADIO("Toggle"),
    WINDOW("Tabs"),
    ELEMENTS("Find Elements"),
    DRAG("AUI-1"),
    DROP("AUI-2"),
    SORT("AUI-3"),
    MULTI_SELECT("AUI-4"),
    WAITS("Timeout"),
    FORMS("All in One"),
    FILE("File Management");

    private final String nodes;

    NodeMenuEnums(String nodes) {
        this.nodes = nodes;
    }

    public String getNodes() {
        return nodes;
    }

}
