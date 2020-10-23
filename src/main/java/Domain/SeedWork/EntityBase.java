package Domain.SeedWork;

import java.util.ArrayList;
import java.util.List;

public class EntityBase {
    List<IDomainEvent> domainEvents;

    public void  AddDomainEvent(IDomainEvent domainEvent){
        this.domainEvents.add(domainEvent);
    }

    public List<IDomainEvent> GetDomainEvents(){
        return this.domainEvents;
    }

    public EntityBase()
    {
        this.domainEvents=new ArrayList<IDomainEvent>();
    }
}
