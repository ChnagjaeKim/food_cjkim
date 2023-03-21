package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepetd extends AbstractEvent {

    private Long id;
    private String orderId;
    private Double uv;
    private Long qty;
    private Boolean accept;

    public Accepetd(Cooking aggregate) {
        super(aggregate);
    }

    public Accepetd() {
        super();
    }
}
