package capstonefactory.pages.NodeMenuEnums;

public enum NodeMenuEnums {

    EDIT("Edit"),
    CLICK("Click"),
    DROP_DOWN("Drop-Down"),
    ALERT("Dialog"),
    FRAME("Inner HTML"),
    RADIO("Toggle"),
    WINDOW("Tabs"),
    ELEMENTS("Find Elements"),
    DRAG("AUI-1"),
    DROP("AUI-2"),
    SORT("AUI-3"),
    MULTI_SELECT("AUI-4"),
    SLIDER("AUI-5"),
    TABLE("Simple Table"),
    WAITS("Timeout"),
    FORMS("All in One"),
    FILE("File Management"),
    SHADOW("DOM");

    private final String nodes;

    NodeMenuEnums(String nodes) {
        this.nodes = nodes;
    }

    public String getNodes() {
        return nodes;
    }

}
