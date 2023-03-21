package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodPicked extends AbstractEvent {

    private Long id;
    private String customerId;
    private String orderId;
    private String address;
}