package com.company.cuba.web.screens.speaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cuba.entity.Speaker;

@UiController("cuba_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
@LoadDataBeforeShow
public class SpeakerEdit extends StandardEditor<Speaker> {
}