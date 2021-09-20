package entity;

import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
public enum DeviceTypes {
    PHONE("phone"),
    LAPTOP("laptop"),
    COMPUTER("computer"),
    TABLET("tablet");

    private String id;

    DeviceTypes(String id) {
        this.id = id;
    }

}
