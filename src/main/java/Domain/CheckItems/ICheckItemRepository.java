package Domain.CheckItems;

import java.util.UUID;

public interface ICheckItemRepository {
    CheckItem GetById(UUID checkItemId);
}
