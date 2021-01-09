package guru.springframework.springrestclientexamples.api.model;

import guru.springframework.springrestclientexamples.api.model.enums.TimeZoneType;

import java.time.LocalDateTime;
import java.util.TimeZone;

public class ExpirationDate {

    private LocalDateTime date;
    private TimeZone timeZone;
    private TimeZoneType timeZoneType;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public TimeZoneType getTimeZoneType() {
        return timeZoneType;
    }

    public void setTimeZoneType(TimeZoneType timeZoneType) {
        this.timeZoneType = timeZoneType;
    }
}
