package io.github.nowakprojects.androidarchitecturecomponents.domain.database.queries;

import static io.github.nowakprojects.androidarchitecturecomponents.domain.database.DatabaseNames.COLUMN_LOCAL_ID;

/**
 * Created by Mateusz on 27.09.2017.
 */

public class CommonQueriesParts {

    public static final String SELECT = " SELECT ";
    public static final String WHERE = " WHERE ";
    public static final String DELETE = " DELETE ";
    public static final String FROM = " FROM ";
    public static final String IS = " IS ";
    public static final String IN = " IN ";
    public static final String ALL = " * ";
    public static final String AND = " AND ";
    public static final String NOT = " NOT ";
    public static final String NULL = " NULL ";
    public static final String IS_NULL = IS + NULL;
    public static final String IS_NOT_NULL = IS + NOT + NULL;
    public static final String ORDER_BY = " ORDER BY ";
    public static final String ASCENDING = " ASC ";
    public static final String DESCENDING = " DESC ";
    public static final String SELECT_ALL_FROM = SELECT + ALL + FROM;
    public static final String LOCAL_ID_EQUALITY = COLUMN_LOCAL_ID + " = :localId ";
    public static final String USERNAME_EQUALITY = COLUMN_LOCAL_ID + " = :localId ";
    public static final String LOCAL_ID_IN = COLUMN_LOCAL_ID + IN + " (:localIds) ";
    public static final String LIMIT_1 = " LIMIT 1 ";
    public static final String TRUE = " 1 ";
    public static final String FALSE = " 0 ";
    public static final String LIKE = " LIKE ";
}
