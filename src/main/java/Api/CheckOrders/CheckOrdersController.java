package Api.CheckOrders;

import Application.CheckOrders.CheckOrderService;
import Application.CheckOrders.CreateCheckOrder.CheckOrderItemData;
import Application.CheckOrders.CreateCheckOrder.CreateCheckOrderCommand;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@EnableAutoConfiguration
public class CheckOrdersController {

    private CheckOrderService checkOrderService;

    public CheckOrdersController(){

    }

    @GetMapping("/CheckOrders")
    public  List<CheckOrderDto> GetCheckOrderList(){
        List<CheckOrderDto> checkOrdersDtoList= new ArrayList<CheckOrderDto>();
        CheckOrderDto item=new CheckOrderDto();
        item.setCheckOrderId(UUID.randomUUID());
        checkOrdersDtoList.add(item);
        return checkOrdersDtoList;
    }

    @PostMapping("/CheckOrders")
    public void CreateCheckOrder(@RequestBody CreateCheckOrderDto createCheckOrderRequest){

        List<CheckOrderItemData> checkOrderItemDataList=new ArrayList<CheckOrderItemData>();
        for(CheckOrderItemDto dto:createCheckOrderRequest.getCheckOrderItemDataList()){
            checkOrderItemDataList.add(new CheckOrderItemData(dto.getCheckItemId(),dto.getRemark()));
        }

        CreateCheckOrderCommand cmd=new CreateCheckOrderCommand(createCheckOrderRequest.getDoctorId(),
                createCheckOrderRequest.getPatientId(),
                createCheckOrderRequest.getCheckCategoryId(),
                checkOrderItemDataList,
                createCheckOrderRequest.getRemark());

        checkOrderService.Handle(cmd);
    }
}
