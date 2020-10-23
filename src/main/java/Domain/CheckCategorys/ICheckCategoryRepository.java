package Domain.CheckCategorys;

import java.util.UUID;

public interface ICheckCategoryRepository {
    CheckCategory GetById(UUID checkCategoryId);
}
