package com.slack.api.app_backend.events.payload;

import com.slack.api.methods.response.apps.event.authorizations.AppsEventAuthorizationsListResponse;
import com.slack.api.model.event.Event;

import java.util.List;

/**
 * https://api.slack.com/types/event
 */
public interface EventsApiPayload<E extends Event> {

    String TYPE = "event_callback";

    // token

    String getToken();

    void setToken(String token);

    // teamId

    String getTeamId();

    void setTeamId(String teamId);

    // apiAppId

    String getApiAppId();

    void setApiAppId(String apiAppId);

    // event

    E getEvent();

    void setEvent(E event);

    // type

    String getType();

    void setType(String type);

    // eventId

    String getEventId();

    void setEventId(String eventId);

    // eventTime

    Integer getEventTime();

    void setEventTime(Integer eventTime);

    // eventContext

    String getEventContext();

    void setEventContext(String eventContext);

    // isExtSharedChannel

    boolean isExtSharedChannel();

    void setExtSharedChannel(boolean isExtSharedChannel);

    // authedUsers

    @Deprecated
    List<String> getAuthedUsers();

    @Deprecated
    void setAuthedUsers(List<String> authedUsers);

    // authedTeams

    @Deprecated
    List<String> getAuthedTeams();

    @Deprecated
    void setAuthedTeams(List<String> authedTeams);

    // authorizations

    List<Authorization> getAuthorizations();

    void setAuthorizations(List<Authorization> authorizations);

    // enterpriseId

    String getEnterpriseId();

    void setEnterpriseId(String enterpriseId);

}
