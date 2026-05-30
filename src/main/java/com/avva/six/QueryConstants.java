package com.avva.six;

public enum QueryConstants {
    ;
    public static final String FIND_BY_FIRST_NAME = "select id, first_name, last_name, birth_date from SINGER where first_name = :first_name";
    public static final String NAMED_FIND_NAME = "select CONCAT(first_name , ' ' , last_name) from SINGER where id = :singerId";
    public static final String PARAMETRIZED_FIND_NAME = "select CONCAT(first_name , ' ' , last_name) from SINGER where id = ?";
    public static final String FIND_NAME = "select first_name, last_name from SINGER where id=";

    public static final String SIMPLE_INSERT = "insert into SINGER (first_name, last_name, birth_date) values (?, ?, ?)";
    public static final String SIMPLE_DELETE = "delete from SINGER where id=?";
    public static final String ALL_SELECT = "select * from SINGER";
    public static final String ALL_JOIN_SELECT = "select s.id, s.first_name, s.last_name, s.birth_date, "+
            "a.id AS album_id, a.title, a.release_date " +
            "from SINGER s " +
            "left join ALBUM a on s.id = a.singer_id";

    public static final String UPDATE_SINGER = "update SINGER set first_name=:first_name, last_name=:last_name, birth_date=:birth_date where id=:id";

    public static final String INSERT_SINGER = "insert into SINGER (first_name, last_name, birth_date) values (:first_name, :last_name, :birth_date)";

    public static final String INSERT_SINGER_ALBUM = "insert into ALBUM (singer_id, title, release_date) values (:singer_id, :title, :release_date)";
    public static final String FIND_SINGER_ALBUM = "SELECT s.id, s.first_name, s.last_name, s.birth_date" +
            ", a.id AS album_id, a.title, a.release_date FROM SINGER s " +
            "LEFT JOIN ALBUM a ON s.id = a.singer_id";
}
