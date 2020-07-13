package com.company.cuba.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba.entity.Speaker;

@UiController("cuba_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
@LoadDataBeforeShow
public class SpeakerBrowse extends StandardLookup<Speaker> {
}