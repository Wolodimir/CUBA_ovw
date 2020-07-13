package com.company.cuba.web.screens.session;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba.entity.Session;

@UiController("cuba_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
}