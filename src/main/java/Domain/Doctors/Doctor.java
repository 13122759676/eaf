package Domain.Doctors;

import Domain.SeedWork.EntityBase;

import java.util.UUID;

public class Doctor extends EntityBase {
    private UUID id;
    String code;
    String name;

    public UUID getId() {
        return id;
    }
}
