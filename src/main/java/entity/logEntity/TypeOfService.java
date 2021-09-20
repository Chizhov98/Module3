package entity.logEntity;

import lombok.Getter;

import javax.persistence.Column;

@Getter
public enum TypeOfService {
    INTERNET("internet"),
    CALLS("calls"),
    SMS("sms"),
    ORDER("new_order");

    @Column(name = "id")
    private String id;

    TypeOfService(String id) {
        this.id = id;
    }

}
