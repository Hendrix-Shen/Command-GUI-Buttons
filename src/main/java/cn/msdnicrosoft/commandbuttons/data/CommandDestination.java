package cn.msdnicrosoft.commandbuttons.data;

import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;
import lombok.Getter;

public class CommandDestination extends WPlainPanel {
    @Getter
    WButton button = new WButton();

    public CommandDestination() {
        this.add(this.button, 0, 0, 75, 20);
    }
}