package homework.h20241024.dao;

import java.util.List;

public interface IBaseDAO<T> {
    T getEntityById(int index);
    List<T> getEntities();

}
