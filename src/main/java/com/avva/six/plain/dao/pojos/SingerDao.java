package com.avva.six.plain.dao.pojos;

import com.avva.six.plain.dao.CoreDao;
import com.avva.six.plain.pojos.Singer;

import java.util.Set;

public interface SingerDao extends CoreDao {
    Set<Singer> findAll();

    Set<Singer> findByFirstName(String firstName);

    String findNameById(Long id);

    String findLastNameById(Long id);

    String findFirstNameById(Long id);

    Singer insert(Singer singer);

    void update(Singer singer);

    void delete(Long singerId);

    Set<Singer> findAllWithAlbums();

    void insertWithAlbum(Singer singer);
}
