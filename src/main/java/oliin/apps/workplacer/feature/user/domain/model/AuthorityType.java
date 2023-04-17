package oliin.apps.workplacer.feature.user.domain.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.io.Serializable;

@Getter
public enum AuthorityType implements Serializable {
    OFFICE_MANAGER("office-manager"),
    FLOOR_MANAGER("floor-manager"),
    ROOM_MANAGER("room-manager"),
    EMPLOYEE("employee");

    AuthorityType(String json) {
        this.json = json;
    }

    @JsonValue
    final String json;

    @Override
    public String toString() {
        return "ROLE_" + super.toString();
    }
}