package com.company.cuba.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba.entity.Session;

@UiController("cuba_Session.edit")
@UiDescriptor("session-edit.xml")
@EditedEntityContainer("sessionDc")
@LoadDataBeforeShow
public class SessionEdit extends StandardEditor<Session> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Session> event) {
        event.getEntity().setDuration(1);
    }
}