package com.github.appreciated.app.layout.component;

import com.vaadin.server.Resource;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

public class AppBarButton extends Button {
    public AppBarButton(Resource icon) {
        super(icon);
        setWidth("64px");
        setHeight("64px");
        addStyleNames(ValoTheme.BUTTON_BORDERLESS, ValoTheme.BUTTON_ICON_ONLY);
    }

    public AppBarButton(Resource icon, ClickListener listener) {
        this(icon);
        addClickListener(listener);
    }
}
