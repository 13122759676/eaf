package Application.CheckOrders.CreateCheckOrder;

import Api.CheckOrders.CheckOrderItemDto;

import java.util.List;
import java.util.UUID;

public class CreateCheckOrderCommand {
    private UUID doctorId;
    private UUID patientId;
    private UUID checkCategoryId;
    private List<CheckOrderItemData> checkOrderItemDataList;
    private String remark;

    public CreateCheckOrderCommand(UUID doctorId,
                                   UUID patientId,
                                   UUID checkCategoryId,
                                   List<CheckOrderItemData> checkOrderItemDataList,
                                   String remark){
        this.doctorId=doctorId;
        this.patientId=patientId;
        this.checkCategoryId=checkCategoryId;
        this.checkOrderItemDataList=checkOrderItemDataList;
        this.remark=remark;
    }

    public UUID getDoctorId() {
        return doctorId;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public UUID getCheckCategoryId() {
        return checkCategoryId;
    }

    public List<CheckOrderItemData> getCheckOrderItemDataList() {
        return checkOrderItemDataList;
    }

    public String getRemark() {
        return remark;
    }
}
