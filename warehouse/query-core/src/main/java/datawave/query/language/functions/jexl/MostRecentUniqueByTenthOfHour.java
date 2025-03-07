package datawave.query.language.functions.jexl;

import java.util.ArrayList;

import datawave.query.jexl.functions.QueryFunctions;
import datawave.query.jexl.visitors.QueryOptionsFromQueryVisitor;
import datawave.query.language.functions.QueryFunction;

/**
 * Function to return a most recent_unique result for every tenth of an hour for a given list of fields. This function is equivalent to
 * {@code #MOST_RECENT_UNIQUE(field[TENTH_OF_HOUR])}.
 */
public class MostRecentUniqueByTenthOfHour extends UniqueByFunction {

    public MostRecentUniqueByTenthOfHour() {
        super(QueryFunctions.MOST_RECENT_PREFIX + QueryOptionsFromQueryVisitor.UniqueFunction.UNIQUE_BY_TENTH_OF_HOUR_FUNCTION, new ArrayList<>());
    }

    @Override
    public QueryFunction duplicate() {
        return new UniqueByTenthOfHour();
    }
}
