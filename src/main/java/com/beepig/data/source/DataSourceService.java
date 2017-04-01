package com.beepig.data.source;

import com.beepig.data.model.Staff;

/**
 * Created by beepi on 31/03/2017.
 */
public interface DataSourceService<T> {
    int save(T model);

    T findOne(Integer id);

    Iterable<T> findAll();

    void deleteOne(Integer id);

    void deleteAll();

    int update(Staff model);

}
