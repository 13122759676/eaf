package Api.CheckOrders;

import java.util.UUID;

public class CheckOrderDto {
    private UUID CheckOrderId;

    public UUID getCheckOrderId() {
        return CheckOrderId;
    }

    public void setCheckOrderId(UUID checkOrderId) {
        CheckOrderId = checkOrderId;
    }
}
