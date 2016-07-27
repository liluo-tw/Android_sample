package com.huawei.sirius.thinktank.meeting.calendar.interfaces;

import com.huawei.sirius.thinktank.data.model.MeetingEvent;
import com.huawei.sirius.thinktank.shared.interfaces.BasePresenter;

import java.util.Date;
import java.util.List;

public interface CalendarPresenter extends BasePresenter {
    public void back();
    public List<MeetingEvent> getEvents(Date fromDate, Date toDate);
    public void requestEvents(Date fromDate, Date toDate);

    public void select(MeetingEvent event);
}