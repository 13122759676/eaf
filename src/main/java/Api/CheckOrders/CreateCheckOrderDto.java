package Api.CheckOrders;

import java.util.List;
import java.util.UUID;

public class CreateCheckOrderDto {
    private UUID doctorId;
    private UUID patientId;
    private UUID checkCategoryId;
    private List<CheckOrderItemDto> checkOrderItemDataList;
    private String remark;

    public UUID getDoctorId() {
        return doctorId;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public UUID getCheckCategoryId() {
        return checkCategoryId;
    }

    public List<CheckOrderItemDto> getCheckOrderItemDataList() {
        return checkOrderItemDataList;
    }

    public String getRemark() {
        return remark;
    }

    public void setDoctorId(UUID doctorId) {
        this.doctorId = doctorId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public void setCheckCategoryId(UUID checkCategoryId) {
        this.checkCategoryId = checkCategoryId;
    }

    public void setCheckOrderItemDataList(List<CheckOrderItemDto> checkOrderItemDataList) {
        this.checkOrderItemDataList = checkOrderItemDataList;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}